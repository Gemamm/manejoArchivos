
package manejoArchivos;

//crear archivo, guardar info, eleminar info y elminiar archivo.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println("Se ha escrito el contenido en el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
        public static void agregarArchivo(String nombreArchivo, String contenido){
        //Declaramos obj tipo File
        File archivo = new File(nombreArchivo);
        try {//filewriter para anexar info y no sobreecribir
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true));//true xa que anaxe info
            salida.println(contenido);//agregar contenido
            salida.close();
            System.out.println("Se ha agregado el contenido en el archivo");
        } catch (FileNotFoundException e) { 
            e.printStackTrace(System.out);
        }catch(IOException e){ // escepciones de lectura/escritura
            e.printStackTrace(System.out);
        }
    }
        public static void leerArchivo(String nombreArchivo){
            var archivo = new File(nombreArchivo);
            try {
                //bufered reader solo lee una linea
                //filereader lee varias lineas
                //la convinacion de sistemas para leer todo
                
                //descriptor de tipo lectura
                var entrada  = new BufferedReader(new FileReader(archivo));
                var lectura = entrada.readLine(); //leer la linea
                while (lectura != null){ //para recorrer las lienas mientras haya
                    //mostramos cada linea
                    System.out.println("lectura = " + lectura);
                    //avanzamos en la lectura
                    lectura = entrada.readLine();
                }
                entrada.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
            } catch (IOException  e){
                
            }
        }
}
