/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jesus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Calculadora {

    // Método monstrarMenu. Sólo se utiliza en la clase Calculadora
    // método privado. No recibe parámetros y no devuelve valor (void)
    // 
    private static void mostrarMenu() {
        System.out.println("Opciones del programa");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
    }

    private static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }

    // Método resta. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la resta de los parámetros
    private static int restar(int n1, int n2) {
        int resultado = n1 - n2;
        return resultado;
    }
    // Método suma. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la suma de los parámetros
    
    private static int multiplicar(int n1, int n2) {
        int resultado = n1 * n2;
        return resultado;
    }
    
    private static int dividir(int n1, int n2) {
        int resultado = n1 / n2;
        return resultado;
    }
    
    private static int comprobarEntradaEnteros(){
        Scanner sc = new Scanner(System.in);
        boolean centinela = true;
        int numero = 0;
        do{
            centinela = true;
            try{
                System.out.println("Introduce un numero:");
                numero = sc.nextInt();
                centinela = false;
            }catch(InputMismatchException ime){
                System.out.println("Has introducido una letra, intentalo de nuevo");
                sc.nextLine();
            }
        }while(centinela);
        
        return numero;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operando1 = 1, operando2 = 1;

        System.out.println("Bienvenido al calculator");

        do {
            System.out.println("Los numeros deben de estar en rango de -100 a 100");
            operando1 = comprobarEntradaEnteros();
            operando2 = comprobarEntradaEnteros();
                
        } while (!((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)));
        
        String opcion = "";
        int resultado = 0;
        do {
            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    resultado = sumar(operando1, operando2);

                    break;
                case "2":
                    resultado = restar(operando1, operando2);

                    break;
                case "3":
                    resultado = multiplicar(operando1, operando2);
                    break;
                case "4":
                        try{
                            resultado = dividir(operando1, operando2);
                        } catch(ArithmeticException ae){
                            System.out.println("No se puede dividir por 0");
                        }
                    break;
                    
                case "5":
                    System.out.println("Has solicitado salir...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("El resultado es " + resultado);
        } while (!opcion.equals("5"));

    }

}
