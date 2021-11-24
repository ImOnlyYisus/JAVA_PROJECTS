package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //EJ6 JESUS NARBONA AGUILAR

        /*
        -MOSTRAR UN MENU CON OPCIONES 1)CUENTA ATRAS, 2)JUEGO DADOS, 3)SALIR
        Solicitar una de las 3 opciones con scanner, controlando las excepciones

            -SI elige 3 te preguntara si estas seguro de salir
            Mostrar si o no

         -Si elige 1 mostar una cuenta atras de 1000 hasta 100 restando de 5en5 con for

         -Si elige 2:
            -se sortean 3 viajes
            -se tira una moneda: cara = tira dado, cruz pierde el viaje
                -Cuando tira el dado:
                1 o 3 viaje a characa Nutrias
                2 o 6 pedregales
                4 o 5 Corominas

           Simular el resultado para 20 jugadores

         */
        //CONSTANTES
        final int VIAJES = 3;

        //SCANNER
        Scanner sc = new Scanner(System.in);

        //Random
        Random rd = new Random();

        //VARIABLES
        int opciones = 0;
        String salir = "";
        boolean monedaCara = true;
        int dado = 0;
        int premios = 0;

        do { //SE REPITE HASTA QUE PONGA SI
            do { //SE REPITE HASTA QUE PULSE 1, 2 O 3
                System.out.println("MENU\n-----------------\n"
                        + "1) Cuenta atras\n2) Juego de dados\n3) Salir");
                System.out.println("Seleccione una opcion:");

                boolean esCorrecto = true;
                do { //COMPRUEBA QUE SE INTRODUZCA UN NUMERO CORRECTAMENTE
                    esCorrecto = true;
                    try {
                        opciones = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("No es un numero, introducelo de nuevo!");
                        sc.nextLine();
                        esCorrecto = !esCorrecto;
                    }
                } while (!esCorrecto);
                sc.nextLine();
                switch (opciones) {
                    case 1:
                        System.out.println("Cuenta atras:");
                        for (int i = 1000; i >= 100; i -= 5) {
                            System.out.println(i);
                        }
                        break;
                    case 2:
                        System.out.println("Se sortean " + VIAJES + " viajes");
                        premios = 0;
                        for (int i = 0; i <= 20; i++) {
                            if (premios == VIAJES) {
                                break;
                            }
                            monedaCara = rd.nextBoolean();
                            if (monedaCara) {
                                dado = rd.nextInt(6) + 1;

                                switch (dado) {
                                    case 1:
                                    case 3:
                                        System.out.println("JUGADOR [" + i + "], ha conseguido el viaje a la charca de las Nutrias");
                                        premios++;
                                        break;
                                    case 2:
                                    case 6:
                                        System.out.println("JUGADOR [" + i + "], ha conseguido el viaje a los Pedregales");
                                        premios++;
                                        break;
                                    case 4:
                                    case 5:
                                        System.out.println("JUGADOR [" + i + "], ha conseguido el viaje a los dolmenes de Corominas");
                                        premios++;
                                        break;
                                }

                            } else {
                                System.out.println("JUGADOR [" + i + "] ha sacado cruz, pierde la oportunidad");
                            }
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Elige una opcion valida");
                        break;

                }
            } while (opciones != 3 && opciones != 1 && opciones != 2);

            if (opciones == 3) {
                System.out.println("¿Estas seguro que deseas salir?");
                System.out.println("Si o No");
                salir = sc.nextLine();
            }

        } while (!salir.equalsIgnoreCase("si"));
    }
}
