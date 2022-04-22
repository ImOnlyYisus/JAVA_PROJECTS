package tarea7a;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Utils {
    //A partir de una lista de empleados y un nombre, indique si hay algún empleado con ese nombre.
    public static boolean buscarEmpleadoNombre(ArrayList<Empleado> empleados, String nombre) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    //A partir de una lista de empleados y un nombre de departamento, indique el número de empleados Coordinadores de ese departamento.
    public static int empleadosCoordinadoresDept(ArrayList<Empleado> empleados, String deptNombre) {
        int cont = 0;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getPuesto().equalsIgnoreCase(deptNombre) && empleados.get(i).isCoordinador()) {
                cont++;

            }
        }

        return cont;
    }

    //A partir de una lista de empleados y una letra del NIF (char), obtener una nueva lista ordenada alfabéticamente SOLO con los apellidos de los empleados
    //cuyo NIF contenga esa letra.
    public static ArrayList<String> listaAlfabeticaApellidoNif(ArrayList<Empleado> empleados, char letra) {
        ArrayList<String> listaNombres = new ArrayList<>();

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getDni().contains(String.valueOf(letra)) || empleados.get(i).getDni().contains(String.valueOf(letra).toUpperCase())) {
                listaNombres.add(empleados.get(i).getApellido());
            }
        }

        Collections.sort(listaNombres);
        return listaNombres;
    }

    //A partir de una lista de empleados y una fecha, obtener una nueva lista con los NIF (ordenados de forma inversa) de todos los empleados cuya toma de posesión
    //coincida con esa fecha.
    public static ArrayList<String> obtenerListaFecha(ArrayList<Empleado> empleados, LocalDate fechaPosesion) {
        ArrayList<String> listaDni = new ArrayList<>();

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getFechaToma().equals(fechaPosesion)) {
                listaDni.add(empleados.get(i).getDni());
            }
        }

        Collections.sort(listaDni);
        Collections.reverse(listaDni);
        return listaDni;
    }
}
