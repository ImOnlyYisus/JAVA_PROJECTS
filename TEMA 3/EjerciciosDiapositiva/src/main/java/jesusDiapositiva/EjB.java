
package jesusDiapositiva;

//Importamos clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EjB {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            B. Saber si un carácter es un dígito, una letra mayúscula o una letra minúscula
            UNICODE:
		dígito: 48 – 57
		letra mayúscula: 65 – 90
		letra minúscula: 97 – 122
        */
        
        //Clase Scanner para pedir datos por consola
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Variables
        System.out.println("Introduce algun numero: ");
        int numero = entradaTeclado.nextInt();
        
        //Logica
        if(numero>=48 && numero<=57){
            System.out.println("El numero introducido se corresponde a un digito en la tabla ASCII [" + (char)numero +"]");
        } else if(numero>=65 && numero<=90){
            System.out.println("El numero introducido se corresponde a una letra mayúscula en la tabla ASCII ["+ (char)numero +"]");
        } else if(numero>=97 && numero<=122){
            System.out.println("El numero introducido se corresponde a una letra minuscula en la tabla ASCII ["+ (char)numero +"]");
        } else{
            System.out.println("El numero introducido no entra dentro de estos ejemplos, aunque sería este caracter [" + (char)numero +"]");
        }
        
        
    }
    
}
