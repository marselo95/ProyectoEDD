package grafosstructure;

import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;

public class Main {

    public static void main(String[] args) throws Exception {
        Funciones fun = new Funciones();
//        MatrizAdy matriz;

        MatrizAdy matriz = fun.readTxt();

//        matriz.showMat();
//        System.out.println("\n" + "Visitas con dfs:" + "\n");
//        
        Lista visitados = matriz.dfs(matriz, "A");
        JOptionPane.showMessageDialog(null, visitados.printProductosDfs());
        
//        JOptionPane.showMessageDialog(null, visitados.printRecorrido());


        
//////        String txt = fun.openTxt();
//////        matriz = fun.uploadGrafo(txt);
//////        Graph graph = fun.Graphic(matriz);
//////      
//////        System.setProperty("org.graphstream.ui", "swing");
//////        graph.display();
       
//        GUI v = new GUI();
//        v.setVisible(true);

        

    }

}
