
package manejoArchivos;

//crear archivo, guardar info, eleminar info y elminiar archivo.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo){
        //declarar objeto tipo file
        var archivo = new File (nombreArchivo); //para crear archivo 
        try {
            var salida = new PrintWriter (archivo); // para escribir
            //aqui ya esta creado el archivo
            salida.close();//cerrar el archivo
            System.out.println("Se ha creado el archivo");
            
        } catch (FileNotFoundException e) {// excepcion por si no encuentra
            // el archivo
            /*toda expresion susceptible de excepcion necesita
            el try/catch*/
            e.printStackTrace(System.out);
        }
        
        
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        // declaramos el archivo tipo file
        var archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
}
