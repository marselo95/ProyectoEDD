package grafosstructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import grafosstructure.ArchivoSub;

public class Funciones {

    public MatrizAdy readTxt(ArchivoSub archivo) {
        String line;
        String txt = "";
        String path = "test\\av.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + "\n";
                    }
                }
                archivo.setTxt(txt);
                var a = uploadGrafo(archivo);
                return a;
            }
        } catch (Exception err) {
            return null;
        }
        return null;
    }

    public ArchivoSub openTxt() {
        String aux = "";
        ArchivoSub archivo = new ArchivoSub();
        String txt = "";
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File abrir = file.getSelectedFile();
            archivo.setFile(file);
            if (abrir != null) {
                FileReader fr = new FileReader(abrir);
                BufferedReader br = new BufferedReader(fr);
                while ((aux = br.readLine()) != null) {
                    txt += aux + "\n";
                }
                br.close();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        archivo.setTxt(txt);
        return archivo;
    }

    public MatrizAdy uploadGrafo(ArchivoSub archivo) {
        MatrizAdy matriz = new MatrizAdy();
        String txt = archivo.getTxt();
        try {

            if (!"".equals(txt) && !txt.isEmpty()) {
                String[] txtSplit = txt.split("Rutas;");

                for (int i = 0; i < txtSplit.length; i++) {

                    if (txtSplit[i].contains(";") && !txt.isEmpty()) {
                        String[] almacenes = txtSplit[i].split(";");
                        for (int j = 0; j < almacenes.length; j++) {
                            if (almacenes[j].contains(":")) {
                                Lista lista = new Lista();
                                String[] almacen = almacenes[j].split("\n");
                                for (int k = 0; k < almacen.length; k++) {

                                    if (k > 1) {
                                        String[] productos = almacen[k].split(",");

                                        Nodo nodo = new Nodo(productos[0], Integer.parseInt(productos[1]));
                                        lista.insert(nodo);
                                    }

                                }
                                String[] a = almacen[1].split(" ");
                                String b = a[1].replace(":", "");
                                matriz.newVertice(b, lista);

                            }

                        }
                    }
                }
                String[] rutas = txtSplit[1].split("\n");
                for (int i = 0; i < rutas.length; i++) {
                    if (i > 0) {
                        String[] ruta = rutas[i].split(",");

                        matriz.newEdge(ruta[0], ruta[1], Integer.parseInt(ruta[2]));
                    }
                }

            }

            return matriz;
        } catch (Exception err) {
            archivo.setIdentificador(1);
            JOptionPane.showMessageDialog(null, "Error al leer archivo, cargando datos por defecto");
            var a = this.readTxt(archivo);
            return a;
        }
    }

    public Graph Graphic(MatrizAdy matriz) {
        String styleSheet = "node { stroke-mode: plain; fill-color: purple;shape: circle;size-mode: fit;text-size:22.5; padding: 8px, 12px;}edge {padding: 8px, 12px; arrow-shape: arrow; text-size:18; arrow-size: 6px, 6px;}";

        Graph graph = new SingleGraph("Grafo", false, true);
        graph.setAttribute("ui.stylesheet", styleSheet);
        for (int i = 0; i < matriz.getNumVerts(); i++) {
            graph.addNode(matriz.verts[i].getName()).setAttribute("ui.label", "Almacen " + matriz.verts[i].getName());
            graph.getNode(i).setAttribute("ui.style", "text-alignment:left;");
        }
        int aux = 0;
        for (int i = 0; i < matriz.getMatAd().length; i++) {
            for (int j = 0; j < matriz.getMatAd()[i].length; j++) {
                if (matriz.getMatAd()[i][j] != 0) {
                    graph.addEdge(matriz.verts[i].getName() + matriz.verts[j].getName(), graph.getNode(i), graph.getNode(j), true);
                    graph.getEdge(aux).setAttribute("ui.label", Integer.toString(matriz.getMatAd()[i][j]));
                    graph.getEdge(aux).setAttribute("ui.style", "text-alignment:center;");
                    aux++;
                }
            }

        }
        return graph;
    }

    public void WriteTxt(MatrizAdy matriz, ArchivoSub archivo) {
        String grafoActualizado = "";
        Lista visitados = matriz.bfs(matriz, "A");

        if (matriz.getNumVerts() != 0) {
            //acceder matady y escribir txt
            grafoActualizado += "Almacenes;";
            for (int i = 0; i < visitados.getSize(); i++) {
                grafoActualizado += "\n" + "Almacen" + " " + matriz.verts[i].getName() + ":";
                Lista productos = matriz.verts[i].getData();
                grafoActualizado += this.printProductos(productos);
            }
            grafoActualizado += "\n" + "Rutas;";
            int[][] matAdy = matriz.matAd;
            for (int i = 0; i < visitados.getSize(); i++) {
                for (int j = 0; j < visitados.getSize(); j++) {
                    if (matAdy[i][j] != 0) {
                        //escribir la ruta
                        grafoActualizado += "\n" + matriz.verts[i].getName() + "," + matriz.verts[j].getName() + "," + matAdy[i][j];
                    }
                }
            }
        }
        try {
            if (archivo.getIdentificador() == 1) {
                PrintWriter pw = new PrintWriter("test\\av.txt");
                pw.print(grafoActualizado);
                pw.close();
                JOptionPane.showMessageDialog(null, "La informacion se ha guardado con éxito");
            } else {
                PrintWriter pw = new PrintWriter(archivo.getFile().getSelectedFile());
                pw.print(grafoActualizado);
                pw.close();
                JOptionPane.showMessageDialog(null, "La informacion se ha guardado con éxito");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al guardar la informacion");
        }
    }

    public String printProductos(Lista productos) {
        String aux = "";
        if (!productos.itsEmpty()) {
            Nodo nodoAux = productos.getpFirst();
            while (nodoAux != null) {
                aux += "\n" + nodoAux.getNombre() + "," + nodoAux.getExistencias();
                nodoAux = nodoAux.getNext();
            }
            aux += ";";
            return aux;
        }
        return "";
    }

}
