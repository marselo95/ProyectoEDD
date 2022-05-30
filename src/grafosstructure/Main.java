package grafosstructure;

public class Main {

    public static void main(String[] args) throws Exception {
        
        funciones fun = new funciones();
        MatrizAdy matriz = fun.readTxt();
        matriz.showMat();
        System.out.println("");
        matriz.bfs(matriz, "A");
        System.out.println("\n" + "Visitas con dfs:" + "\n");
        matriz.dfs(matriz, "A");
        
        
//        Producto producto = new Producto("Monitor", 15);
//        Producto producto2 = new Producto("Celular", 4);
//        Producto producto3 = new Producto("Memoria", 20);
//        Producto producto4 = new Producto("Silla", 3);
//        Producto producto5 = new Producto("Tablet", 25);
//        
//        Lista lista = new Lista();
//               
//        
//        matriz.newVertice("Almacen A", lista);
//        matriz.newVertice("Almacen B", lista);
//        matriz.newVertice("Almacen C", lista);
//        matriz.newVertice("Almacen D", lista);
//        matriz.newVertice("Almacen E", lista);
//        
//        matriz.newEdge("Almacen A", "Almacen B",10);
//        matriz.newEdge("Almacen A", "Almacen C",20);       
//        matriz.newEdge("Almacen B", "Almacen C",5);
//        matriz.newEdge("Almacen B", "Almacen D",8);
//        matriz.newEdge("Almacen C", "Almacen D",4);
//        matriz.newEdge("Almacen C", "Almacen E",13);
//        matriz.newEdge("Almacen D", "Almacen E",3);
//        matriz.newEdge("Almacen E", "Almacen A",25);
//
//
//        matriz.showMat();
//        System.out.println("");
//        
//        matriz.bfsP(matriz, "Almacen B");
//        
        
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//        }
//
    }

}
