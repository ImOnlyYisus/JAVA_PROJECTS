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
        
        //Declaro constantes
        final double SEGUNDOS_MINUTOS = 60;
        final double MINUTOS_HORAS = 60;
        
        //Inicializamos Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Declaro variable tiempo
        int tiempo;
        
        //Pregunto el tiempo 
        System.out.println("¿Dime el tiempo en segundos?: ");
        tiempo = entradaTeclado.nextInt();

        
        //Calculo segun las partes decimales es decir si es una 1.3h 0.3*60 van a ser los minutos, y con los segundos igualmente
        double horas =((tiempo/SEGUNDOS_MINUTOS)/MINUTOS_HORAS);
        double minutos = (horas - (int)horas)*60;
        double segundos = (minutos - (int)minutos)*60;
        System.out.println((int)horas + " hora, " + (int)minutos + " minutos, " + (int)segundos + " segundos");
    }
}
