
package ExpresionesAritmeticas;

/**
 *
 * @author jesus
 */

//Importo la clase Scanner
import java.util.Scanner;

public class Ej02 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        //2.Algoritmo que lea el valor del radio y calcule el área del círculo.
        
        //Creamos la entrada por teclado
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Preguntamos el radio del circulo
        System.out.println("¿Que radio tiene el circulo?: ");
        double radioCirculo = entradaTeclado.nextDouble();
        
        //Operacion para calcular el area A = Π x r2
        final double PI = 3.1415;
        
        double areaCiculo = PI * Math.pow(radioCirculo,2);
       
        
        //Mostramos el resultado
        System.out.println("OPERACION");
        System.out.println("-------------------");
        System.out.println("Area = " + PI + " x " + "(" + radioCirculo + " x " + radioCirculo + ") = " + areaCiculo);
        
        
    }
}
