package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
    //Realizar un programa que lea de la entrada un número y utilice ese número para crear un array de enteros de ese tamaño. A continuación, el programa
    //inicializa el array con los valores que el usuario introduzca por teclado. Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’
    //como indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:

    public static void main(String[] args) {
        int[] array= new int[pedirNumero()];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Dale valor al indice ["+i+"]:");
            array[i]=pedirNumero();
        }

        //Imprimir numero de *
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i] ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static int pedirNumero(){
        Scanner sc= new Scanner(System.in);
        boolean isCorrect=true;
        int numero=0;

        do {
            System.out.println("Introduza un numero:");
            try {
                numero=sc.nextInt();
            }catch (InputMismatchException ime){
                System.out.println("Introduce un numero!");
                isCorrect=false;
                sc.nextLine();
            }
        }while (!isCorrect);
        return numero;
    }
}
