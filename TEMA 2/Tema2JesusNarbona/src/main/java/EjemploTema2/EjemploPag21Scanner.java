
package EjemploTema2;

/**
 *
 * @author jesus
 */

//Importamos Clase Scanner
import java.util.Scanner;

public class EjemploPag21Scanner {
    
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("¿Como te llamas?: ");
        String nombre = entradaTeclado.nextLine();
        
        System.out.println("¿Que día naciste?: ");
        int diaNacimiento = entradaTeclado.nextInt();
        
        System.out.println("¿En que mes?: ");
        int mesNacimiento = entradaTeclado.nextInt();
        
        System.out.println("¿En que año?: ");
        int anioNacimiento = entradaTeclado.nextInt();
        
        System.out.println("Hola! " + nombre + ", nacistes el [" + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento + "]");
    }
}
