
package ExpresionesAritmeticas;

/**
 *
 * @author jesus
 */

//Importo clase Scanner
import java.util.Scanner;

public class Ej05 {
    //Main para ejecutar
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            5.Una empresa de autocares cobra 150 euros fijos por servicio y además 15.3 céntimos por Km recorrido.
            Elabora un programa que lea el número de km a recorrer y proporcione el presupuesto.
        */
        
        //Creamos entrada por teclado
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pedimos al usuario los km
        System.out.println("¿Cuantos km ha recorrido el vehiculo?:");
        double kilometrosRecorridos = entradaTeclado.nextDouble();
        
        //Calculamos el presupuesto
        final int precioFijo = 150;
        final double precioKilometro = 15.3;
        
        double resultadoPresupuesto = precioFijo + (precioKilometro * kilometrosRecorridos);
        
        //Mostramos la factura
        System.out.println("PRESUPUESTO");
        System.out.println("-----------------------------");
        System.out.println("PRECIO FIJO\t" + precioFijo + "€");
        System.out.println("PRECIO POR KM\t" + precioKilometro + "€");
        System.out.println("KM TOTALES\t" + kilometrosRecorridos + "€");
        System.out.println("------------------------------");
        System.out.println("\u001B[33m" +"TOTAL:\t" + resultadoPresupuesto + "€\u001B[0m"); //No me muestra el color

    }
}
