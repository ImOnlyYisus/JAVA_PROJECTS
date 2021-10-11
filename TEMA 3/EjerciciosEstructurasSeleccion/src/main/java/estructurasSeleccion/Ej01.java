
package estructurasSeleccion;

//Importar clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej01 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucucion
        /*
        1.- Implementa el siguiente programa y realiza ejecuciones para los siguientes datos de edad: 10,18 y 67. ¿Cuáles son los resultados?
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("escanear edad:");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);

        //resultados
        //edad = 10 --> No es mayor de edad
        //edad = 18 --> Es mayor de edad
        //edad = 67 --> Es mayor de edad
    }
    
}
