/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecuencialesEj;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *
 * @author jesus
 */
public class Ej10_JOption {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            Realiza un programa que calcule el espacio recorrido, en metros, por un cuerpo que se deplaza a 200 km/h si está en movimiento 20 minutos. Realiza otro programa
            para calcular el espacio recorrido del cuerpo en función de su velocidad y tiempo de movimiento.
        */
        
        final int KILOMETROS_METROS = 1000;
        final int HORAS_A_MINUTOS = 60;
        
        //Pregunto y guardo la en variables
        String velocidadCuerpoString = JOptionPane.showInputDialog(null,"Introduce la valociada en km/h");
        double velocidadCuerpo = Double.parseDouble(velocidadCuerpoString);
        
        String tiempoRecorridoString = JOptionPane.showInputDialog(null, 
                "Introduce el tiempo que lleva el cuerpo en movimiento");
        int tiempoRecorridoCuerpo = Integer.parseInt(tiempoRecorridoString);
        
        //Calculo
        double kmPorMinuto = velocidadCuerpo / HORAS_A_MINUTOS; //Paso de km/h a km/min
        
        double distanciaRecorrida = kmPorMinuto * tiempoRecorridoCuerpo * KILOMETROS_METROS; //km a metros
        String distanciaRecortada = "" + distanciaRecorrida;
        
        JOptionPane.showMessageDialog(null, "Ha recorrido: " + String.format("%.2f",distanciaRecorrida) + " metros");
    }
}
