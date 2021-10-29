
package jesus;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class NumerosPrimos {
    
    public static void main(String[] args) {
        /*
        
            1- Solicitar al usuario 2 opciones, el numero si lo quiere meter por teclado o si lo quiere que lo genere aleatoriamente.
               El rango para calcular el numero primo va a estar 2 y 600_000_000
        
            2- Algoritmo de fuerza bruta.
               Si el numero n es par no es primo, menos 2 que es primo
               Si es impar recorrer rango de impares desde 3 hasta n/2

        Pruebas: 52682367, 131071, 524287, 907, 911, 919, 929;
            
        */
        
        //Constantes
        final int MIN_RANGO = 2;
        final int MAX_RANGO = 6_000_000;
        
        //Scanner
        Scanner entry = new Scanner(System.in);
        
        //Random
        Random randomNumber = new Random();
        
        //Variables
        int opciones;
        int numero=0;
        int comprobarPar;
        int mitadRango;
        boolean esPrimo = false;
        
        do{ //Bucle que repite el menu de opciones a no ser que el usuario pulse 3 y salga
            
            System.out.println("---OPCIONES---");
            System.out.println("1. Introducir por teclado un numero entre 2 y 600M");
            System.out.println("2. Generar un numero aleatorio entre 2 y 600M");
            System.out.println("3. Salir");
            
            opciones = entry.nextInt();
            
            switch(opciones){
                case 1: //Pedir al usuario el numero y ver si es primo o no, controlando si es de 2 a 600M
                    
                    do{
                        System.out.println("Introduce el numero:");
                        numero = entry.nextInt();
                        if(!(numero>MIN_RANGO && numero<MAX_RANGO)){
                            System.out.println("Introduce un valor del" + MIN_RANGO + " al " + MAX_RANGO);
                        }
                    } while(!(numero>MIN_RANGO && numero<MAX_RANGO));
                    
                    break;
                case 2: //Generar un numero random del 2 al 600M y ver si es primo o no
                    
                    //GENERO NUMERO ENTERO ENTRE 2 Y 600M
                    numero = randomNumber.nextInt(MAX_RANGO - MIN_RANGO +1) + MIN_RANGO;
                    break;
                    
                case 3:
                    System.out.println("\nHas solicitado salir...");
                    break;
                default:
                    System.out.println("\nElige una opcion valida!\n\n");
                    break;                    
            }
            
            if(opciones == 1 || opciones ==2){
                comprobarPar = numero % 2;
                    
                    if(numero != 2){
                        if(comprobarPar == 0){
                            esPrimo=false;
                        }   
                    }
                    
                    //VARIABLE PARA VER N/2
                    mitadRango = numero/2;
                    
                    for (int i = 3; i <= mitadRango; i+=2) {
                        if((numero%i)==0){
                            esPrimo = false;
                            break;
                        }
                        else{
                            esPrimo = true;
                        }
                    }
                    
                    if(esPrimo){
                        System.out.println("[ "+ numero + " ], ES PRIMO");
                    } else{
                        System.out.println("[ "+ numero + " ], NO ES PRIMO");
                    }
            }
        }while(opciones != 3);
                
        
    }
}
