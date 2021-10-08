/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecuencialesEj;

//Importo clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej9 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
           9.Una empresa de juguetes se dedica a realizar cometas como las que figuran en la imagen de la derecha. Necesitan saber el área de tela a emplear según las medidas
             de las diagonales que hay entre los puntos A y C, y entre B y D.
        */
        
        //Incializamos Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Preguntamos las medidas de las diagonales
        System.out.println("¿Que medida desea de el lado A-C?" );
        double diagonalAC = entradaTeclado.nextDouble();
        
        System.out.println("¿Que medida desea de el lado B-D?" );
        double diagonalBD = entradaTeclado.nextDouble();
        
        //Calculamos A=(d * D) / 2
        double areaCometa = (diagonalAC * diagonalBD) / 2;
        
        System.out.printf("El area es de: %.2f" , areaCometa);
        
        
        
        
    }
}
