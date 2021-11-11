
package jesus;

import java.util.Scanner;


/**
 *
 * @author jesus
 */
public class ejercicioBancoJesusMetodos {
    
    //METODO QUE COMPRUEBA LA EDAD ENTRE 18 Y 65, devuelve true si la edad es valida y false si la edad es no valida
    private static boolean comprobarEdad (int edad){
        final int EDAD_MAXIMA = 65;
        final int EDAD_MINIMA = 18;

        return (edad < (EDAD_MINIMA) || edad > EDAD_MAXIMA);
    }

    //METODO QUE COMPRUEBA SI EL DINERO A SOLICITAR ES MAYOR A L SUELDO * EL FACTOR MULT. , es true si es valido, si es no valido es false
    private static boolean comprobarValor(double sueldoAnual, double dineroPedir, double factorMultiplicativo){
        boolean acceso= true;

        return (dineroPedir>(sueldoAnual*factorMultiplicativo));
    }

    //METODO QUE MIRA SI EL PLAZO DE DEVOLUCION ENTRE 5 Y 30 AÑOS, si es valido devuelve true, si no devuelve false
    private static boolean comprobarDevolucionDinero(int años, int edad){
        final int PLAZO_MINIMO = 5;
        final int PLAZO_MAXIMO = 30;

        return (años > PLAZO_MAXIMO || años < PLAZO_MINIMO || (años+edad) > 75);
    }
    
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
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //Constantes
        final int MESES_DE_UN_AÑO = 12;
        final double FACTOR_MULTIPLICATIVO_TETIMO = 5.85;
        final int PLAZO_MINIMO = 5;
        final int PLAZO_MAXIMO = 30;
        
        //Variables
        boolean acceso;
        int edad; 
        
        
        do { //COMPRUEBA SI LA EDAD ES VALIDA
            System.out.println("Dime su edad:");
            edad = sc.nextInt();
            acceso = comprobarEdad(edad);

            if(!acceso){
                System.out.println("Debes de estar en el rango de edad (18-65)");
            }

        } while (!acceso);
        
        do{ //COMPRUEBA SI EL DINERO SOLICITADO ES VALIDO
            System.out.println("Dime su sueldo mensual:");
            double sueldoAnual = (sc.nextDouble()) * MESES_DE_UN_AÑO;
            System.out.println("Cuanto dinero quiere pedir:");
            double dineroPedir = sc.nextDouble();
            
            acceso = comprobarValor(sueldoAnual, dineroPedir, FACTOR_MULTIPLICATIVO_TETIMO);

            if(!acceso){
                System.out.println("El dinero a pedir es mayor al su sueldo por el factor multiplicativo");
            }

        }while(!acceso);
        
        do{ //COMPRUEBA SI EL TIEMPO DE DEVOLUCION ES CORRECTO
            System.out.println("En cuantos años quieres devolverlo:");
            int tiempoDevolver = sc.nextInt();
            
            acceso = comprobarDevolucionDinero(tiempoDevolver, edad);

            if(!acceso){
                if (tiempoDevolver > PLAZO_MAXIMO) { //Años devolver el dinero mayor a 30
                    System.out.println("Se rechaza el prestamo, superas el limite de años para pagar");
                } else if (tiempoDevolver < PLAZO_MINIMO) { //Años devolver el dinero menor a 5
                    System.out.println("Se rechaza el prestamo, 5 años es el minimo de años para pagar");
                } else { //La suma de años de devolucion y la edad supera 75
                    System.out.println("Se rechaza el prestamo, eres demasiado mayor para poder aceptar el plazo");
                }
            }
        } while(!acceso);
        
        System.out.println("Se le concede el prestamo");
        
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
