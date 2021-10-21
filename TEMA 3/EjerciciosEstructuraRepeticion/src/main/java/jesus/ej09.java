
package jesus;

/**
 *
 * @author jesus
 */
public class ej09 {
    public static void main(String[] args) {
        /*
            9.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados
            con la ejecución.
        
            Resultado --> No entra en el bucle while ya que 0 = 0 entonces j vale 6
        */
        
        int i=0;
        int j=6;
        while (i<0) {
            i++;
            j++;
        }
        
        System.out.println(j);
    }
}
