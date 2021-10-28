
package jesus;

//Importamos clase
import java.util.Random;

/**
 *
 * @author jesus
 */
public class RandomEjemplo {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        
        int primerNumeroAleatorio = numeroAleatorio.nextInt(2); //Numero aleatorio del 0 al 1
        System.out.println(primerNumeroAleatorio);
        
        int segundoNumeroAleatorio = numeroAleatorio.nextInt(2) + 1; //Numero aleatorio del 1 al 2
        System.out.println(segundoNumeroAleatorio);
        
        int tercerNumeroAleatorio = numeroAleatorio.nextInt(50-10+1) + 10; //Numero aleatorio del 1 al 2
        System.out.println(tercerNumeroAleatorio);
        
        double cuartoNumeroAleatorio = numeroAleatorio.nextDouble();
        System.out.println(cuartoNumeroAleatorio);
    }
}
