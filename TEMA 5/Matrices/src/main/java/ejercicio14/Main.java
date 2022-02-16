package ejercicio14;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:
            Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
            Calcular la media de todos los valores
            Calcular el valor mínimo y el máximo de todos los valores
         */
        int[][] matrizEjemplo = new int[3][3];
        rellenarRandomMatriz(matrizEjemplo);
        imprimirMatriz(matrizEjemplo);

        System.out.println("Media: "+calcularMedia(matrizEjemplo));

        System.out.println("Maximo:"+maximoMinimo(matrizEjemplo)[0]);
        System.out.println("Minimo:"+maximoMinimo(matrizEjemplo)[1]);

    }

    public static void rellenarRandomMatriz(int[][] matriz){ //entre 1 y 100
        Random rd = new Random();

        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                matriz[i][j]= rd.nextInt(100)+1;
            }
        }
    }

    public static int calcularMedia(int[][] matriz){
        int total= 0;
        int contador=0;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                total+=matriz[i][j];
                contador++;
            }
        }

        int media = total/contador;
        return media;
    }

    public static int[] maximoMinimo(int[][] matriz){
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                if(matriz[i][j]>maximo){
                    maximo=matriz[i][j];
                }
                if(matriz[i][j]<minimo){
                    minimo=matriz[i][j];
                }
            }
        }
        int[] maximoMinimo = {maximo,minimo};

        return maximoMinimo;
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
