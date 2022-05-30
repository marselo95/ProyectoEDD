package grafosstructure;

import org.graphstream.graph.Graph;

public class Main {

    public static void main(String[] args) throws Exception {
        Funciones fun = new Funciones();

        MatrizAdy matriz = fun.readTxt();
//        String txt = fun.openTxt();
//        matriz = fun.uploadGrafo(txt);
        Graph graph = fun.Graphic(matriz);
        
        System.setProperty("org.graphstream.ui", "swing");
        graph.display();
//       
//        GUI v = new GUI();
//        v.setVisible(true);
        

    }

}
