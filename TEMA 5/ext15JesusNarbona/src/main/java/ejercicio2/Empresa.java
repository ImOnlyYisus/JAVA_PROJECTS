package ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import ejercicio1.Trabajador;

public class Empresa {
    private ArrayList<Trabajador> listaTrabajadores;
    private String nombre;
    private String cif;

    //Constructor
    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        listaTrabajadores = new ArrayList<>();
    }

    //Imprime datos de la empresa y sus trabajadores
    public void imprimir() {
        System.out.println(this.nombre + " - " + this.cif);
        listaTrabajadores.forEach(System.out::println);
    }

    //Metodo que añade un trabajador
    public void contratar(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
    }

    //Metodo que borra un trabajador
    public boolean despedir(Trabajador trabajador) {
        return listaTrabajadores.remove(trabajador);
    }

    public int[] buscarTodosNombre(String nombre) {
        ArrayList<Integer> listaBuscado = new ArrayList<>();
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            if (nombre.equalsIgnoreCase(listaTrabajadores.get(i).getNombre())) {
                listaBuscado.add(i);
            }
        }
        if (!listaBuscado.isEmpty()) {
            int[] devolverIndices = new int[listaBuscado.size()];

            for (int i = 0; i < listaBuscado.size(); i++) {
                devolverIndices[i] = listaBuscado.get(i);
            }
            return devolverIndices;
        }

        return null;
    }

    //Metodo que ordena por el nombre
    public void ordenarNombre() {
        Comparator<Trabajador> criterioNombre = (nombre1, nombre2) -> nombre1.getNombre().compareToIgnoreCase(nombre2.getNombre());
        listaTrabajadores.sort(criterioNombre);
    }

    //Metodo para buscar el primer trabajador, devuelve el indice de la posicion en la que se encuentra
    //Si no esta devuelve -1
    public int buscarNombre(Trabajador trabajador) {
        ordenarNombre(); //Ordeno, por si no lo esta previamente

        return Collections.binarySearch(listaTrabajadores, trabajador);
    }
}
