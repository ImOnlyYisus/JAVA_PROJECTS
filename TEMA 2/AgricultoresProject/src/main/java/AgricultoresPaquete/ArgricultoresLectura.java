/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgricultoresPaquete;

//Importo clases
import java.io.*;

/**
 *
 * @author jesus
 */
public class ArgricultoresLectura {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        //------------LECTURA----------------------
        //Tenemos que leer los datos del archivo y decir si podemos repartir exactamente o no segun el numero de agricultores
        
        //Creo unas nuevas cadenas para pasar la informacion del archivo a estas variables
            String nuevaCadenaAgricultores="";
            String nuevaCadenaFruta="";
        
        //Para la lectura un archivo es necesario usar try por si hubiera algun error en la lectura supieramos
        //Para la lectura necesitamos tener el archivo File(), un FileRedar() que es el que carga el archivo y el RufferedRedader() que lee
            try{
                File nombreArchivo = new File("AgricultoresRecolecta.csv");
                FileReader lecturaArchivo = new FileReader(nombreArchivo);
                BufferedReader bufferLectura = new BufferedReader(lecturaArchivo);
                
                //Añado la informacion que hay en el archivo a mis cadenas
                nuevaCadenaAgricultores= bufferLectura.readLine();
                nuevaCadenaFruta=bufferLectura.readLine();
                
                
            }catch(IOException e){
                System.out.println("Error en la lectura del archivo");
            }
            
            
            //Voy a convertir las cadenas en array mediante el metodo split()
            String[] arrayFrutasString = nuevaCadenaFruta.split(";");
            String[] arrayAgricultoresString = nuevaCadenaAgricultores.split(";");
            
            int[] arrayFrutas = new int[arrayFrutasString.length];
            int[] arrayAgricultores = new int[arrayAgricultoresString.length];
            
            int totalFrutas = 0;
            
            //bucle para meter datos en el array y sumar el numero total de frutas
            for(int i=0; i<arrayFrutas.length; i++){
                arrayFrutas[i]= Integer.parseInt(arrayFrutasString[i]);
                arrayAgricultores[i]= Integer.parseInt(arrayAgricultoresString[i]);
                
                totalFrutas = arrayFrutas[i] + totalFrutas;
            }
            
            //Division frutas para cada agricultor
            int frutasAgricultor =totalFrutas/(arrayAgricultores.length);
            
            //Saber si se puede repartir exactamente o no
            if(totalFrutas%(arrayAgricultores.length)==0){
                System.out.println("Hay un total de [" + totalFrutas + "frutas], se tiene que repartir entre [" + (arrayAgricultores.length)
                        + " agricultores], entonces si se podria repartir exactamente [" + frutasAgricultor + "frutas] para cada agricultor" );
            }
            else{
                System.out.println("Hay un total de [" + totalFrutas + " frutas], se tiene que repartir entre [" + (arrayAgricultores.length)
                        + " agricultores], entonces no se podria repartir exactamente para cada agricultor" );
            }
    }
}
