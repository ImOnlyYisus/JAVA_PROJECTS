
package estructurasSeleccion;

//Importamos clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej04 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
            4.- Reescribe el programa del ejercicio 1 usando el operador ternario 
        */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escanear edad:");

        int edad = scanner.nextInt();

        String resultado = (edad>=18)?"Es mayor de edad":"Es menor de edad";
        
        System.out.print("mostrar la edad: " + edad);
        System.out.println(resultado);

    }
}
