
package estructurasSeleccion;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej02 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
        2.- Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:                    
        */
        
        //Inicializamos Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //a-Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se devolverá “menor”. Las cadenas que se devuelven se guardarán en una variable llamada resultado.
        //b-Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que cero”.
        //Pedimos el numero x
        System.out.println("Dar valor a x: ");
        int x = entradaTeclado.nextInt();
        
        //Estructura seleccion
        String resultadoA = (x>=135)?"Mayor a 135":"Menor a 135";
        
        String resultadoB = (x<=0)?"Menor que cero":"Mayor que cero";
        
        System.out.println("Apartado A: " + resultadoA);
        System.out.println("Apartado B: " + resultadoB);
        
        //c-Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())
    }
}
