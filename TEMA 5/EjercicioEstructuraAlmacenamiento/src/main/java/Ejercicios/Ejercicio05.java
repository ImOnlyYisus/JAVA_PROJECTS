package Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    /*
    Implementa un programa que guarde en un array 10 números enteros que se leen por teclado. A continuación se recorre el array y calcula el número
    total de positivos, de negativos y de ceros. Calcula y muestra la media aritmética de los valores positivos y la de los valores negativos del array.
    Implementar métodos para:
        -Leer valores por teclado y almacenarlos en el array. Se le pasará el array como parámetro y no devolverá nada.
        -Contar positivos, se le pasará el array como parámetro y devolverá el número de positivos almacenados en el array.
        -Contar negativos, se le pasará el array como parámetro y devolverá el número de negativos almacenados en el array.
        -Contar ceros, se le pasará el array como parámetro y devolverá el número de ceros almacenados en el array.
        -Mostrar array, se le pasará el array como parámetro y no devolverá nada, sólo imprimirá por pantalla el array.
        -Calcular media positivos, se le pasará el array como parámetro y no devolverá nada, sólo imprimirá por pantalla la media
        aritmética de los positivos.
        -Calcular media negativos, se le pasará el array como parámetro y no devolverá nada, sólo imprimirá por pantalla la media
        aritmética de los negativos.

     */
    public static void main(String[] args) {
        int[] arrayNumeros= new int[10];

        for (int i = 0; i <arrayNumeros.length ; i++) {
            arrayNumeros[i]=leerNumeros();
        }
    }

    private static int leerNumeros() {
        Scanner sc = new Scanner(System.in);
        int devolver = 0;
        boolean verificarNumero = true;
        do {
            System.out.println("Introduce un numero");
            verificarNumero = true;
            try {
                devolver=sc.nextInt();
            } catch (NumberFormatException nfe) {
                System.out.println("Introduce un numero entero");
                verificarNumero = !verificarNumero;
            }
        } while (!verificarNumero);

        return devolver;
    }

    private static int[] contarPositivosNegativosCeros(int[] arrayNumeros){
        int[] positivosNegativosCeros = new int[3]; //[0]positivos [1]negativos [2]cero

        for (int i = 0; i <arrayNumeros.length ; i++) {
            if(arrayNumeros[i]==0){
                positivosNegativosCeros[2]++;
            }
            else if(arrayNumeros[i]>0){
                positivosNegativosCeros[0]++;
            }
            else{
                positivosNegativosCeros[1]++;
            }
        }
        return positivosNegativosCeros;
    }

    private static void mostrarArray(int[] arrayNumeros){
        for (int i = 0; i <arrayNumeros.length ; i++) {
            System.out.printf(arrayNumeros[i]+"\t");
        }
    }

    private static void mediaAritmeticaPositivos(int [] arrayNumeros){
        System.out.println((contarPositivosNegativosCeros(arrayNumeros)[0]/arrayNumeros.length));
    }

    private static void mediaAritmeticaNegativos(int [] arrayNumeros){
        System.out.println((contarPositivosNegativosCeros(arrayNumeros)[1]/arrayNumeros.length));
    }
}
