package Ejercicios;
import Ejercicio20.Libro;
import Ejercicio20.ListaLibros;

import java.sql.SQLOutput;

public class Ejercicio20 {
    public static void main(String[] args) {
        ListaLibros catalogo = new ListaLibros();
        ListaLibros catalogo2 = new ListaLibros();
        catalogo.insertarLibro(new Libro("12313","EL QUIJOTE","SANTILLANA",100,25.5));
        catalogo.insertarLibro(new Libro("123132","EL QUIJOTE","SANTILLANA",100,25.5));
        catalogo.insertarLibro(new Libro("123134","EL QUIJOTE","SANTILLANA",100,22.6));
        catalogo2.insertarLibro(new Libro("11334","EL QUIJOTE 2","PLANETA",200,25.5));

        catalogo.imprimirLista();
        catalogo2.imprimirLista();
        System.out.println("Tamaño catalogo: "+catalogo.getNumeroLibros());
        System.out.println(catalogo.buscarLibro("12313"));

        if (!catalogo.buscarLibro(25.5).isEmpty()) {
            catalogo.buscarLibro(25.5).forEach((e) -> System.out.println("[" + e + "]"));
        } else {
            System.out.println("No hay libros con ese precio");
        }
    }
}
