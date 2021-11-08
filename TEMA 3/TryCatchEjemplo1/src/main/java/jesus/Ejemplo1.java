
package jesus;

import java.util.InputMismatchException;
import java.util.MissingFormatWidthException;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        
        boolean comprobarExcepciones=true;
        int n1, n2, division=0;
        Scanner entry = new Scanner(System.in);
        
        do{
            
            n1=0;
            n2=0;
            
            try{
                System.out.println("Introduce un numero:");
                n1 = entry.nextInt();
                
                System.out.println("Introduce otro numero:");
                n2 = entry.nextInt();
                
                division = n1/n2;
                comprobarExcepciones=false;
                
            }catch(InputMismatchException ime){
                System.out.println("Debes de introducir un numero!");
                entry.nextLine();//limpio
                
            }catch(ArithmeticException ae){
                System.out.println("No se puede dividir por 0");
                entry.nextLine();//limpio
            }
            
        }while(comprobarExcepciones);
        
        System.out.println("Division = " + division);
    }
    
}
