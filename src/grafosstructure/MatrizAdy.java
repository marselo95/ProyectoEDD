package grafosstructure;

import javax.swing.JOptionPane;

public class MatrizAdy {

    private int numVerts;
    static int maxVerts = 12;
    public Vertice[] verts;
    int[][] matAd;

    public MatrizAdy() {
        this(maxVerts);
    }

    public MatrizAdy(int mx) {
        this.matAd = new int[mx][mx];
        this.verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                this.matAd[i][j] = 0;
            }
        }
        this.numVerts = 0;
    }

    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < this.getNumVerts()) && !encontrado;) {
            encontrado = verts[i].equals(v);

            if (!encontrado) {
                i++;
            }
        }
        return (i < getNumVerts()) ? i : -1;
    }

    public void newVertice(String nom, Lista data) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom, data);
            v.setNumVertice(getNumVerts());
            verts[numVerts++] = v;

        } else {
            System.out.println("El vertice ya existe");
        }
    }

    public void newEdge(String a, String b, int peso) {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            System.out.println("El Vertice no existe");
        } else {
            this.matAd[va][vb] = peso;
        }

    }

    public void showMat() {
        for (int[] matAd1 : getMatAd()) {
            for (int j = 0; j < matAd1.length; j++) {
                System.out.print(" " + matAd1[j] + " ");
            }
            System.out.println("");
        }
    }

    public Lista bfs(MatrizAdy mat, String name) {
        int w, v;
        int clave = 100;
        int[] m;
        Lista a = new Lista();
        v = mat.numVertice(name);
        if (v < 0) {
            System.out.println("El vertice no existe");
            return null;
        } else {
            ColaLista cola = new ColaLista();
            m = new int[mat.getNumVerts()];
            for (int i = 0; i < mat.getNumVerts(); i++) {
                m[i] = clave;
            }
            m[v] = 0;
            cola.insert(v);

            while (!cola.itsEmpty()) {
                Integer cw;
                cw = cola.delete();
                w = cw;
                NodoLista nodo = new NodoLista(mat.verts[w]);
                a.insertL(nodo);
                for (int u = 0; u < mat.getNumVerts(); u++) {
                    if ((mat.getMatAd()[w][u] != 0) && (m[u] == clave) && (mat.verts[w] != null)) {
                        m[u] = m[w] + 1;
                        cola.insert(u);
                    }
                }
            }
            return a;
        }
    }

    public Lista dfs(MatrizAdy mat, String name) {
        Lista vis = new Lista();
        int v = mat.numVertice(name);
        
        if (v < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
            return vis;
        } else {
            mat.verts[v].setFueVisitado(true);
//            NodoLista nodo = new NodoLista(mat.verts[v]);
//            vis.insertL(nodo);

            int u = mat.getVerticeNoVisitado(v);
            if ((u != -1) && (!mat.verts[u].isFueVisitado())) {
                dfs(mat, (String) mat.verts[u].getName());

//                Lista vis = new Lista();
//                NodoLista nodo = new NodoLista(mat.verts[v]);
//                vis.insertL(nodo);
            }

            for (int i = 0; i < mat.numVerts; i++) {
                if (mat.verts[i].isFueVisitado()) {
                    NodoLista nodo = new NodoLista(mat.verts[i]);
                    vis.insertL(nodo);
                }

            }
//            for (int i = 0; i < mat.numVerts; i++) {
//                mat.verts[i].setFueVisitado(false);
//            }
            return vis;
        }
    }

    public int getVerticeNoVisitado(int v) {
        for (int j = 0; j < getNumVerts(); j++) {
            if ((matAd[v][j] != 0) && (!verts[j].isFueVisitado())) {
                return j;
            }
        }
        return -1;
    }

    public boolean adyacente(String a, String b) {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            System.out.println("El vertice no existe");
            return false;
        } else {
            return getMatAd()[va][vb] != 0;
        }
    }

    /**
     * @return the numVerts
     */
    public int getNumVerts() {
        return numVerts;
    }

    public int[][] getMatAd() {
        return matAd;
    }

}
