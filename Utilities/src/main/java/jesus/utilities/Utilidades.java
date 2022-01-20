package jesus.utilities;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {
    //Constructor
    public Utilidades (){

    }

    //Metodos creados
    public int generarIntAleatorioRangos(int rangoIncio, int rangoFinal){
        Random rd = new Random();
        int aux = 0;

        if(rangoIncio>rangoFinal){
            aux = rangoIncio;
            rangoIncio = rangoFinal;
            rangoFinal = aux;
        }
        return (rd.nextInt(rangoFinal - rangoIncio +1) +rangoIncio);
    }

    public int leerDatosInt(){
        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = true;
        int numero = 0;
        do{
            esCorrecto = true;
            try{
                System.out.println("Introduzca un numero entero:");
                numero = sc.nextInt();
            }catch (InputMismatchException ime){
                System.out.println("No es correcto!");
                esCorrecto = !esCorrecto;
            }

        }while (!esCorrecto);

        return numero;
    }

    //Copiar Arrays
    public static int[] copiarArray(int[] arrayNumeros){ //Entero
        int[] copia= new int[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            copia[i]=arrayNumeros[i];
        }
        return copia;
    }

    public static double[] copiarArray(double[] arrayNumeros){ //Double
        double[] copia= new double[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            copia[i]=arrayNumeros[i];
        }
        return copia;
    }

    public static String[] copiarArray(String[] arrayNumeros){ //String
        String[] copia= new String[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            copia[i]=arrayNumeros[i];
        }
        return copia;
    }

    public static Object[] copiarArray(Object[] arrayNumeros){ //Object
        Object[] copia= new Object[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            copia[i]=arrayNumeros[i];
        }
        return copia;
    }
}
