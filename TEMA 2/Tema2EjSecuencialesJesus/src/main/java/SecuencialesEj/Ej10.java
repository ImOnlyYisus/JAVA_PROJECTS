/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecuencialesEj;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej10 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            Realiza un programa que calcule el espacio recorrido, en metros, por un cuerpo que se deplaza a 200 km/h si está en movimiento 20 minutos. Realiza otro programa
            para calcular el espacio recorrido del cuerpo en función de su velocidad y tiempo de movimiento.
        */
        
        final int KILOMETROS_METROS = 1000;
        
        //Incializo Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pregunto y guardo la en variables
        System.out.println("¿A que velocidad  va el cuerpo?: ");
        double velocidadCuerpo = entradaTeclado.nextDouble();
        
        System.out.println("¿Cuanto lleva en movimiento en minutos?: ");
        int tiempoRecorridoCuerpo = entradaTeclado.nextInt();
        
        //Calculo
        double kmPorMinuto = velocidadCuerpo / 60;
        
        double distaciaRecorrida = kmPorMinuto * tiempoRecorridoCuerpo * KILOMETROS_METROS;
        
        System.out.println("Ha recorrido: " + distaciaRecorrida + " metros");
    }
}
