package Ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    //Escribe un programa que, dado un array de enteros de cualquier tamaño, busque si un número obtenido por
    //teclado se encuentra en el array e imprima la primera posición en la que se encuentra el número. Realiza
    //la búsqueda de un elemento:
    //a-implementando el método de búsqueda secuencial.
    //b-usando el método de búsqueda binaria de la clase Arrays.

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc= new Scanner(System.in);
        int[] array = new int[20];
        int numeroBusqueda=0;
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(array.length/2);
        }
        System.out.println("NORMAL\n"+Arrays.toString(array));
        boolean verificarInt=true;
        do {
            System.out.println("Numero que quieres buscar entre el 0 y 20:");
            verificarInt=true;
            try {
                numeroBusqueda=sc.nextInt();
            }catch (InputMismatchException ime) {
                System.out.println("Introduce un numero!");
                verificarInt=!verificarInt;
                sc.nextLine();
            }
        }while(!verificarInt);

        //SECUENCIAL
        int position=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==numeroBusqueda){
                position=i;
                break;
            } else{
                position=-1;
            }
        }
        String resultado=(position>=0)?"El numero se ha encontrado en la posicion ["+position+"]":"No esta el numero";
        System.out.println(resultado);

        //BINARY SEARCH
        Arrays.sort(array);
        System.out.println("OREDNADO\n"+Arrays.toString(array));
        position=Arrays.binarySearch(array,numeroBusqueda);
        resultado=(position>=0)?"El numero se ha encontrado en la posicion ["+position+"]":"No esta el numero";
        System.out.println(resultado);


    }
}
