package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {
    /*
        Escribir un programa que lea números enteros entre 1 y 20 desde teclado. Se debe generar un histograma con
        las frecuencias de cada entero en la secuencia.  Para representar las barras del histograma hay que utilizar
        secuencias del carácter ‘*’. El programa finaliza al introducir un cero. Por ejemplo, la secuencia:
        1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3 generaría la
    */

    public static void main(String[] args) {
        int [] arrayNumeros = new int[5];
        rellenarArray(arrayNumeros);
        System.out.println(generarHistograma(arrayNumeros));
    }

    private static String generarHistograma(int[] array){
        String histograma= "";
        for (int i = 0; i <array.length ; i++) {
            histograma+= array[i]+":";
            for (int j = 0; j <array[i] ; j++) {
                histograma+="*";
            }
            histograma+="\n";
        }

        return histograma;
    }

    private static void rellenarArray(int [] arrayIntroducir){

        for (int i = 0; i <arrayIntroducir.length ; i++) {
            arrayIntroducir[i]=pedirNumeros();
        }
    }

    private static int pedirNumeros(){
        Scanner sc= new Scanner(System.in);
        boolean verifyInt=true;
        int numero=0;
        do{
            do {
                System.out.println("Introduce un numero:");
                verifyInt=true;
                try {
                    numero=sc.nextInt();
                }catch (InputMismatchException ime){
                    System.out.println("Introduce un numero!");
                    sc.nextLine();
                    verifyInt=!verifyInt;
                }
            }while (!verifyInt);
            if (numero<0 || numero>20){
                System.out.println("Introduce numero entre 0 y 20");
            }
        }while (numero<0 || numero>20);


        return numero;
    }
}
