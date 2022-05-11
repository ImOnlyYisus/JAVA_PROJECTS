package tarea7a;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de objetos de tipo Persona, leyendo los datos de un archivo de texto
        ArrayList<Empleado> empleados = ReadCvsEmpleados.leerArchivo();

        System.out.println("TOTAL PROFESORES: " + empleados.size());
        empleados.forEach(System.out::println);

        //Escritura de archivo con los datos de la lista
        EscrituraProfesDept.escritura(empleados);
        EscrituraEmp100dias.escritura(empleados);

        //Metodos de stream
        //A partir de una lista de empleados y un nombre, indique si hay algún empleado con ese nombre.
        boolean estaEmpleado = empleados.stream()
                .anyMatch(empleado -> empleado.getNombre().equalsIgnoreCase("Ana"));
        System.out.println(estaEmpleado);

        //A partir de una lista de empleados y un nombre de departamento, indique el número de empleados Coordinadores de ese departamento.
        long numeroEmpleados = empleados.stream()
                .filter(empleado -> empleado.getPuesto().equalsIgnoreCase("prueba"))
                .filter(Empleado::isCoordinador)
                .count();
        System.out.println(numeroEmpleados);

        //A partir de una lista de empleados y una letra del NIF (char), obtener una nueva lista ordenada alfabéticamente SOLO con los apellidos
        // de los empleados cuyo NIF contenga esa letra.
        List<String> listaOrdenadaApellidos = empleados.stream()
                .filter(empleado -> empleado.getDni().contains(String.valueOf('c').toUpperCase(Locale.ROOT)))
                .map(Empleado::getApellido)
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
        listaOrdenadaApellidos.forEach(System.out::println);

        //A partir de una lista de empleados y una fecha, obtener una nueva lista con los NIF (ordenados de forma inversa) de todos los empleados cuya
        //toma de posesión coincida con esa fecha.
        List<String> listaInversaDni = empleados.stream()
                .filter(empleado -> empleado.getFechaToma().equals(LocalDate.of(2020,9,1)))
                .map(Empleado::getDni)
                .sorted((empleado1, empleado2) -> empleado2.compareToIgnoreCase(empleado1))
                .collect(Collectors.toList());
        listaInversaDni.forEach(System.out::println);
    }
}
