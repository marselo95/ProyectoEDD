/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import grafosstructure.Lista;
import grafosstructure.Grafo;
import grafosstructure.Nodo;
import grafosstructure.Vertice;
import javax.swing.JOptionPane;

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

    public Grafo modificarExistencias(Lista productos, String producto, int cantidad, int opcion, Grafo matriz) {
        Nodo aux = productos.getpFirst();
        while (aux != null) {
            if (producto.equals(aux.getNombre().toLowerCase())) {
                if (opcion == 1) {
                    aux.setExistencias(aux.getExistencias() + cantidad);
                } else {
                    if (cantidad > aux.getExistencias()) {
                        aux.setExistencias(0);
                        int pend = cantidad - aux.getExistencias();
                        Global.setPendientes(pend);
                        JOptionPane.showMessageDialog(null, "Existencias insuficientes, solicitando a otro almacen");
                    } else {
                        aux.setExistencias(aux.getExistencias() - cantidad);
                    }
                }
                return matriz;
            }
            aux = aux.getNext();
        }
        return null;
    }

    public Lista almacenesDisponibles(Vertice[] vertices, String producto, String almacen) {
        Lista almacenesProducto = new Lista();
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getName().toUpperCase().equals(almacen)) {
                continue;
            }
            Lista productos = vertices[i].getData();
            Nodo aux = productos.getpFirst();
            while (aux != null) {
                if (producto.equals(aux.getNombre().toLowerCase())) {
                    almacenesProducto.insert(aux);
                }
            }

        }
        return almacenesProducto;
    }
}
