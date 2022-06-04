package grafosstructure;

public class Lista {

    private Nodo pFirst;
    private Nodo pLast;
    private int size;
    private NodoLista first;
    private NodoLista last;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean itsEmpty() {
        return this.getpFirst() == null;
    }

    public boolean itsEmptyL() {
        return this.getFirst() == null;
    }

    public void empty() {
        setpFirst(null);
        setpLast(null);
        setSize(0);
    }

    public void insert(Nodo data) {
        if (itsEmpty()) {
            this.setpFirst(data);
            this.setpLast(data);
        } else {
            this.getpLast().setNext(data);
            this.setpLast(data);
        }
        setSize(getSize() + 1);
    }

    public void insertL(NodoLista data) {
        if (itsEmptyL()) {
            this.setFirst(data);
            this.setLast(data);
        } else {
            this.getLast().setNextL(data);
            this.setLast(data);
        }
        setSize(getSize() + 1);
    }

    public String print() {
        String aux = "";
        if (!itsEmpty()) {
            Nodo nodoAux = this.getpFirst();
            while (nodoAux != null) {
                aux += nodoAux.getNombre() + " " + nodoAux.getExistencias() + "\n";
                nodoAux = nodoAux.getNext();
            }
            return aux;
        }
        return "";
    }

    public String printProductos() {
        String aux = "";

        NodoLista nodoAux = this.getFirst();
        while (nodoAux != null) {
            aux += "Almacen" + " " + nodoAux.getV().getName() + ":" + "\n" + nodoAux.getV().getData().print() + "\n";
            nodoAux = nodoAux.getNextL();
        }
        return aux;
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the first
     */
    public NodoLista getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(NodoLista first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public NodoLista getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoLista last) {
        this.last = last;
    }
}
