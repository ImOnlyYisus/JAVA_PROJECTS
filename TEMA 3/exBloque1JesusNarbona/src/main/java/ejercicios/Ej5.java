package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        //EJ5 JESUS NARBONA AGUILAR

        /*
        -MOSTRAR UN MENU CON OPCIONES 1)CUENTA ATRAS, 2)JUEGO DADOS, 3)SALIR
        Solicitar una de las 3 opciones con scanner, controlando las excepciones

            -SI elige 3 te preguntara si estas seguro de salir
            Mostrar si o no

         -Si elige 1 mostar una cuenta atras de 1000 hasta 100 restando de 5en5 con for
         */
        //SCANNER
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        int opciones = 0;
        String salir = "";

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
                        //Completar ej6
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
