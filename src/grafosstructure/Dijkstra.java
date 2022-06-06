/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosstructure;

/**
 *
 * @author Liz
 */
public class Dijkstra {
    private final int [][] Pesos;
    private final int [] ultimo;
    private final int [] D;
    private final boolean [] F;
    private final int s;
    private final int n;

    public Dijkstra(Grafo gp, int origen) {
        n = gp.getNumVerts();   // numero de vertices
        s = origen;             // vertice origen
        Pesos = gp.matAd;       // Matriz de Adyacencia (pesos)
        ultimo = new int [n];   // ultimo vertice en el camino
        D = new int [n];        // Coste minimo
        F = new boolean [n];    // conjunto de vertices
    }
    
    public void caminoMinimos() {
        for (int i = 0; i < n; i++) {
            F[i] = false;
            D[i] = Pesos[s][i];
            ultimo[i] = s;
        }
        F[s] = true;
        D[s] = 0;
        for (int i = 1; i < n; i++){
            int v = minimo();
            F[v] = true;
            for (int w = 1; w < n; w++){
                if (!F[w]){
                    if ((D[v] + Pesos[v][w]) < D[w]){
                        D[w] = D[v] + Pesos[v][w];
                        ultimo[w] = v;
                    }
                }
            }
        }
    }
    private int minimo(){
        int mx = 99999999;
        int v = 1;
        for (int j = 1; j < n; j++) {
            if (!F[j] && (D[j] <= mx)){
                mx = D[j];
                v = j;
            }
        }
        return v;
    }
    public void recuperarCamino(int v){
        int anterior = ultimo[v];
        if (v != s) {
            recuperarCamino(anterior);
            System.out.print(" -> V" + v);
        } else {
            System.out.print("V" + s);
        }
    }    
}
