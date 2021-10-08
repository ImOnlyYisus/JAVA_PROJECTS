
package ExpresionesAritmeticas;

/**
 *
 * @author jesus
 */

//Importo la clase Scanner
import java.util.Scanner;

public class Ej03 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        //3. Algoritmo que lea tres notas numéricas de tipo double y calcule la nota media.
        
        //Creamos la entrada por teclado
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pedimos las notas
        System.out.println("Escribe tu primera nota: ");
        double primeraNota = entradaTeclado.nextDouble();
        System.out.println("Escribe tu segunda nota: ");
        double segundaNota = entradaTeclado.nextDouble();
        System.out.println("Escribe tu tercera nota: ");
        double terceraNota = entradaTeclado.nextDouble();
        
        //Operacion de nota media
        double notaMedia = (primeraNota + segundaNota + terceraNota) / 3;
        
        //Mostramos resultado
        
        System.out.println("RESULTADO");
        System.out.println("---------------");
        System.out.println("(" + primeraNota + " + " + segundaNota + " + " + terceraNota + ")= " + notaMedia);
    }
}
