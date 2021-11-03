
package jesus;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class JuegoNumerosPensados {
    public static void main(String[] args){
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
        String ganador="";
        int puntosJ1=0;
        int puntosJ2=0;
        
        //----------------------
        // Nombres jugadores
        //----------------------
        System.out.println("Introduce el nombre del primer jugador:");
        nombreJugador1 = entry.nextLine();
        
        System.out.println("Introduce el nombre del segundo jugador:");
        nombreJugador2 = entry.nextLine();
        
        
        do{ //SE REPITE EL BUCLE SIEMPRE QUE EL JUGADOR NO SELECCION (escriba) SALIR
            
            System.out.println("----------------------------------------");
            System.out.println("PRESIONE (1) PARA COMENZAR EL JUEGO\n");
            System.out.println("JUGADOR 1: "+ nombreJugador1);
            System.out.println("JUGADOR 2: "+ nombreJugador2);
            System.out.println("\nSALIR");
            System.out.println("----------------------------------------");
            
            System.out.println("Elige una opcion....");
            opciones = entry.nextLine();
            opciones = opciones.toUpperCase();
            
            switch(opciones){ //MENU QUE ACTUA SEGUN LAS OPCIONES QUE HAYA ELEGIDO EL USUARIO
                case "1":
                    do{ //OPCION DE NUMERO DE RONDAS, CONTANDO QUE SIEMPRE TIENE QUE SER IMPAR
                        //(No puede ser par porque si no habría un empate)
                        System.out.println("\n¿A cuantas rondas quieres jugar?");
                        rondas = entry.nextInt();
                        
                        entry.nextLine(); //Limpio buffer (evito salto de linea)
                        
                        if(rondas%2 == 0){
                            System.out.println("Tiene que se un numero de rondas impares, por ejemplo el mejor de 1, 3, 5...");
                        }
                    }while((rondas%2) == 0);
                    
                    //CREO UNA VARIABLE QUE VA A SER EL MAXIMO DE PUNTOS DE UNA PARTIDA
                    double puntosMaximosPartida = Math.ceil((double)rondas/2); //REDONDEO AL MAYOR PARA SABER EL NUMERO DE VICTORIAS (EJ: 5 RONDAS / 2 --> 3 GANAS)
                    
                    for(int i=1; i<=rondas ; i++){ //SE REPITE HASTA QUE SE CUMPLA LA CANTIDAD DE RONDAS INTRODUCIDA O SI EL JUGADOR HA CONSEGUIDO LOS PUNTOS MAXIMOS
                        //Numeros aleatorios jugadores
                        numeroAleatorioJ1 = random.nextInt(5)+1;
                        numeroAleatorioJ2 = random.nextInt(5)+1;
                        int sumaAleatorios = numeroAleatorioJ1 + numeroAleatorioJ2;
                        
                        //COMPRUEBO SI LA SUMA DE ALEATORIOS ES MAYOR A 7, MENOR A 7 O 7
                        //SI SUMA<7 GANA J1, SI SUMA>7 GANA J2 Y EMPATE SI ES = 7
                        if(sumaAleatorios<7){ 
                            puntosJ1 ++;
                            ganador = nombreJugador1;
                        } else if(sumaAleatorios>7){
                            puntosJ2 ++;
                            ganador = nombreJugador2;
                        } else{
                            ganador = "NADIE (EMPATE)";
                        }
                        
                        //----------------------------------------------------------------------
                        //              SE IMPRIMEN RESULTADOS DE LA RONDA
                        //----------------------------------------------------------------------
                        System.out.println("*********************************************************************************************************************************************");
                        System.out.println("JUGADA --> "+ nombreJugador1 +" ["+ numeroAleatorioJ1 +"] y "+ nombreJugador2+ " ["+ numeroAleatorioJ2 +"], total = [" + sumaAleatorios +"]");
                        System.out.println("RONDA ["+ i + "] GANA " + ganador);
                        System.out.println("*********************************************************************************************************************************************");
                        System.out.println("~~~~PUNTOS~~~~");
                        System.out.println("º) "+nombreJugador1 + "->" + puntosJ1);
                        System.out.println("º) "+nombreJugador2 + "->" + puntosJ2);
                        System.out.println("\nRONDA:" + i);
                        System.out.println("*********************************************************************************************************************************************");
                        
                        if(puntosJ2 == (int)puntosMaximosPartida || puntosJ1 == (int)puntosMaximosPartida){ //MIRO SI LOS PUNTOS DE LOS JUGADORE SON LOS MAXIMOS
                                                                                                            //SI LO SON SALGO DEL BUCLE CON BREAK
                            break;
                        }
                        
                        System.out.println("\n--> PULSA CUALQUIER TECLA PARA CONTINUAR");
                        entry.nextLine();
                    }
                    
                    //----------------------------------------------------------------
                    //SE IMPRIMEN LOS RESULTADOS DE LA PARTIDA
                    //----------------------------------------------------------------
                    System.out.println("///////////////////////////////////////");
                    System.out.println("FIN DEL JUEGO!!");
                    System.out.println("--> GANADOR ["+ ganador +"]");
                    System.out.println("///////////////////////////////////////");
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
