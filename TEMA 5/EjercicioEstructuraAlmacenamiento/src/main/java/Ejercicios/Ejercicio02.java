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

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas hay:");
        int numeroPersonas = Math.abs(sc.nextInt());
        int contadoresPersonasMayorMedia = 0;
        int contadoresPersonasMenorMedia = 0;

        double[] alturaPersona = new double[numeroPersonas];
        double alturaPersonaTotal = 0;
        double media = 0;
        boolean verificar = true;
        for (int i = 0; i < alturaPersona.length; i++) {
            do {
                verificar = true;
                try {
                    System.out.println("Introduce altura persona[" + i + "]");
                    alturaPersona[i] = sc.nextDouble();

                } catch (NumberFormatException nfe){
                    System.out.println("Introduce un numero!");
                    sc.nextLine();
                    verificar=!verificar;
                }
            } while (!verificar || alturaPersona[i]==0);

            alturaPersonaTotal += Math.abs(alturaPersona[i]);
        }
        media = alturaPersonaTotal / alturaPersona.length;


        for (int i = 0; i < alturaPersona.length; i++) {
            if (alturaPersona[i] > media) {
                contadoresPersonasMayorMedia++;
            }

            if (alturaPersona[i] < media) {
                contadoresPersonasMenorMedia++;
            }
        }

        System.out.println("La altura media es:" + media);
        System.out.println("Personas mayor a la media: " + contadoresPersonasMayorMedia);
        System.out.println("Personas menor a la media: " + contadoresPersonasMenorMedia);


    }
}
