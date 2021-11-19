package NumPrimos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args) {
        /*

            1- Solicitar al usuario 2 opciones, el numero si lo quiere meter por teclado o si lo quiere que lo genere aleatoriamente.
               El rango para calcular el numero primo va a estar 2 y 600_000_000

            2- Algoritmo de fuerza bruta.
               Si el numero n es par no es primo, menos 2 que es primo
               Si es impar recorrer rango de impares desde 3 hasta n/2
            Pruebas: 52682367, 131071, 524287, 907, 911, 919, 929;

        */

        //CONSTANTES
        final int NUMERO_MIN=2;
        final int NUMERO_MAX=600_000_000;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String option="";
        int numero = 0;

        do {
            System.out.println("1.Si quieres introducir los numeros, 2.Si quieres que se genere aleatoriamente o SALIR");
            option = sc.nextLine();
            option= option.toUpperCase();

            switch (option){
                case "1":

                    boolean comprobarNumero = true;
                    do{
                        comprobarNumero = true;
                        try{
                            System.out.println("Introduzca un numero (2-600M):");
                            numero = sc.nextInt();

                        }catch (InputMismatchException ime){
                            System.out.println("Introduce un numero!");
                            sc.nextLine();
                            comprobarNumero = !comprobarNumero;
                        }
                    }while (!comprobarNumero);
                    sc.nextLine();
                    break;
                case "2":
                    numero = rd.nextInt(NUMERO_MAX-NUMERO_MIN+1)+NUMERO_MIN;
                    break;
                case "SALIR":
                    break;
                default:
                    System.out.println("Elija la opción correspondientes");
                    break;

            }

            if (option.equals("1") || option.equals("2")) {
                String resultado = (esPrimo(numero) ? "El "+ numero +" es primo" : "El "+ numero +" no es primo") ;
                System.out.println(resultado);
            }

        }while (!option.equals("SALIR"));
    }

    private static boolean esPrimo(int numero){
        boolean esPrimo = true;

        esPrimo =(numero%2==0) != esPrimo;

        if(esPrimo){
            for(int i=3; i<=(numero/2); i+=2){
                if(numero%i==0){
                    esPrimo=!esPrimo;
                    break;
                }
            }
        }

        return esPrimo;
    }
}
