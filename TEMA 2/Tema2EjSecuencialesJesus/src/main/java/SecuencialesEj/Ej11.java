
package SecuencialesEj;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej11 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
         11.Realiza un programa para calcular la distancia entre dos puntos en un plano cartesiano, a partir de las
            coordenadas de los mismos. Utiliza el teorema de Pitágoras
        */
        
        //Inicializo Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pido los puntos
        System.out.println("Punto Ax:");
        int puntoAx = entradaTeclado.nextInt();
        System.out.println("Punto Ay:");
        int puntoAy = entradaTeclado.nextInt();
        
        System.out.println("Punto Bx");
        int puntoBx = entradaTeclado.nextInt();
        System.out.println("Punto By");
        int puntoBy = entradaTeclado.nextInt();
        
        //Calculo
        double primerCateto = (puntoAx - puntoBx );
        double segundoCateto = (puntoAy - puntoBy);
        
        double distanciaEntrePuntos = Math.sqrt((Math.pow(primerCateto,2) + Math.pow(segundoCateto,2)));
        
        System.out.printf("Distacia entre los puntos A y B: %.2f", distanciaEntrePuntos);
    }
}
