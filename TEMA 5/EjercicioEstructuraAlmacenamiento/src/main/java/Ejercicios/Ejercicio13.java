package Ejercicios;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
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
        int [] numeroSolicitados = numerosSolicitados();
        System.out.println(generarHistograma(numeroSolicitados));
    }

    private static String generarHistograma(int[] array){
        String histograma= "";
        int [] posibilidades = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int [] contadoresVeces = new int[posibilidades.length];

        for (int i = 0; i <posibilidades.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(posibilidades[i]==array[j]){
                    contadoresVeces[i]++;
                }
            }
        }


        for (int i = 0; i <posibilidades.length ; i++) {
            histograma+=posibilidades[i]+":";
            for (int j = 0; j <contadoresVeces[i] ; j++) {
                histograma+="*";
            }
            histograma+="\n";
        }

        return histograma;
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

    private static int[] numerosSolicitados(){
        int numero=0;
        String cadenaNumeros="";
        do{
            numero=pedirNumeros();
            cadenaNumeros+=numero;
        }while (numero!=0);

        int [] arrayNumeros = new int[cadenaNumeros.length()];
        for (int i = 0; i <arrayNumeros.length ; i++) {
            arrayNumeros[i]=Integer.valueOf(cadenaNumeros.charAt(i));
        }
        System.out.println(Arrays.toString(arrayNumeros));
        return arrayNumeros;
    }
}
