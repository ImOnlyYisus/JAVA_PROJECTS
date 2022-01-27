package Ejercicios;

import java.util.Arrays;

public class Ejercicio09 {
    /*
    En el programa del ejercicio 4, incluir un método llamado ordenarBubble(int[] arrayOrdenar) para ordenar el array que se le pase, usando el método bubble
    sort que hay en los apuntes.
     */
    public static void main(String[] args) {
        int[] array={3,5,2,10,6,2,7};
        System.out.println("SIN ORDEN\n"+Arrays.toString(array));
        ordenarBubble(array);
        System.out.println("BUBBLE SORT\n"+Arrays.toString(array));
    }
    private static void ordenarBubble(int[] arrayOrdenar){
        int tmp=0;
        for (int i = 0; i <arrayOrdenar.length ; i++) {
            for (int j = i+1; j <arrayOrdenar.length ; j++) {
                if(arrayOrdenar[i]>arrayOrdenar[j]){
                    tmp=arrayOrdenar[i];
                    arrayOrdenar[i]=arrayOrdenar[j];
                    arrayOrdenar[j]=tmp;
                }
            }
        }
    }
}
