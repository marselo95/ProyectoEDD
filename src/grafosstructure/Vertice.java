/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosstructure;

public class Vertice {

    private String name;
    private Lista data;
    private int numVertice;
    private boolean fueVisitado;

    public Vertice(String name) {
        this.name = name;
        this.data = new Lista();
        numVertice = -1;
        this.fueVisitado = false;
    }
    
    public Vertice(String name, Lista data) {
        this.name = name;
        this.data = data;
        numVertice = -1;
        this.fueVisitado = false;
    }
    

    public boolean equals(Vertice n) {
        return getName().equals(n.getName());
    }
    
    public String toString(){
        return this.getName() + " (" + this.getNumVertice() + ")";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numVertice
     */
    public int getNumVertice() {
        return numVertice;
    }

    /**
     * @param numVertice the numVertice to set
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    /**
     * @return the data
     */
    public Lista getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Lista data) {
        this.data = data;
    }

    /**
     * @param fueVisitado the fueVisitado to set
     */
    public void setFueVisitado(boolean fueVisitado) {
        this.fueVisitado = fueVisitado;
    }

    /**
     * @return the fueVisitado
     */
    public boolean isFueVisitado() {
        return fueVisitado;
    }

}

