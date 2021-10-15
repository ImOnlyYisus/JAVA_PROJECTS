
package jesus;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class ejercicioBancoJesus {
    
    public static void main(String[] args) {
        
        /*
            El Banco Tetimo quiere desarrollar un programa de estudio de viabilidad hipotecaria para potenciales clientes de
            la entidad. Este programa debe decidir si un cliente es "apto" para ser timado por el banco o por el contrario, 
            según los datos aportados por el cliente, el banco lo rechaza y lo declara "no apto" por no ser rentable.

            Según los gerentes de Tetimo, cuando un cliente aterriza en su web para solicitar una hipoteca, lo primero que deben
            saber es su edad y su sueldo bruto mensual. Hay que tener en cuenta que no se conceden préstamos a menores de edad y 
            a mayores de 65 años.
        
            Si la edad es válida, el programa solicita al cliente la cantidad total de pasta que necesita para su hipoteca. 
            Si esa cantidad que se solicita supera la cantidad resultante de multiplicar el sueldo bruto anual del cliente por
            el factor multiplicativo, entonces la hipoteca se rechaza. En Tetimo el factor multiplicativo es de 5,85. Por ejemplo,
            si un cliente gana al año 30000 pavos, no podría pedir más de 30000*5,85.
        
            Si el cliente ha pasado el filtro de edad y el filtro de la cantidad a solicitar, el programa le solicita el número 
            de años en los que quiere devolver la hipoteca. Tetimo no concede hipotecas a más de 30 años y a menos de cinco. 
            Además, si la edad de la persona sumada a los años a devolver el préstamo supera los 75 años, el préstamo se rechaza.
        */
        
        /*
            Datos a pedir: edad, sueldo bruto
        */
        String edadString = JOptionPane.showInputDialog(null, "Introduce tu edad: ");
        int edad = Integer.parseInt(edadString);
        
        String sueldoString = JOptionPane.showInputDialog(null, "Introduce tu sueldo: ");
        double sueldo = Double.parseDouble(sueldoString);
        
        if(edad){
            
        }
    }
}
