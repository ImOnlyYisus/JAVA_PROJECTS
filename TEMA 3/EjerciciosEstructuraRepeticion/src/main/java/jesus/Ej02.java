
package jesus;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej02 {
    public static void main(String[] args) {
        /*
            2.-Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados
               con la ejecución.
        
            Resultado --> El programa a imprimir numeros del 1 hasta el que tu introduzcas
        */
        
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

    }
}
