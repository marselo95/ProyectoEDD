package grafosstructure;

import org.graphstream.graph.Graph;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

public class Main {

    public static void main(String[] args) throws Exception {
        Funciones fun = new Funciones();
        String txt = fun.openTxt();
        MatrizAdy matriz = fun.uploadGrafo(txt);
        Graph graph = fun.Graphic(matriz);
        System.setProperty("org.graphstream.ui", "swing");

        graph.setAutoCreate(true);
        graph.setStrict(false);
        graph.display();
//        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
//        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        
    }

}
