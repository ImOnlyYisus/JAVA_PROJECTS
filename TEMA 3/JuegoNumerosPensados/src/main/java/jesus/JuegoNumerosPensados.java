
package jesus;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class JuegoNumerosPensados {
    public static void main(String[] args) {
        //INICIALIZO SCANNER
        Scanner entry = new Scanner(System.in);
        
        //INICIALIZO RANDOM
        Random random = new Random();
        
        //VARIABLES
        String nombreJugador1;
        String nombreJugador2;
        int numeroAleatorioJ1;
        int numeroAleatorioJ2;
        String opciones;
        int rondas;
        int puntosJ1;
        int puntosJ2;
        
        //----------------------
        // Nombres jugadores
        //----------------------
        System.out.println("Introduce el nombre del primer jugador:");
        nombreJugador1 = entry.nextLine();
        
        System.out.println("Introduce el nombre del segundo jugador:");
        nombreJugador2 = entry.nextLine();
        
        do{ //Se ejecuta siempre que el usuario no quiera SALIR, en el caso de que quiera SALIR se acaba el bucle
            
            System.out.println("----------------------------------------");
            System.out.println("PRESIONE ENTER PARA COMENZAR EL JUEGO   ");
            System.out.println("JUGADOR 1: "+ nombreJugador1);
            System.out.println("JUGADOR 2: "+ nombreJugador2);
            System.out.println("\nSALIR");
            System.out.println("----------------------------------------");
            
            System.out.println("Elige una opcion....");
            opciones = entry.nextLine();
            opciones = opciones.toUpperCase();
            
            switch(opciones){
                case "":
                    do{ //Pregunto cuantas rondas quiere jugar y compruebo si el numero es impar para que haya siempre un ganador
                        System.out.println("¿A cuantas rondas quieres jugar?");
                        rondas = entry.nextInt();
                        
                        if(rondas%2 == 0){
                            System.out.println("Tiene que se un numero de rondas impares, por ejemplo el mejor de 1, 3, 5...");
                        }
                    }while((rondas%2) == 0);
                    
                    for(int i=1; i>=rondas ; i++){
                        numeroAleatorioJ1 = random.nextInt(5)+1;
                        numeroAleatorioJ2 = random.nextInt(5)+1;
                        
                        System.out.println("-----------------------");
                        System.out.println(nombreJugador1 + ": " +);
                    }
                    break;
                    
                case "SALIR":
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Selecciones una opcion valida");
                    break;
            }
        }while(!opciones.equalsIgnoreCase("SALIR"));
        

        
    }
    
}
