
package jesus;

//Importo clases
import java.util.Scanner;



/**
 *
 * @author jesus
 */
public class ParteA {
    public static void main(String[] args) {
        /*
        +--------------------------------------------------------------------------------------------------------------------------------------------------------+
        |                                                                                                                                                        |
        |  PARTE A                                                                                                                                               |
        | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
        |  Por todos es sabido que el precio de la energía no para de subir, y en concreto, la luz que se paga en los hogares está a un precio astronómico.      |
        |                                                                                                                                                        |
        |  La idea es que realices una calculadora de consumo eléctrico, de forma que se pueda introducir el consumo en vatios de un aparato (entre 1 y 4500),   |
        |  las horas que está funcionando al día y el precio del kWh (entre 0.1 y 0.45) para saber cuántos € hay que pagar por el consumo de ese aparato.        |
        |                                                                                                                                                        |
        |  Por ejemplo, una lavadora consume 450Wh y tarda 2.5h en hacer la colada, en total consume 1.12kW en esas dos horas y media. Suponiendo un precio de   |
        |  0.30€/kWh entonces la lavadora ha gastado en lavar la ropa: 1.12kW*0.3€/kWh = 0.33€                                                                   |
        |                                                                                                                                                        |
        +--------------------------------------------------------------------------------------------------------------------------------------------------------+

            RESULTADO ----> CALCULADORA CAPAZA DE CALCULAR EL CONSUMO EN EUROS DE UN APARATO

            DATOS A INTRODUCIR ---> VATIOS APARATO (1 A 4500), HORAS DE FUNCIONAMIENTO AL DÍA Y PRECIO DEL KWH (0.1 A 0.45)
        */

        //CONSTANTES
        final double VATIOS_MINIMOS_INTRODUCIR = 1;
        final double VATIOS_MAXIMOS_INTRODUCIR = 4500;
        final double PRECIO_KWH_MINIMO = 0.1;
        final double PRECIO_KWH_MAXIMO = 0.45;
        final int HORAS_TIENE_UN_DIA = 24;
        final int KILOVATIO_A_VATIO = 1000;
        
        //Incializo variables --- lo hago fuera por si la tuviera que usar fuera de los bloques ---
        double vatiosAparato;
        
        double horasUsoAparato;
        
        double precioKwh;
        
        String repetirPrograma;
        
        //Inicializo Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        do { //Bucle para introducir el valor del vatio entre 1 y 4500
            System.out.println("¿Consumo de vatios del aparato?:");
            vatiosAparato = entradaTeclado.nextDouble();

            if (vatiosAparato <= VATIOS_MAXIMOS_INTRODUCIR && vatiosAparato >= VATIOS_MINIMOS_INTRODUCIR) { //--------------Condicion vatios aparato---------------

                do { //Bucle por si introduce mas horas de las que hay en un día
                    System.out.println("¿Cuantas horas de uso tiene ese aparato al dia?:");
                    horasUsoAparato = entradaTeclado.nextDouble();

                    if (horasUsoAparato <= HORAS_TIENE_UN_DIA) { //---------------Condicion horas en un dia------------------

                        do { //Bucle para ver si el precio de kwh esta entre 0.1 y 0.45
                            System.out.println("¿Cuanto cuesta el KWH?");
                            precioKwh = entradaTeclado.nextDouble();

                            if (precioKwh <= PRECIO_KWH_MAXIMO && precioKwh >= PRECIO_KWH_MINIMO) { //----------Condicion precio kwh----------
                                double precioFinalAparato = ((vatiosAparato * horasUsoAparato) / KILOVATIO_A_VATIO) * precioKwh;
                                
                                System.out.printf("El precio final de cosumo de su aparato es de [ %.2f €]\n\n",precioFinalAparato);
                            } else {
                                System.out.println("El precio del KWH debe estar entre " + PRECIO_KWH_MINIMO + " y " + PRECIO_KWH_MAXIMO);

                            }

                        } while (!(precioKwh <= PRECIO_KWH_MAXIMO && precioKwh >= PRECIO_KWH_MINIMO)); //Niego la condicion del if para que sea lo contrario y se repita el bucle

                    } else {
                        System.out.println("Un dia no puede tener mas de " + HORAS_TIENE_UN_DIA + " horas");
                    }
                } while (horasUsoAparato > HORAS_TIENE_UN_DIA);
            } else {
                System.out.println("El aparato tiene que tener un consumo entre " + (int) VATIOS_MINIMOS_INTRODUCIR + " y " + (int) VATIOS_MAXIMOS_INTRODUCIR);
            }
            
            System.out.println("¿Quieres calcular el precio de otro aparato? S/N");
            entradaTeclado.nextLine(); //Limpio salto de linea buffer
            repetirPrograma= entradaTeclado.nextLine();
        } while (!(vatiosAparato <= VATIOS_MAXIMOS_INTRODUCIR && vatiosAparato >= VATIOS_MINIMOS_INTRODUCIR) || repetirPrograma.equalsIgnoreCase("S")); 
            //Niego la condicion del if para que sea lo contrario y se repita el bucle o que si el usuario quiere continuar se repita tambien
        
        /*
        +--------------------------------------------------------------------------+
        |  PRUEBAS REALIZADAS                                                      |
        |--------------------------------------------------------------------------|
        |  VATIOS = 450, HORAS = 2.5, PRECIO=0.3 ---> 	RESULTADO = 0.34€          |
        |  VATIOS = 500, HORAS = 5, PRECIO=0.4 ---> 	RESULTADO = 1.00€          |
        |  VATIOS = 200, HORAS = 24, PRECIO=0.2 ---> 	RESULTADO = 0.96€          |
        |  VATIOS = 650, HORAS = 12, PRECIO=0.4 ---> 	RESULTADO = 3.12€          |
        |  VATIOS = 1000, HORAS = 2, PRECIO=0.3 ---> 	RESULTADO = 0.60€          |
        +--------------------------------------------------------------------------+
        */
    }
}
