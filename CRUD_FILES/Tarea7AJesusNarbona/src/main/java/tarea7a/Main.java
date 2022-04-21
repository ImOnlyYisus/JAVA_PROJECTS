package tarea7a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de objetos de tipo Persona, leyendo los datos de un archivo de texto
        ArrayList<Empleado> empleados = ReadCvsEmpleados.leerArchivo();

        System.out.println("TOTAL PROFESORES: "+ empleados.size());
        empleados.forEach(System.out::println);

        //Escritura de archivo con los datos de la lista
        EscrituraProfesDept.escritura(empleados);
        EscrituraEmp100dias.escritura(empleados);


    }
}
