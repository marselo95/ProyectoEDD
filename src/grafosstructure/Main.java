package grafosstructure;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Funciones fun = new Funciones();
//        MatrizAdy matriz = fun.readTxt();
          var txt = fun.openTxt();
//         System.out.println(txt);
          MatrizAdy matriz = fun.uploadGrafo(txt);
          matriz.bfs(matriz, "X");
//        matriz.showMat();
//        System.out.println("");
//        matriz.bfs(matriz, "C");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
       
    }

}
