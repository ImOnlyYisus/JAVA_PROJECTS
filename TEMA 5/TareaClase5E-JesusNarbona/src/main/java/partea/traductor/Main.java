package partea.traductor;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Traducutor diccionario = new Traducutor();

        diccionario.introducirPalabra("Hello","Hola");
        diccionario.introducirPalabra("How","Como");
        diccionario.introducirPalabra("When","Cuando");
        diccionario.introducirPalabra("Find","Buscar");
        diccionario.introducirPalabra("Fix","Arreglar");

        diccionario.imprimirValores();

        diccionario.quitarPalabra("Hello");
        System.out.println();
        diccionario.imprimirValores();

        System.out.println();
        diccionario.modificarPalabra("When","Modificacion");
        diccionario.imprimirValores();

        System.out.println();
        Set<String> listaIngles = diccionario.devolverPalabrasIngles();
        Set<String> listaEspañol = diccionario.devolverPalabrasEspañol();

        listaIngles.forEach(valores-> {
            System.out.print(""+valores);
            System.out.println();
        });
        listaEspañol.forEach(valores-> {
            System.out.print(""+valores);
            System.out.println();
        });
    }
}
