package Ejercicios;

import java.util.Arrays;

public class Ejercicio06 {
    //Hacer un programa que determine si dos arrays son iguales. Probarlo con los arrays [1,2,3] y [1,2,3],
    //[1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. Este ejercicio hay que hacerlo de dos formas: la primera, usando
    //la clase Arrays; la segunda, creando un método que vaya comparando los valores de los arrays y devuelva
    //true si todos son iguales o false en caso contrario.

    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};

        int[] arr3={1,2,3,4};

        int[] arr5={1,2,2};

        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println(Arrays.toString(arr3)+"\n"+Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr3,arr2));

        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
