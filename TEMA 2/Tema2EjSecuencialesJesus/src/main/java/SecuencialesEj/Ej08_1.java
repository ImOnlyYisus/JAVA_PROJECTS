
package SecuencialesEj;

//Importo clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej08_1 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
           Programa que pida el precio de un artículo y calcule su valor aplicando un 16% de IVA. 
        */
        
        //Inicio Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Declaro constantes
        final double IVA = 0.16;
        
        //Pido precio
        double articuloSinIva;
        System.out.println("Precio del articulo: ");
        articuloSinIva = entradaTeclado.nextDouble();
        
        //Calculos
        double precioFinal = (articuloSinIva * IVA) + articuloSinIva;
        System.out.println("El precio final con IVA de [" + (0.16*100) + "%] es de: " + precioFinal);
        
    }
}
