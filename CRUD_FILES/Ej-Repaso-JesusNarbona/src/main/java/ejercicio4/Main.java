package ejercicio4;

import ejercicio1.LecturaCSV;
import ejercicio2.LecturaJSON;
import ejercicio2.RegistroJSON;
import ejercicio3.Alumnado;
import ejercicio3.RegistroToAlumnado;

import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,String> mapModulos = LecturaCSV.leerCsv("./nombresModulos.csv",";");
        List<RegistroJSON> notas = LecturaJSON.leerArchivoJSON1("calificacionesGrupo.json");
        List<Alumnado> alumnos = RegistroToAlumnado.registroToAlumnado(notas);
        Alumnado delia = alumnos.stream().filter(a -> a.getNombre().contains("Delia")).findFirst().get();

        AlumnadoToCsv.alumnadoToCsv(delia,mapModulos);
    }
}
