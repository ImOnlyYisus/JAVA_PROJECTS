package ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Declara e inicializa una matriz de caracteres de 2x3, con los valores que tú quieras. Implementa un
        método, en la misma clase que el método main(), que reciba una matriz de caracteres y la imprima por
        consola.
         */

        int[][] matrizEjemplo = new int[2][3];
        introducirValores(matrizEjemplo);
        imprimirMatriz(matrizEjemplo);
    }

    public static void introducirValores(int[][] matriz) {
        boolean verficarInt = true;
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                do {
                    verficarInt = true;
                    System.out.println("Introduce un numero en la posicion[" + i + j +"]");
                    try {
                        numero = sc.nextInt();
                        matriz[i][j]=numero;
                    } catch (NumberFormatException nfe) {
                        System.out.println("No es un numero");
                        sc.nextLine();
                        verficarInt = false;
                    }
                } while (!verficarInt);
            }
        }

    }

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
