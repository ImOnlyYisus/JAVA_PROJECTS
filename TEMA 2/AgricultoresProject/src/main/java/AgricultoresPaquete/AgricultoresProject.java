
package AgricultoresPaquete;

/**
 *
 * @author jesus
 */

//Import clase Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class AgricultoresProject {
    //Main para ejecutar
    public static void main(String[] args) {
        //Codigo para ejecución
        /*
            Tenemos una finca con N numero de agricultores que recolectan N numero de frutas frutas, esas frutas se ponen en una cesta común.
            a- Decir si se puede repartir exactamente entre todos.
        */
        
        //Pedimos entrada por teclado de agricultores (agricultor 1, 2, 3, 4...)
        
        //Incializamos la entrada por teclado de los agricultores y de el numero de frutas.
            Scanner entradaTeclado = new Scanner(System.in);
        
        //Creamos el array para guardar los N numero de agricultores y frutas "<Integer>" para poder operar con numeros enteros
            ArrayList agricultores = new ArrayList <Integer>();
            ArrayList <Integer> frutas = new ArrayList();
        
        //Pedimos al usuario el agricultor y su numero de frutas, paramos con un 0 y continuamos con cualquier otro numero
            //Bucle while
            while(true){ 
                System.out.println("Introduce el numero de agricultor (Ej: 4298): ");
                //Guardo en una variable la entrada y luego con if miro si es 0 para salir del bucle
                int entradaAgricultores = entradaTeclado.nextInt();
                
                if (entradaAgricultores == 0){
                    frutas.add(0);
                    break;
                }
                else{
                    agricultores.add(entradaAgricultores);
                    System.out.println("Introduce el numero de frutas: ");
                    frutas.add(entradaTeclado.nextInt());
                }
            }
        
        //Mostramos los datos introducidos con un bucle for
            System.out.println("Nº AGRICULTOR\tFRUTAS");

            int totalFrutas = 0; //Inicializamos la variable totalFrutas para poder operar
        
        //For para sacar el array y sumar el total de frutas
            for(int z=0;z<(frutas.size()-1);z++){ //"(frutas.size()-1)" para que no me salgan los 0 ultimos
                System.out.println(agricultores.get(z) + "\t\t" + frutas.get(z));

                totalFrutas = totalFrutas + frutas.get(z);          
            } 
        
        //Calcular cuantas frutas se queda por cada agricultor
            double frutasPorAgricultor = totalFrutas / agricultores.size();
            
        //Comprobamos si el resto es 0 para saber si se pueden repartir o no
            if(totalFrutas%agricultores.size() == 0){
                System.out.println("\n*Se puede repartir las [" + totalFrutas + "] entre todos, exactamente.\n"
                        + "Se quedaría exactamente [" + frutasPorAgricultor + "] cada agricultor.");
            }
            else{
                System.out.println("\n*No se puede repartir las [" + totalFrutas + "] entre todos, exactamente");
            }
         
    }
}
