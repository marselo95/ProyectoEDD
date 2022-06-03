package grafosstructure;

public class Producto {
    private String nombre;
    private int existencias;
    private Producto next;
    
    public Producto(String name, int exist){
        this.nombre = name;
        this.existencias = exist;
        this.next = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    /**
     * @return the next
     */
    public Producto getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Producto next) {
        this.next = next;
    }
}
