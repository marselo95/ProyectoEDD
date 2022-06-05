/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosstructure;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Juan
 */
public class ArchivoSub {
    private String txt;
    private JFileChooser file;
    private int identificador = 0;
    

    /**
     * @return the txt
     */
    public String getTxt() {
        return txt;
    }

    /**
     * @param txt the txt to set
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }

    /**
     * @return the file
     */
    public JFileChooser getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(JFileChooser file) {
        this.file = file;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
}

