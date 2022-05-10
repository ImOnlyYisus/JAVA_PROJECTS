package ejercicio3;

import ejercicio2.LecturaJSON;
import ejercicio2.RegistroJSON;

import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<RegistroJSON> notas = LecturaJSON.leerArchivoJSON1("calificacionesGrupo.json");
        List<Alumnado> alumnos = RegistroToAlumnado.registroToAlumnado(notas);

        alumnos.forEach(System.out::println);

    }
}
