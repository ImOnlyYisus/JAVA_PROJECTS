package ejercicio1;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,String> mapModulos = LecturaCSV.leerCsv("./nombresModulos.csv",";");
        mapModulos.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
