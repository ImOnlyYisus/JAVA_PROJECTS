package Ejercicios;
import Ejercicio22.ClaseEj22;

import java.util.ArrayList;

public class Ejercicio22 {
    /*

    Crear una clase que contenga como atributo una lista (ArrayList) de números enteros Integer.  Además
    tendrá los siguientes métodos:

    Generar lista, que genera una lista de números aleatorios en el intervalo [10 : 100].
    Imprimir la lista de números generados.
    Imprimir la suma de los números pares.
    Imprimir la cantidad de números impares.
    Devolver el elemento mayor.
    Devolver el elemento menor.
    Obtener el tamaño de la lista.
    Borrar un elemento de la lista, según su posición.
    Borrar un elemento de la lista, según su valor. Si hay varios, los borra todos.
    Modificar un elemento de la lista, según su posición

     */

    public static void main(String[] args) {
        ClaseEj22 listaInteger = new ClaseEj22(10);
        ArrayList<Integer> listaEnteros = listaInteger.getLista();
        listaInteger.imprimirValores();

        System.out.println("\nSuma pares:"+listaInteger.imprimirSumaPar());
        System.out.println("Contador impares:"+listaInteger.imprimirSumaImpar());
        System.out.println("N.MAYOR:"+ listaInteger.devolverElementoMayor());
        System.out.println("N.MENOR:"+ listaInteger.devolverElementoMenor());
        System.out.println("TAMAÑO LISTA:"+listaInteger.tamañoDeLista());
        listaInteger.borrarPosicion(3);
        listaInteger.imprimirValores();
        System.out.println("\n");
        Integer num= 3;
        listaInteger.borrarSegunElValor(num);
        listaInteger.imprimirValores();
        System.out.println("\n");
        listaInteger.modificarSegunPosicion(1,50);
        listaInteger.imprimirValores();



    }
}
