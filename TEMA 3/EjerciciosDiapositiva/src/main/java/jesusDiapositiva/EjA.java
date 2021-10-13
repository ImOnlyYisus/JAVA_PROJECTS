
package jesusDiapositiva;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EjA {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            A. Saber si un número es positivo, negativo, o cero
        */
        
        //Inicializo scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Incializar variables
        System.out.println("Dime un numero:");
        int numero = entradaTeclado.nextInt();
        
        //Logica
        if(numero>0){
            System.out.println("El numero es positivo");
        } else if (numero == 0){
            System.out.println("El numero es cero");
        }
        else{
            System.out.println("El numero es negativo");
        }
        
    }
}
