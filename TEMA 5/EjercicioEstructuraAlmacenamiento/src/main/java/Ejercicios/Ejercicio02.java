package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Escribe un programa para leer la altura de un número determinado de personas y calcular la
        //altura media. El número de personas se pide por teclado y debe ser entero un entero mayor que cero.
        //Posteriormente el programa irá pidiendo la altura, en cm, de cada una de las personas y las guardará
        //en una estructura de almacenamiento. Si la altura leída no es positiva, el programa la pasará a
        //número positivo. También es necesario saber cuántas personas tienen una altura superior a la media
        //e inferior a la media.

        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantas personas hay:");
        int numeroPersonas= Math.abs(sc.nextInt());

        double[] alturaPersona= new double[numeroPersonas];
        double alturaPersonaTotal=0;

        for (int i = 0; i <alturaPersona.length ; i++) {
            System.out.println("Introduce altura persona["+i+"]");
            alturaPersona[i]=sc.nextDouble();
            alturaPersonaTotal+=alturaPersona[i];
        }

        System.out.println("La altura media es:" + (alturaPersonaTotal/alturaPersona.length));



    }
}
