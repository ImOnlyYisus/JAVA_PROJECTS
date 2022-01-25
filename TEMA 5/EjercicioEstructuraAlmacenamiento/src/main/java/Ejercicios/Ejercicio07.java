package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        int tamañoArrays= tamañoArrays();
        int[] primerArray = new int[tamañoArrays];
        int[] segundoArray = new int[tamañoArrays];

        inicializaConAleatorios(primerArray);
        inicializaConAleatorios(segundoArray);

        imprimirValoresArray(multiplicarValores(primerArray,segundoArray));



    }

    //Lectura por teclado de tamaño de array
    private static int tamañoArrays(){
        Scanner sc= new Scanner(System.in);
        int tamaño=0;
        boolean numeroCorrecto=true;
        do {
            numeroCorrecto=true;
            System.out.println("Dime el tamaño de los dos arrays");
                    try{
                        tamaño=sc.nextInt();
                    }catch (NumberFormatException nfe){
                        numeroCorrecto=!numeroCorrecto;
                        System.out.println("Introduce un numero!");
                    }

        }while (!numeroCorrecto);
        return tamaño;
    }

    //Inicializa los arrays con numeros aleatorios
    private static void inicializaConAleatorios(int[] array){
        Random rd = new Random();

        for (int i = 0; i <array.length ; i++) {
            array[i]=(rd.nextInt(101));
        }
    }

    //Imprime por pantalla los valores del array
    private static void imprimirValoresArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Indice ["+i+"] --> "+array[i]);
        }
    }

    //Multiplica dos arrays y devuelve el resultado en un nuevo array
    private static int[] multiplicarValores(int[] primerArray, int[] segundoArray){
        int[] multiplicados = new int[primerArray.length];

        for (int i = 0; i <primerArray.length ; i++) {
            multiplicados[i]=(primerArray[i]*segundoArray[i]);
        }

        return multiplicados;
    }
}
