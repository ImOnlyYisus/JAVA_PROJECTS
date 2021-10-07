
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
        final int PRECIO_FIJO = 150;
        final double PRECIO_KILOMETRO = 15.3 / 100;
        
        double resultadoPresupuesto = PRECIO_FIJO + (PRECIO_KILOMETRO * kilometrosRecorridos);
        
        //Mostramos la factura
        System.out.println("PRESUPUESTO");
        System.out.println("-----------------------------");
        System.out.println("PRECIO FIJO\t" + PRECIO_FIJO + "€");
        System.out.println("PRECIO POR KM\t" + PRECIO_KILOMETRO + "€");
        System.out.println("KM TOTALES\t" + kilometrosRecorridos + "€");
        System.out.println("------------------------------");
        System.out.println("TOTAL:\t" + resultadoPresupuesto); //No me muestra el color
    }
}
