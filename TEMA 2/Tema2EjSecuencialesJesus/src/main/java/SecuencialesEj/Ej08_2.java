
package SecuencialesEj;

//Importo clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej08_2 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
           Programa que pida el precio de un artículo y calcule su valor aplicando un 16% de IVA. 
        */
        
        //Inicio Scanner
        Scanner entradaTeclado = new Scanner(System.in);
               
        //Pido precio
        double articuloSinIva;
        double IVA;
        System.out.println("Precio del articulo: ");
        articuloSinIva = entradaTeclado.nextDouble();
        
        System.out.println("¿Que IVA quieres aplicar en %?: ");
        IVA = entradaTeclado.nextDouble() / 100;
         
        //Calculos
        double precioFinal = (articuloSinIva * IVA) + articuloSinIva;
        System.out.println("El precio final con IVA de [" + ( IVA * 100) + "%] es de: " + precioFinal);
        
    }
}
