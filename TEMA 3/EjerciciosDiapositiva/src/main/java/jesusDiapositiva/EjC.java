
package jesusDiapositiva;

//Importamos clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EjC {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            C. Leer un número entero entre 1 y 10 y mostrar el número escrito en numeros romanos. Usa Switch
        */
        
        //Incializamos Scanner
        Scanner entradaTeclado = new Scanner (System.in);
        
        //Variables
        System.out.println("Introduce un numero de 1 al 10:");
        int numero = entradaTeclado.nextInt();
        
        //Logica switch
        switch(numero){
            case 1:
                System.out.println("El numero se corresponde a [ I ] en romano");
                break;
            case 2:
                System.out.println("El numero se corresponde a [ II ] en romano");
                break;
            case 3:
                System.out.println("El numero se corresponde a [ III ] en romano");
                break;
            case 4:
                System.out.println("El numero se corresponde a [ IV ] en romano");
                break;
            case 5:
                System.out.println("El numero se corresponde a [ V ] en romano");
                break;
            case 6:
                System.out.println("El numero se corresponde a [ VI ] en romano");
                break;
            case 7:
                System.out.println("El numero se corresponde a [ VII ] en romano");
                break;
            case 8:
                System.out.println("El numero se corresponde a [ IIX ] en romano");
                break;
            case 9:
                System.out.println("El numero se corresponde a [ IX ] en romano");
                break;
            case 10:
                System.out.println("El numero se corresponde a [ X ] en romano");
                break;
            
            default:
                System.out.println("El numero no esta comprendido entre el 1 y el 10");
                break;
        }
    }
}
