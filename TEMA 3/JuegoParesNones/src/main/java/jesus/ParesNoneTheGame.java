
package jesus;

//Clases
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jesus
 * https://github.com/yisusturtle/JuegoPares-Nones/
 */
public class ParesNoneTheGame {
    public static void main(String[] args) {
        /*
            ELegir si el usuario quiere jugar con una persona o con la maquina.
            
            LOCAL: elige pares o nones, luego pregunta el numero de dedos y dice el ganador
            MAQUINA: eliges pares o nones, luego preguta el numreo de dedos y dice quien gana
        */
        
        //CONSTANTES
        int MAX_DEDOS = 10;
        int MIN_DEDOS = 0;
        
        //Incializo Scanner
        Scanner entry = new Scanner(System.in);
        Random random = new Random();
        
        //Variables
        String opcion;
        String paresNonesJ1="";
        String paresNonesJ2="";
        int dedosJ1=0;
        int dedosJ2=0;        
        int sumaDedos=0;
        String ganador="";
        
        do{
            System.out.println("Elige el modo de juego");
            System.out.println("-----------------------");
            System.out.println("1. Juego local 1v1");
            System.out.println("2. Juega contra la CPU");
            System.out.println("SALIR");
            
            opcion = entry.nextLine();
            opcion = opcion.toUpperCase();
            
            switch(opcion){
                //----------------------------------------------------------------------------
                //                          PARTE A : 1VS1 LOCAL
                //----------------------------------------------------------------------------
                case "1":
                    System.out.println("HAS DECIDIDO JUGAR 1vs1 local");
                    System.out.println("-----------------------------");
                    
                    do{//El bucle comprueba si el dato introducido es PARES O NONES
                        System.out.println("Elgige PARES o NONES,");
                        System.out.println("JUGARDOR 1:");
                        paresNonesJ1= entry.nextLine();
                        paresNonesJ1 = paresNonesJ1.toUpperCase();
                        
                        if(!(paresNonesJ1.equals("PARES") || paresNonesJ1.equals("NONES"))){
                            System.out.println("Opciones validas: PARES o NONES");
                            
                        }
                    }while(!(paresNonesJ1.equals("PARES") || paresNonesJ1.equals("NONES")));
                    
                    if(paresNonesJ1.equals("PARES")){
                        paresNonesJ2 = "NONES";
                    } else{
                        paresNonesJ2 = "PARES";
                    }
                    
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Es decir JUGADOR 1 ["+ paresNonesJ1 +"] y JUGADOR 2 ["+ paresNonesJ2 +"]");
                    System.out.println("--------------------------------------------------------------------------");
                    
                    do{//El bucle comprueba si el numero introducido de dedos del jugador 1 es un numero logico
                        //Es decir tiene que tener 10 o 1 dedo
                        System.out.println("Elige numero de dedos JUGADOR 1:");
                        
                        dedosJ1 = entry.nextInt();
                        if(dedosJ1>MAX_DEDOS){
                            System.out.println("NO TIENES MAS DE 10 DEDOS EN LAS MANOS AVISPADO!");
                        } else if (dedosJ1<MIN_DEDOS){
                            System.out.println("EN TU MANO HAY DEDOS RECUERDA!");
                        }
                        
                    }while(!(dedosJ1 >= MIN_DEDOS && dedosJ1<=MAX_DEDOS));
                    
                    do{//El bucle comprueba si el numero introducido de dedos del jugador 2 es un numero logico
                        //Es decir tiene que tener 10 o 1 dedo
                        System.out.println("Elige numero de dedos JUGADOR 2:");
                        
                        dedosJ2 = entry.nextInt();
                        if(dedosJ2>MAX_DEDOS){
                            System.out.println("NO TIENES MAS DE 10 DEDOS EN LAS MANOS AVISPADO!");
                        } else if (dedosJ2<MIN_DEDOS){
                            System.out.println("EN TU MANO HAY DEDOS RECUERDA!");
                        }
                        
                    }while(!(dedosJ2 >= MIN_DEDOS && dedosJ2<=MAX_DEDOS));
                    
                    break;
                
                //----------------------------------------------------------------------------
                //                        PARTE B : JUEGO CONTRA LA CPU
                //----------------------------------------------------------------------------
                case "2":
                    System.out.println("HAS DECIDIDO JUGAR CONTRA LA CPU");
                    System.out.println("-----------------------------");
                    
                    do{//El bucle comprueba si el dato introducido es PARES O NONES
                        System.out.println("Elgige PARES o NONES,");
                        System.out.println("JUGARDOR 1:");
                        paresNonesJ1= entry.nextLine();
                        paresNonesJ1 = paresNonesJ1.toUpperCase();
                        
                        if(!(paresNonesJ1.equals("PARES") || paresNonesJ1.equals("NONES"))){
                            System.out.println("Opciones validas: PARES o NONES");
                            
                        }
                    }while(!(paresNonesJ1.equals("PARES") || paresNonesJ1.equals("NONES")));
                    
                    if(paresNonesJ1.equals("PARES")){
                        paresNonesJ2 = "NONES";
                    } else{
                        paresNonesJ2 = "PARES";
                    }
                    
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Es decir JUGADOR 1 ["+ paresNonesJ1 +"] y JUGADOR 2 ["+ paresNonesJ2 +"]");
                    System.out.println("--------------------------------------------------------------------------");
                    
                    do{//El bucle comprueba si el numero introducido de dedos del jugador 1 es un numero logico
                        //Es decir tiene que tener 10 o 1 dedo
                        System.out.println("Elige numero de dedos JUGADOR 1:");
                        
                        dedosJ1 = entry.nextInt();
                        if(dedosJ1>10){
                            System.out.println("NO TIENES MAS DE 10 DEDOS EN LAS MANOS AVISPADO!");
                        } else if (dedosJ1<0){
                            System.out.println("EN TU MANO HAY DEDOS RECUERDA!");
                        }
                        
                    }while(!(dedosJ1 >= MIN_DEDOS && dedosJ1<=MAX_DEDOS));
                    
                    //DEDOS ALEATORIOS CPU
                    dedosJ2 = random.nextInt(10)+1; //VA A ELEGIR UN NUMERO DEL 1 AL 10
                    break;
                    
                case "SALIR":
                    System.out.println("HAS DECIDIDO SALIR DEL JUEGO...");
                    break;
                default:
                    System.out.println("Elige una opción valida\n");
                    break;
            }
            
            //----------------------------------------------------------------------
            //          OPERACION QUE SOLO SE EJECUTA SI VA A JUGAR
            // (Dice quien es el ganador segun cuantos dedos pongan cada uno)
            //----------------------------------------------------------------------
            if(opcion.equalsIgnoreCase("1") || opcion.equals("2")){
                //OPERACION DEL JUEGO (sumo los dedos y miro si es par o impar para saber quien ha ganado)
                sumaDedos = dedosJ1 + dedosJ2;

                if ((sumaDedos % 2) == 0) { //Compruebo si es par el numero
                    if (paresNonesJ1.equals("PARES")) { //Compruebo si el valor que eligió el jugador es PARES o NONES y lo añado a la variable
                        // GANADOR para saber quien gana

                        ganador = "JUGADOR 1";
                    } else {
                        ganador = "JUGADOR 2";
                    }

                    System.out.println("LA SUMA DE DEDOS ES DE [" + sumaDedos + "], por lo que es PARES");
                    System.out.println("----------------------");
                    System.out.println("GANA " + ganador + "!!!\n\n");

                } else {
                    if (paresNonesJ1.equals("NONES")) {//Compruebo si el valor que eligió el jugador es PARES o NONES y lo añado a la variable
                        // GANADOR para saber quien gana
                        ganador = "JUGADOR 1";
                    } else {
                        ganador = "JUGADOR 2";
                    }

                    System.out.println("LA SUMA DE DEDOS ES DE [" + sumaDedos + "], por lo que es NONES");
                    System.out.println("----------------------");
                    System.out.println("GANA " + ganador + "!!!\n\n");
                }

                entry.nextLine(); //Limpio el buffer para evitar el salto de linea
            }
            
        }while(!opcion.equals("SALIR"));
    }
}
