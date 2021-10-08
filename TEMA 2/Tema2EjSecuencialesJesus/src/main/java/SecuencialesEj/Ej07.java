
package SecuencialesEj;

//Importo clase Scanner
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej07 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega la leche en la distribuidora
            le pagan según los galones entregados (1 galón son 3,78 litros). Escribe un programa que ayude al productor a saber
            cuánto recibirá por la entrega de su producción de un día, sabiendo que el precio del galón es 1.20€.
        */
        
        //Declaro constantes
        final double GALON_LITRO = 3.78;
        final double PRECIO_GALON = 1.20;
        
        //Inicializo Scnanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pregunto cuantos litros
        double litrosProducidos;
        System.out.println("¿Cuantos litros has registrado hoy?: ");
        
        litrosProducidos = entradaTeclado.nextDouble();
        
        //Operacion
        double precioEntrega = (litrosProducidos / GALON_LITRO) * PRECIO_GALON;
        
        System.out.println("RESULTADO");
        System.out.println("---------------------");
        System.out.println("GALON LITRO\t\t" + GALON_LITRO);
        System.out.println("PRECIO GALON\t\t" + PRECIO_GALON);
        System.out.println("LITROS RECOGIDOS\t" + litrosProducidos);
        System.out.println("----------------------");
        System.out.println("TOTAL\t" + precioEntrega);
        
    }
}
