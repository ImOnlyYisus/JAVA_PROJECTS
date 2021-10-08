/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgricultoresPaquete;

//Importamos las clases
import java.io.*; //Libreria de la API para escribir y leer archivoss
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class AgricultoresEscritura {
    //Main para ejecucuion
    public static void main(String[] args) {
        
    
        //Codigo para ejecución
        /*
                Tenemos una finca con N numero de agricultores que recolectan N numero de frutas frutas, esas frutas se ponen en una cesta común.
                b- Guardar en un fichero las entradas y luego leyendolo sacar si se puede repartir exactamente o no
         */

        //Pedimos entrada por teclado de agricultores (agricultor 1, 2, 3, 4...)
        //Incializamos la entrada por teclado de los agricultores y de el numero de frutas.
        Scanner entradaTeclado = new Scanner(System.in);

        //Para crear una cadena de este estilo 0;1;2.., guardo dos cadenas una la de frutas y los agricultores
        String cadenaAgricultores=null;
        String cadenaFrutas=null;
        
        
        //------------ESCRITURA----------------------
        //Para crear un archivo es necesario usar try por si hubiera algun error en la creacion
        //Para la creacion necesitamos File (el nombre o la ruta y el nombre), FileWriter para escribir en el archivo y un buffer para escribir BufferedWriter
            try{
                File nombreArchivo = new File("AgricultoresRecolecta.csv");
                FileWriter archivoEscribir = new FileWriter(nombreArchivo);
                BufferedWriter bufferArchivo = new BufferedWriter(archivoEscribir);
                
                //Bucle para crear las cadenas y luego almacenarlas en el archivo csv
                int agricultor;
                do{
                    System.out.println("Introduce el numero de agricultor (Ej: 4298): ");
                    
                    agricultor = entradaTeclado.nextInt();
                    if(agricultor != 0){ //Solucion para 0;
                        if(cadenaAgricultores == null && cadenaFrutas == null){
                            cadenaAgricultores = "" + agricultor;
                            System.out.println("¿Cuantas frutas han recolectado?:");
                            int frutas = entradaTeclado.nextInt();
                            cadenaFrutas= "" + frutas;
                        }
                        else{
                            cadenaAgricultores = cadenaAgricultores + ";" + agricultor;
                            System.out.println("¿Cuantas frutas han recolectado?:");
                            int frutas = entradaTeclado.nextInt();
                            cadenaFrutas= cadenaFrutas + ";" + frutas;
                        }
                    }
                }while(agricultor != 0);
                
                //Introduzco con el metodo write() las cadenas, luego cierro el buffer y el archivo
                bufferArchivo.write(cadenaAgricultores+"\n");
                bufferArchivo.write(cadenaFrutas);
                bufferArchivo.close();
                archivoEscribir.close();
                
            }catch(IOException e){
                System.out.println("Error en la creación del archivo");
            }
            
        
    }
}
