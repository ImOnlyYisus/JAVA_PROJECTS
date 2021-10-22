
package jesus;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej06 {
    public static void main(String[] args) {
        /*
            6.- Implementa el programa del ejercicio 2 usando un for.
        */
        
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        
        for(int z=0; z<=n ; z++){
            System.out.print(z);
            System.out.print(" - ");
        }
    }
}
