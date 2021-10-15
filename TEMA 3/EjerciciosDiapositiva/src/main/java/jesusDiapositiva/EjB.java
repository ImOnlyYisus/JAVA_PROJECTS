
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
        System.out.println("Introduce algun caracter: ");
        String entradaCaracter = entradaTeclado.next();
        
        char caracterUnicode = entradaCaracter.charAt(0);
        
        //Logica
        if(caracterUnicode>=48 && caracterUnicode<=57){
            System.out.println("El caracter introducido se corresponde a un digito en la tabla ASCII [" + caracterUnicode +"]");
        } else if(caracterUnicode>=65 && caracterUnicode<=90){
            System.out.println("El caracter introducido se corresponde a una letra mayúscula en la tabla ASCII ["+ caracterUnicode +"]");
        } else if(caracterUnicode>=97 && caracterUnicode<=122){
            System.out.println("El caracter introducido se corresponde a una letra minuscula en la tabla ASCII ["+ caracterUnicode +"]");
        } else{
            System.out.println("El caracter introducido no entra dentro de estos ejemplos, aunque sería este caracter [" + caracterUnicode +"]");
        }
        
        
    }
    
}
