
package jesus;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej05 {
    public static void main(String[] args) {
        /*
            5.- Implementa el programa del ejercicio 2 usando un do – while.
        */
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
       
        do{
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }while(x<=n);
    }
}
