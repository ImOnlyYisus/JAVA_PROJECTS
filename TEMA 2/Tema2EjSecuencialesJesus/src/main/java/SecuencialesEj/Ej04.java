
package ExpresionesAritmeticas;

/**
 *
 * @author jesus
 */

//Importamos la clase Scanner
import java.util.Scanner;
        
public class Ej04 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        //4. Realiza un programa que lea una cantidad de gramos y obtenga su equivalencia en libras.
        
        //Creamos entrada por teclado
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pedimos los gramos al usuario
        System.out.println("¿Cuantos gramos quieres pasar a libra?:");
        double gramos = entradaTeclado.nextDouble();
        
        //Operacion de pasar a libra 1g = 0,00220462 libras
        final double gramoLibra = 0.00220462;
        
        double resultadoLibra = gramos * gramoLibra;
        
        //Mostramos el resultado
        System.out.println("RESULTADO");
        System.out.println("-------------");
        System.out.println(gramos + " x " + gramoLibra + "= [" + resultadoLibra + " lb]");
        
    }
}
