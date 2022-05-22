package grafosstructure;

public class ColaLista {
    NodoCola pFirst, pLast;
    int size;
    
    public ColaLista(){
        pFirst = pLast = null;
        size =0;
    }
    
    public boolean itsEmpty(){
        return pFirst == null;
    }
    
    public void insert(int element){
        NodoCola nodo = new NodoCola(element);
        if(itsEmpty()){
            pFirst = nodo;
        }else{
            pLast.next = nodo;
        }
        pLast = nodo;
        size++; 
    }
    
    public int delete(){
        int aux = pFirst.dato;
        pFirst = pFirst.next;
        size--;
        return aux;
    }
}
