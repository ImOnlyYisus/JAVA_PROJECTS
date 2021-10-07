
package SecuencialesEj;

//Importo Clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej06 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            Leer dos números enteros por teclado, a y b. Imprimir por pantalla el resultado de las siguientes operaciones:
                1.- a/b
                2.- a mod b (operación módulo o residuo)
        */
        
        //Incializo Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pregunto numeros a y b
        int a, b;
        
        System.out.println("Valor de a: ");
        a = entradaTeclado.nextInt();
        
        System.out.println("Valor de b: ");
        b = entradaTeclado.nextInt();
        
        //Opero y muestro
        int division = a / b;
        int resto = a % b;
        System.out.println("La division de {" + a + "/" + b + "} es igual a " + division );
        System.out.println("El resto de {" + a + "%" + b + "} es igual a " + resto );
    }
}
