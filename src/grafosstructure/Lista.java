package grafosstructure;


public class Lista {
     private Nodo pFirst;
    private Nodo pLast;
    private int size;
    
    public Lista(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean itsEmpty(){
        return this.getpFirst() == null;
    }
    
    public void empty(){
        setpFirst(null);
        setpLast(null);
        setSize(0);
    }
    
    public void insert(Nodo data){
        if(itsEmpty()){
            this.setpFirst(data);
            this.setpLast(data);
        }else{
            this.getpLast().setNext(data);
            this.setpLast(data);
        }
        size++;
    }
    
    public void print(){
        if(!itsEmpty()){
            Nodo nodoAux = this.getpFirst();
            while(nodoAux != null){
                System.out.println(nodoAux.getNombre()+" " + nodoAux.getExistencias());
                nodoAux = nodoAux.getNext();
            }
        }
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
}
