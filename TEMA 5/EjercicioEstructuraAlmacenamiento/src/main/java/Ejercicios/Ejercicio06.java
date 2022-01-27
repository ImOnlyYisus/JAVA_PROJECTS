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

        int[] arr4={1,2,2};

        //API JAVA
        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println(Arrays.toString(arr3)+"\n"+Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr3,arr2));

        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr4));
        System.out.println(Arrays.equals(arr1,arr4));

        //Recursiva
        boolean isEqual=true;

        if(arr1.length==arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }else{
            isEqual=false;
        }

        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        System.out.println(isEqual);

        isEqual=true;

        if(arr3.length==arr2.length){
            for (int i = 0; i < arr3.length ; i++) {

                    if(arr3[i]!=arr2[i]){
                        isEqual=false;
                        break;
                    }

            }
        }else{
            isEqual=false;
        }

        System.out.println(Arrays.toString(arr3)+"\n"+Arrays.toString(arr2));
        System.out.println(isEqual);

        isEqual=true;
        if(arr1.length==arr4.length){
            for (int i = 0; i < arr1.length ; i++) {
                if(arr4[i]!=arr1[i]){
                    isEqual=false;
                    break;
                }
            }
        }else{
            isEqual=false;
        }

        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr4));
        System.out.println(isEqual);

    }
}
