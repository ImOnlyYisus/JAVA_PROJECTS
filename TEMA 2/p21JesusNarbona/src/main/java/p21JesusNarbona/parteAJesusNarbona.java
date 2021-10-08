
package p21JesusNarbona;

//Importo clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class parteAJesusNarbona {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            La Universidad de Estepona tiene un número anual de másteres que impartir. Realiza un programa que calcule
            el total de profesores/as que necesita la Universidad para impartir los másteres, en función del número de
            grupos de máster a los que se van a dar clase, sabiendo que un profesor no puede tener más de 150 horas de
            clase anuales y que todos los másteres tienen 975 horas de clase al año, cada uno. 
        
            En esta parte los datos deben leerse por teclado usando Scanner y mostrarse usando la consola, usando System.
        
            Ten en cuenta que el número de profesores/as debe ser un número entero. No se pueden tener 13,3 profesores, 
            en ese caso hay que tener 14 profesores, siempre redondeando hacia arriba. Para ello usa el método ceil() de
            la clase Math.
        */
        
        //Problema --> Mirar el numero de profesores que necesita segun los grupos de masteres
        //Resultado --> Decir profesores necesarios
        //Cada master 975h
        //Un profesor 150h max
        
        //Constantes
        final int HORAS_DURACION_MASTER = 975;
        final int HORAS_MAXIMA_PROFESOR = 150;
        
        //Inicializamos Scanner (Clase importada java.util.Scanner)
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pregunto cuantos grupos de masteres hay y lo guardo en una variable
        System.out.println("¿Cuantos grupos de masteres se van a impartir?: ");
        int numeroGruposMasteres = entradaTeclado.nextInt(); 
        
        //Calculamos el numero de profesores segun sus horas y la duracion del master
        int horasTotalesMasteres = HORAS_DURACION_MASTER * numeroGruposMasteres;
        double numeroProfesoresTotales = (double)horasTotalesMasteres / HORAS_MAXIMA_PROFESOR; //Conversion explicita para devolver
        //decimales
        
        //Mostramos el resultado redondeando al mayor con Math.ceil()
        System.out.println("RESULTADO");
        System.out.println("-----------------------");
        System.out.println("Nº MASTERES\t\t\t" + numeroGruposMasteres);
        System.out.println("Nº DE HORAS MASTER\t\t" + HORAS_DURACION_MASTER);
        System.out.println("Nº DE HORAS MAX. PROFESOR\t" + HORAS_MAXIMA_PROFESOR);
        System.out.println("-----------------------");
        System.out.println("TOTAL:\t" + Math.ceil(numeroProfesoresTotales));
        System.out.println("\nEs decir necesitariamos [" + Math.ceil(numeroProfesoresTotales) + " profesores] en total, para llevar"
                + " a cabo la realizacion de los masteres");
        
        //Pruebas realizadas
        //nº masteres 25 --> resultado = 163.0 profesores
        //nº masteres 9 --> resultado = 59.0 profesores
        
                
    }
}
