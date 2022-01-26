package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {
    public static void main(String[] args) {
        Random rd= new Random();

        double[] primerArray= new double[20];

        Arrays.fill(primerArray, 7.5);

        double[] copiaArray = Arrays.copyOf(primerArray, primerArray.length);
        System.out.println(primerArray.hashCode());
        for (int i = 0; i <primerArray.length ; i++) {
            System.out.println(primerArray[i]);
        }

        System.out.println(copiaArray.hashCode());
        for (int i = 0; i <copiaArray.length ; i++) {
            System.out.println(copiaArray[i]);
        }
        System.out.println(Arrays.equals(primerArray,copiaArray));

        primerArray[rd.nextInt(primerArray.length)]=6.3;
        for (int i = 0; i <primerArray.length ; i++) {
            System.out.println(primerArray[i]);
        }
        System.out.println(Arrays.equals(primerArray,copiaArray));

    }
}
