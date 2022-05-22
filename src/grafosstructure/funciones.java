package grafosstructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class funciones {

//    List al = new List();
    MatrizAdy matriz = new MatrizAdy();

    public MatrizAdy readTxt() {
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
                if (!"".equals(txt) && !txt.isEmpty()) {
                    String[] txtSplit = txt.split("Rutas;");
                    // rutas
//                    System.out.println(txtSplit[1]);

                    for (int i = 0; i < txtSplit.length; i++) {
//                        System.out.println(txtSplit[i]);
                        if (txtSplit[i].contains(";") && !txt.isEmpty()) {
                            String[] almacenes = txtSplit[i].split(";");
                            for (int j = 0; j < almacenes.length; j++) {
                                if (almacenes[j].contains(":")) {
                                    Lista lista = new Lista();
                                    String[] almacen = almacenes[j].split("\n");
                                    for (int k = 0; k < almacen.length; k++) {
//                                        if (k == 1) {
////                                            System.out.println(almacen[1]);
//                                        }
                                        if (k > 1) {
                                            String[] productos = almacen[k].split(",");

                                            Nodo nodo = new Nodo(productos[0], Integer.parseInt(productos[1]));
                                            lista.insert(nodo);
                                        }

                                    }
//                                    lista.print();
//                                    System.out.println(almacen[1]);
                                    String[] a = almacen[1].split(" ");
                                    String b = a[1].replace(":", "");
//                                    System.out.println(b);
//                                    System.out.println(a[1]);
                                    matriz.newVertice(b, lista);
//                                    matriz.bfs(matriz, "B");
                                    
//                                    lista.print();

                                }
                                

                            }
                        }
                    }
                    String[] rutas = txtSplit[1].split("\n");
                    for (int i = 0; i < rutas.length; i++) {
                        if(i>0){
                            String[] ruta = rutas[i].split(",");
                            matriz.newEdge(ruta[0], ruta[1], Integer.parseInt(ruta[2]));
                        }
                    }
                }
//                matriz.bfs(matriz, "B");
            }
            return matriz;
//            al.print();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al leer");
            return null;
        }
        

    }
    
   

}
