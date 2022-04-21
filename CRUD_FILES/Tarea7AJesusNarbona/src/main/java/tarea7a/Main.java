package tarea7a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = ReadCvsEmpleados.leerArchivo();

        System.out.println("TOTAL PROFESORES: "+ empleados.size());
        empleados.forEach(System.out::println);

        EscrituraProfesDept.escritura(empleados);
        EscrituraEmp100dias.escritura(empleados);


    }
}
