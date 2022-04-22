package tarea7a;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de objetos de tipo Persona, leyendo los datos de un archivo de texto
        ArrayList<Empleado> empleados = ReadCvsEmpleados.leerArchivo();

        System.out.println("TOTAL PROFESORES: " + empleados.size());
        empleados.forEach(System.out::println);

        //Escritura de archivo con los datos de la lista
        EscrituraProfesDept.escritura(empleados);
        EscrituraEmp100dias.escritura(empleados);

        //Metodos de la clase Utils
        System.out.println(Utils.buscarEmpleadoNombre(empleados, "Mario"));

        ArrayList<String> listaApellidosDNI = Utils.listaAlfabeticaApellidoNif(empleados,'c');
        listaApellidosDNI.forEach(System.out::println);

        int numeroCoordinadores = Utils.empleadosCoordinadoresDept(empleados, "prueba");
        System.out.println("Numeros de coordinadores en prueba --> " + numeroCoordinadores);

        ArrayList<String> listaFecha = Utils.obtenerListaFecha(empleados, LocalDate.of(2020,9,1));
        listaFecha.forEach(System.out::println);
    }
}
