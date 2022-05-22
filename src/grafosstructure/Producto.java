package grafosstructure;


public class Producto {
    private Object name;
    private Object exist;

    public Producto(String name, int exist) {
        this.name = name;
        this.exist = exist;
    }
    
    public Producto(){
        
    }

  
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.setName(name);
    }

    /**
     * @return the exist
     */
    public Object getExist() {
        return exist;
    }

    /**
     * @param exist the exist to set
     */
    public void setExist(int exist) {
        this.setExist((Object) exist);
    }

    /**
     * @return the name
     */
    public Object getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Object name) {
        this.name = name;
    }

    /**
     * @param exist the exist to set
     */
    public void setExist(Object exist) {
        this.exist = exist;
    }
    
    
}
