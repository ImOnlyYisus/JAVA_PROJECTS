package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LecturaCSV {
    public static TreeMap<String,String> leerCsv(String nombre, String separador) {
        TreeMap<String,String> datos = new TreeMap<>();

        try (Scanner sc = new Scanner(new File(nombre),"WINDOWS-1252")) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll(" ", "");
                linea = linea.replaceAll("\"", "");

                String[] datosLinea = linea.split(separador);

                datos.put(datosLinea[0],datosLinea[1]);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }
}
