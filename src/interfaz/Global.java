/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import grafosstructure.ArchivoSub;
import grafosstructure.Funciones;
import grafosstructure.Grafo;

/**
 *
 * @author Juan
 */
public class Global {
    private static Grafo matriz = null;
    private static ArchivoSub archivo;
    private static int pendientes = 0;

    /**
     * @return the matriz
     */
    public static Grafo getMatriz() {
        return matriz;
    }

    /**
     * @param aMatriz the matriz to set
     */
    public static void setMatriz(Grafo aMatriz) {
        matriz = aMatriz;
    }

    public static ArchivoSub getArchivo() {
        return archivo;
    }

    public static void setArchivo(ArchivoSub archivo) {
        Global.archivo = archivo;
    }

    /**
     * @return the pendientes
     */
    public static int getPendientes() {
        return pendientes;
    }

    /**
     * @param aPendientes the pendientes to set
     */
    public static void setPendientes(int aPendientes) {
        pendientes = aPendientes;
    }
    
}

