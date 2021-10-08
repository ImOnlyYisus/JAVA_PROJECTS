
package p21JesusNarbona;

//Importo clases
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class parteBJesusNarbona {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
            Modifica el ejercicio anterior para que la lectura de datos y la salida por pantalla usen diálogos JOptionPane .
            Además, en esta parte, el número de horas anuales de los máster se debe poder introducir por teclado, también usando
            JOptionPane.
        */
        
        //Problema --> Mirar el numero de profesores que necesita segun los grupos de masteres
        //Resultado --> Decir profesores necesarios
        //Introducir numero de horas y numero de masteres
        //Un profesor 150h max
        
        //Constantes
        final int HORAS_MAXIMA_PROFESOR = 150;
        
        //Pregunto cuantos grupos de masteres hay y lo guardo en una variable
        //Uso JOptionPane.showInputDialog()
        String numeroGruposMasteresString = JOptionPane.showInputDialog(null,"¿Cuantos grupos de masteres se van a impartir?");
        
        //Conversion String a int Integer.parseInt()
        int numeroGruposMasteres = Integer.parseInt(numeroGruposMasteresString);
        
        //Pregunto cuantas duracion tienen los masteres
        //Uso JOptionPane.showInputDialog()
        String horasDuracionMasteresString = JOptionPane.showInputDialog(null,"¿Cauntas horas tienen cada master?");
        
        //Conversion String a double Double.parseDouble()
        double horasDuracionMasteres = Double.parseDouble(horasDuracionMasteresString); 
        //paso a double para ahorar una conversion explicita
        
        //Calculamos el numero de profesores segun sus horas y la duracion del master
        double horasTotalesMasteres = horasDuracionMasteres * numeroGruposMasteres;
        double numeroProfesoresTotales = horasTotalesMasteres / HORAS_MAXIMA_PROFESOR; 
        
        //Mostramos el resultado
        //Uso JOptionPane.showMessageDialog();
        JOptionPane.showMessageDialog(null, "Nº MASTERES: " + numeroGruposMasteres 
                + "\nNº DE HORAS MASTER: " + horasDuracionMasteres 
                + "\nNº DE HORAS MAX. PROFESOR: " + HORAS_MAXIMA_PROFESOR
                + "\n\nTOTAL: " + Math.ceil(numeroProfesoresTotales) + " profesores"); //Math.ceil() para redondear al mayor
        
        //Pruebas realizadas
        //nº masteres 25 y nº horas master 975 --> resultado = 163.0 profesores
        //nº masteres 9  y nº horas master 59 --> resultado = 59.0 profesores
        //nº masteres 15 y nº horas 750 --> resultado =  75.0 profesores
        
    }
}
