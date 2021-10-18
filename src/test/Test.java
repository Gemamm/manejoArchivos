
package test;

import static manejoArchivos.ManejoArchivos.*;


public class Test {
    public static void main(String[] args) {
        var nombreArchivo = "Asignatura.txt";
        var contenido1 = "Desarrolo de aplicaciones multiplatafomra";
        crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, contenido1);
        agregarArchivo(nombreArchivo, contenido1);
        agregarArchivo(nombreArchivo, "Empresa");
        agregarArchivo(nombreArchivo, "Ingles");
        agregarArchivo(nombreArchivo, "RRHH");
        
        leerArchivo(nombreArchivo);
    }
}
