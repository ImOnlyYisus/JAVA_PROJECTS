/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeciciosTema2;

//Importo clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej14 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
        14.- Crea una nueva clase llamada Ej14, que contenga una llamada al método public static void main(String[] args). El programa tendrá una variable entera tiempo
             inicializada con un valor leído por teclado, en segundos, y queremos conocer este tiempo pero expresado en horas, minutos y segundos, mostrando los resultados por pantalla.
        */
        
        //Inicializamos Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Declaro variable tiempo
        int tiempo;
        
        //Pregunto el tiempo 
        System.out.println("¿Dime el tiempo en segundos?: ");
        tiempo = entradaTeclado.nextInt();
        
        //Hago el calculo
        final int SEGUNDOS_MINUTOS = 60;
        final int MINUTOS_HORAS = 60;
        
        int tiempoFinalMinutos = tiempo / SEGUNDOS_MINUTOS;
        int tiempoFinalHoras = tiempoFinalMinutos / MINUTOS_HORAS;
        
        System.out.println(tiempo);
        System.out.println(tiempoFinalMinutos);
        System.out.println(tiempoFinalHoras);
    }
}
