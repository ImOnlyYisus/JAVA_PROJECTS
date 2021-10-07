
package ExpresionesAritmeticas;

/**
 *
 * @author jesus
 */

//Importo la clase Scanner
import java.util.Scanner;

public class Ej01 {
    
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        //1. Algoritmo que lea una cantidad de euros y los pase a rupias indias.
        
        //Incializo una entrada por teclado
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pido al usuario la cantidad de euros
        System.out.println("¿Cuantos euros deseas convertir?:");
        double euro = entradaTeclado.nextDouble();
        
        //Operacion para cambiar euros a rupias
        final double EURO_RUPIAS = 86.57;
        
        double totalRupias = euro * EURO_RUPIAS;
        
        //Mostramos la cantidad
        System.out.println("SABIENDO QUE 1€ SON 86.57 Rupias");
        System.out.println("---------------------------------");
        System.out.println(euro + " x " + EURO_RUPIAS + "= [" + totalRupias + " Rupias]" );
    }
    
}
