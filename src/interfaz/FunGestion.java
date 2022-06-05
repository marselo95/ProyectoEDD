/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import grafosstructure.Lista;
import grafosstructure.MatrizAdy;
import grafosstructure.Nodo;

/**
 *
 * @author Juan
 */
public class FunGestion {

    public void modificarInventario(int cantidad, Nodo producto, int opcion) {
        if (opcion == 1) {
            producto.setExistencias(producto.getExistencias() + cantidad);
        } else {
            producto.setExistencias(producto.getExistencias() - cantidad);
        }
    }

    public MatrizAdy modificarExistencias(Lista productos, String producto, int cantidad, int opcion, MatrizAdy matriz) {
        Nodo aux = productos.getpFirst();
        while (aux != null) {
            if (producto.equals(aux.getNombre().toLowerCase())) {
                if (opcion == 1) {
                    aux.setExistencias(aux.getExistencias() + cantidad);
                } else {
                    aux.setExistencias(aux.getExistencias() - cantidad);
                }
                return matriz;
            }
            aux = aux.getNext();
        }
        return null;
    }
}
