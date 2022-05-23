package grafosstructure;

public class MatrizAdy {

    private int numVerts;
    static int maxVerts = 5;
    Vertice[] verts;
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
        for (int[] matAd1 : matAd) {
            for (int j = 0; j < matAd1.length; j++) {
                System.out.print(" " + matAd1[j] + " ");
            }
            System.out.println("");
        }
    }

    public int[] bfs(MatrizAdy mat, String name) {
        int w, v;
        int clave = 100;
        int[] m;
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
                System.out.println("Almacen " + mat.verts[w] + " Visitado");
//            var a = mat.verts[w].getData().print();
                mat.verts[w].getData().print();
//            System.out.println(mat.verts[w].getName());
//            System.out.println(a);
                for (int u = 0; u < mat.getNumVerts(); u++) {
                    if ((mat.matAd[w][u] != 0) && (m[u] == clave)) {
                        m[u] = m[w] + 1;
                        cola.insert(u);
                    }
                }
            }
            return m;

        }

    }

    public void bfsP(MatrizAdy mat, String name) {
        int w, v;
        int clave = 100;
        int[] m;
        v = mat.numVertice(name);
        if (v < 0) {
            System.out.println("El vertice no existe");

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
                System.out.println("Vertice " + mat.verts[w] + " Visitado");
                var a = mat.verts[w].getData();
                System.out.println(a);
                for (int u = 0; u < mat.getNumVerts(); u++) {
                    if ((mat.matAd[w][u] != 0) && (m[u] == clave)) {
                        m[u] = m[w] + 1;
                        cola.insert(u);
                    }
                }
            }
        }
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
            return matAd[va][vb] != 0;
        }

    }

    /**
     * @return the numVerts
     */
    public int getNumVerts() {
        return numVerts;
    }

}
