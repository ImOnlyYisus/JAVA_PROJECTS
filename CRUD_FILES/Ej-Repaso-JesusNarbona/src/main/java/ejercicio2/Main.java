package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<RegistroJSON> notas =LecturaJSON.leerArchivoJSON1("./calificacionesGrupo.json");
        notas.forEach(System.out::println);
    }
}
