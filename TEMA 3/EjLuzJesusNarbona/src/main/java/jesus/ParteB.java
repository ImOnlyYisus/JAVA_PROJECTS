
package jesus;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class ParteB {
    public static void main(String[] args) {
        /*
            +-----------------------------------------------------------------------------------------------------------------------------------------------------+      
            |                                                                                                                                                     |      
            |  PARTE B                                                                                                                                            |      
            |-----------------------------------------------------------------------------------------------------------------------------------------------------|      
            |                                                                                                                                                     |      
            | Por todos es sabido que el precio de la energía no para de subir, y en concreto, la luz que se paga en los hogares está a un precio astronómico.    |      
            |                                                                                                                                                     |      
            | La idea es que realices una calculadora de consumo eléctrico, de forma que se pueda introducir el consumo en vatios de un aparato (entre 1 y 4500), |      
            | las horas que está funcionando al día y el precio del kWh (entre 0.1 y 0.45) para saber cuántos € hay que pagar por el consumo de ese aparato.      |      
            |                                                                                                                                                     |      
            | Por ejemplo, una lavadora consume 450Wh y tarda 2.5h en hacer la colada, en total consume 1.12kW en esas dos horas y media. Suponiendo un precio de |      
            | 0.30€/kWh entonces la lavadora ha gastado en lavar la ropa: 1.12kW*0.3€/kWh = 0.33€.                                                                |      
            |                                                                                                                                                     |      
            +-----------------------------------------------------------------------------------------------------------------------------------------------------+ 
        
            RESULTADO ----> CALCULADORA CAPAZA DE CALCULAR EL CONSUMO EN EUROS DE UN APARATO

            DATOS A INTRODUCIR ---> VATIOS APARATO (1 A 4500), HORAS DE FUNCIONAMIENTO AL DÍA, HORAS PUNTAS, HORAS LLANAS, HORAS VALLE, PRECIO PUNTAS, PRECIO LLANAS, PRECIO VALLE
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
        double horasPuntasUso;
        double horasLlanasUso;
        double horasValleUso;
        
        double precioKwhHoraPunta;
        double precioKwhHoraLlana;
        double precioKwhHoraValle;
        
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
                        
                        do {//Bucle para saber si el sumatorio de horas introducida es la misma al numero de horas de uso
                            System.out.println("¿Cuantas de esas horas han sido en hora punta?:");
                            horasPuntasUso = entradaTeclado.nextDouble();

                            System.out.println("¿Cuantas de esas horas han sido en hora llana?:");
                            horasLlanasUso = entradaTeclado.nextDouble();

                            System.out.println("¿Cuantas de esas horas han sido en hora valle?:");
                            horasValleUso = entradaTeclado.nextDouble();

                            if ((horasPuntasUso + horasLlanasUso + horasValleUso) == horasUsoAparato) { //-------------------Condicion de sumatorioHoras==horasUso------------------
                                //Tiene que salir el sumatorio de horas igual al sumatorio de horas de uso introducidas

                                do { //Bucle para ver si el precio de kwh esta entre 0.1 y 0.45
                                    System.out.println("¿Cuanto cuesta el KWH en hora punta?");
                                    precioKwhHoraPunta = entradaTeclado.nextDouble();
                                    
                                    System.out.println("¿Cuanto cuesta el KWH en hora llana?");
                                    precioKwhHoraLlana = entradaTeclado.nextDouble();
                                    
                                    System.out.println("¿Cuanto cuesta el KWH en hora valle?");
                                    precioKwhHoraValle = entradaTeclado.nextDouble();

                                    if ((precioKwhHoraPunta <= PRECIO_KWH_MAXIMO && precioKwhHoraPunta >= PRECIO_KWH_MINIMO) //----------Condicion precio entre 0.1 y 0.45----------
                                            && (precioKwhHoraLlana <= PRECIO_KWH_MAXIMO && precioKwhHoraLlana >= PRECIO_KWH_MINIMO)
                                            && (precioKwhHoraValle <= PRECIO_KWH_MAXIMO && precioKwhHoraValle >= PRECIO_KWH_MINIMO)) {
                                                                                
                                        do{ //Bucle para saber si el precio esta bien puesto sengun el orden de valor h.punta>h.llana>h.valle
                                            if(precioKwhHoraPunta > precioKwhHoraLlana && precioKwhHoraPunta > precioKwhHoraValle && precioKwhHoraLlana > precioKwhHoraValle
                                                    && precioKwhHoraPunta != precioKwhHoraLlana && precioKwhHoraLlana != precioKwhHoraValle){
                                                //-----------------------------Condicion precio correctamente asignado-------------------
                                        
                                                double precioFinalHoraPunta = ((vatiosAparato * horasPuntasUso)/ KILOVATIO_A_VATIO) * precioKwhHoraPunta;
                                                double precioFinalHoraLlana = ((vatiosAparato * horasLlanasUso)/ KILOVATIO_A_VATIO) * precioKwhHoraLlana;
                                                double precioFinalHoraValle = ((vatiosAparato * horasValleUso)/ KILOVATIO_A_VATIO) * precioKwhHoraValle;
                                                double precioFinalAparato = precioFinalHoraPunta + precioFinalHoraLlana + precioFinalHoraValle;
                                                
                                                System.out.printf("El precio final de cosumo de su aparato es de [ %.2f €]\n\n", precioFinalAparato); //Para sacar 2 decimales
                                            } else{
                                                System.out.println("Los precios no estan bien puestos, recuerada h.punta>h.llana>h.valle");
                                            }

                                            
                                        }while(!(precioKwhHoraPunta > precioKwhHoraLlana && precioKwhHoraPunta > precioKwhHoraValle && precioKwhHoraLlana > precioKwhHoraValle
                                                && precioKwhHoraPunta != precioKwhHoraLlana && precioKwhHoraLlana != precioKwhHoraValle));
                                        //Niego la concion del if para que si es lo contrario haga una vuelta en el bucle
                                        
                                    } else {
                                        System.out.println("El precio del KWH debe estar entre " + PRECIO_KWH_MINIMO + " y " + PRECIO_KWH_MAXIMO);

                                    }

                                } while (!((precioKwhHoraPunta <= PRECIO_KWH_MAXIMO && precioKwhHoraPunta >= PRECIO_KWH_MINIMO)
                                        && (precioKwhHoraLlana <= PRECIO_KWH_MAXIMO && precioKwhHoraLlana >= PRECIO_KWH_MINIMO)
                                        && (precioKwhHoraValle <= PRECIO_KWH_MAXIMO && precioKwhHoraValle >= PRECIO_KWH_MINIMO))); //Niego la condicion del if para que sea lo contrario y se repita el bucle
                                    
                                
                            } else{
                                System.out.println("La suma de los disitinto tipos de horas no es igual a las horas de uso anteriormente introducido horas de uso [" + horasUsoAparato
                                        + "], sumatorio de diferente tipos de horas [" + (horasPuntasUso + horasLlanasUso + horasValleUso) + "]");
                            }
                            
                        } while (!((horasPuntasUso + horasLlanasUso + horasValleUso) == horasUsoAparato)); //Niego la condicion del if de sumatorio de horas para que se repìta en el caso de que no se cumpla

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
            +-----------------------------------------------------------------------------------------------------------------------------------------------------+
            |  PRUEBAS REALIZADAS                                                                                                                                 |
            |-----------------------------------------------------------------------------------------------------------------------------------------------------|
            |  VATIOS = 450, HORAS = 2.5, H.PUNTAS=1, H.LLANA=1.5, H.VALLE=0, PRECIO PUNTA=0.31, PRECIO LLANA= 0.27, PRECIO VALLE=0.18  ---> 	RESULTADO = 0.32€ |
            +-----------------------------------------------------------------------------------------------------------------------------------------------------+  
        */
    }
}
