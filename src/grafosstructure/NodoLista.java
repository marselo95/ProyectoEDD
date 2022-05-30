package grafosstructure;

public class NodoLista {
    private Vertice v;
    private NodoLista nextL;

    public NodoLista(Vertice v) {
        this.v = v;
        this.nextL = null;
    }

    /**
     * @return the v
     */
    public Vertice getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Vertice v) {
        this.v = v;
    }

    /**
     * @return the next
     */
    public NodoLista getNextL() {
        return nextL;
    }

    /**
     * @param next the next to set
     */
    public void setNextL(NodoLista next) {
        this.nextL = next;
    }
    
    
}
