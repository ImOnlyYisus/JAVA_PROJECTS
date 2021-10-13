
package EjeciciosTema2;

//Importamos clases
import java.util.Scanner;
        
/**
 *
 * @author jesus
 */
public class Ej09 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
            9.- Crea una nueva clase llamada Ej09, que contenga una llamada al método public static void main(String[] args).
                La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
        */
        
        //a.- Declara e inicializa dos variables int (a=10,  b=20).
        int a=10, b=20;
        
        //b.- Declara cuatro variables booleanas.
        boolean aMenorB, aMayorB, aIgualB, aDesigualB;
        
        //c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales:
        //    a<b, a>b, a==b, a!=b.
        aMenorB = (a<b);
        aMayorB = (a>b);
        aIgualB = (a==b);
        aDesigualB = (a!=b);
        
        //d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.
        System.out.println("RESULTADO");
        System.out.println("---------------------");
        System.out.println("a<b\t" + aMenorB);
        System.out.println("a>b\t" + aMayorB);
        System.out.println("a==b\t" + aIgualB);
        System.out.println("a!=b\t" + aDesigualB);
        
    }
}
