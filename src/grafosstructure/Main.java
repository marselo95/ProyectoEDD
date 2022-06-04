package grafosstructure;

import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import grafosstructure.ArchivoSub;
import interfaz.Global;

public class Main {

    public static void main(String[] args) throws Exception {
        Funciones fun = new Funciones();
//        MatrizAdy matriz;

//        MatrizAdy matriz = fun.readTxt();
        
        ArchivoSub archivo = fun.openTxt();
        String txt = archivo.getTxt();
        MatrizAdy matriz = fun.uploadGrafo(archivo);
        
        Lista productos = new Lista();
        Nodo prod = new Nodo("Laptop",10);
        productos.insert(prod);
//        System.out.println(archivo.getFile().getSelectedFile());
        
        matriz.newVertice("F", productos);
        matriz.newEdge("A", "F", 28);
        fun.WriteTxt(matriz, archivo);
        
//        Graph graph = fun.Graphic(matriz);
//        System.setProperty("org.graphstream.ui", "swing");
//        graph.display();
//        matriz.showMat();


//        matriz.showMat();
//        System.out.println("\n" + "Visitas con dfs:" + "\n");
//        
//////        Lista visitados = matriz.dfs(matriz, "A");
//////        JOptionPane.showMessageDialog(null, visitados.printProductos());
        
//        JOptionPane.showMessageDialog(null, visitados.printRecorrido());


//        ArchivoSub archivo = fun.openTxt();
//        String txt = archivo.getTxt();
//        MatrizAdy matriz = fun.uploadGrafo(txt);
//        System.out.println(archivo.getFile().getCurrentDirectory());
//////        Graph graph = fun.Graphic(matriz);
//////      
//////        System.setProperty("org.graphstream.ui", "swing");
//////        graph.display();
       
//        GUI v = new GUI();
//        v.setVisible(true);

        

    }

}
