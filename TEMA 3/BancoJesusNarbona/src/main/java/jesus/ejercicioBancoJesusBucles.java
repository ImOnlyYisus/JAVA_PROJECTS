
package jesus;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class ejercicioBancoJesusBucles {
    
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
            Datos a pedir: edad, sueldo bruto, dinero a solicitar, años a pagar
            Condiciones: ser de 18 a 65 años, sueldoAnual*5,85<prestamos, menor de 30 y mayor de 5 años, edad+años>75
        */
        
        //Constantes
        final int MESES_DE_UN_AÑO = 12;
        final double FACTOR_MULTIPLICATIVO_TETIMO = 5.85;
        final int PLAZO_MINIMO = 5;
        final int PLAZO_MAXIMO = 30;
        
        int menu;
        int edad;
        double sueldoAnual;
        double sueldoMensual;
        double pastaSolicitar;
        int añosDevolverHipoteca;
        
        do {
            //Menu de bienvenidad programa
            menu = JOptionPane.showConfirmDialog(null, "Hola, buenos dias, ¿estas preparado para ser timado?", "Elige una opcion...", JOptionPane.YES_NO_OPTION);
            if(menu==1){
                break;
            }

            do { //Bucle, que se pide la edad y comprueba que sea mayor de edad o meno o igual a 45

                //Variables solicitadas
                String edadString = JOptionPane.showInputDialog(null, "Introduce tu edad");
                edad = Integer.parseInt(edadString);
                
                if(edad<18){ //Edad menor a 18
                    JOptionPane.showMessageDialog(null, "Eres menor de edad, no cumples con los requisitos, introduzca un valor valido");
                }
                if(edad>65){ //Edad mayor a 65
                    JOptionPane.showMessageDialog(null, "Su edad supera nuestros criterios, no cumples con los requisitos, introduzca un valor valido");
                }

            } while (!(edad > 17 && edad <= 65));

            do {
                //Solicito sueldo mensual
                String sueldoMensualString = JOptionPane.showInputDialog(null, "Introduce tu sueldo mensual");
                sueldoMensual = Double.parseDouble(sueldoMensualString);
                sueldoAnual = sueldoMensual * MESES_DE_UN_AÑO;

                //Solicito dinero para pedir
                String pastaSolicitarString = JOptionPane.showInputDialog(null, "¿Cuanto dinero deseas solicitar para su hipoteca?");
                pastaSolicitar = Double.parseDouble(pastaSolicitarString);
                
                if(pastaSolicitar>(sueldoAnual*FACTOR_MULTIPLICATIVO_TETIMO)){
                    JOptionPane.showMessageDialog(null, "Se rechaza el prestamo, no nos renta timarte");
                }
            } while (!(pastaSolicitar < (sueldoAnual * FACTOR_MULTIPLICATIVO_TETIMO)));

            do {
                //Solicito los años de devolucion
                String añosDevolverHipotecaString = JOptionPane.showInputDialog(null, "¿En cuantos años quieres devolver la hipoteca?");
                añosDevolverHipoteca = Integer.parseInt(añosDevolverHipotecaString);
                
                if (añosDevolverHipoteca > PLAZO_MAXIMO) { //Años devolver el dinero mayor a 30
                    JOptionPane.showMessageDialog(null, "Se rechaza el prestamo, superas el limite de años para pagar");
                }
                if (añosDevolverHipoteca < PLAZO_MINIMO) { //Años devolver el dinero menor a 5
                    JOptionPane.showMessageDialog(null, "Se rechaza el prestamo, 5 años es el minimo de años para pagar");
                }
                if ((añosDevolverHipoteca + edad) > 75){ //La suma de años de devolucion y la edad supera 75
                    JOptionPane.showMessageDialog(null, "Se rechaza el prestamo, eres demasiado mayor para poder aceptar el plazo");
                }

                
            } while (!(añosDevolverHipoteca <= PLAZO_MAXIMO && añosDevolverHipoteca >= PLAZO_MINIMO && (añosDevolverHipoteca + edad) < 75));
            
            JOptionPane.showMessageDialog(null, "Se ha aceptado su prestamo, enhorabuena!"); //Se acepta el prestamo
        } while (menu != 1);
        
        //Pruebas realizadas
        //-------------------
        //edad=18, sueldo=1500, prestamo=48_000, añosdevolucion= 15 ----> RESULTADO correcto
        //edad=17 ----> RESULTADO erroneo no cumple con la edad
        //edad=65, sueldo= 1000, prestamos = 50_000, añosdevolucion= 15 ----> RESULTADO erroneo supera los 75 años con la suma de los años de devolucion y su edad
        //edad=67 ----> RESULTADO erroneo no cumple con la edad
        //edad= 50, sueldo= 500, prestamo=50_000 ----> RESULTADO erroneo la cantidad solicitada no es menor que el sueldo anual por el valor multiplicativo
        //edad=30, sueldo=1500, prestamo=20_000, añosdevolucion= 30 ---> RESULTADO erroneo supera los años limite de devolucion
        //edad=30, sueldo=1500, prestamo=20_000, añosdevolucion= 4  ---> RESULTADO erroneo no supera los años minimos de devolucion
    }
}
