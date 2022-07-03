package dpcolombia;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author Cristian Quintero
 */
public class Archivo {

    //El metodo static no se necesita instanciar
    public static BufferedReader abrirArchivo(String nombreArchivo) {
        //Instancia de objeto archivo
        File f = new File(nombreArchivo);

        //Verificar si existe el archivo
        if (f.exists()) {
            try {
                //Instancia del objeto lector de archivo
                FileReader fr = new FileReader(f);
                //Abrir el archivo y retornar su contenido
                return new BufferedReader(fr);
            } catch (Exception ex) {

            }
        }

        return null;

    }

    public static void cargarImagen(JLabel lbl, String nombreArchivo) {

        //Instancia de objeto archivo
        File f = new File(nombreArchivo);

        //Verificar si existe el archivo
        if (f.exists()) {
            ImageIcon img = new ImageIcon(nombreArchivo);
            lbl.setIcon(img);
        } else {
            lbl.setIcon(null);
        }
    }
}
