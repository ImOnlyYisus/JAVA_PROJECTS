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
        System.out.println(Arrays.toString(primerArray));

        System.out.println(copiaArray.hashCode());
        System.out.println(Arrays.toString(copiaArray));
        System.out.println(Arrays.equals(primerArray,copiaArray));

        primerArray[rd.nextInt(primerArray.length)]=6.3;
        System.out.println(Arrays.toString(primerArray));
        System.out.println(Arrays.equals(primerArray,copiaArray));

    }
}
