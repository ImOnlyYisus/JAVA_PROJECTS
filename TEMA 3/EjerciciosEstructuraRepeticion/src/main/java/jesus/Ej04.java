
package jesus;

/**
 *
 * @author jesus
 */
public class Ej04 {
    public static void main(String[] args) {
        /*
            4.-Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados con
                la ejecución.
        
            Resultado --> En el primer caso imprime el numero del 1 al 11, y el siguiente va restando y va imprimendo hasta que llegue a 1
        */
        
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }
}
