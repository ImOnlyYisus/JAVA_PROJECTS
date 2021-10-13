
package EjeciciosTema2;

/**
 *
 * @author jesus
 */
public class Ej10 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            10.-Crea una nueva clase llamada Ej10, que contenga una llamada al método public static void main(String[] args).
                La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
                
                
                c.- Muestra en pantalla el resultado de las operaciones !verdadero y !falso.
        */
        
        //a.-Declara e inicializa dos variables lógicas, una se llamará verdadero y valdrá true, la otra falso y valdrá false.
        boolean verdadero = true;
        boolean falso = false;
        
        //b.-Muestra las tablas de verdad de las operaciones lógicas && (AND) y || (OR), usando las variables verdadero y falso.
        boolean operacionLogicaAnd = (verdadero == falso) && (verdadero == true);
        boolean operacionLogicaOr = (verdadero == falso) || (verdadero == true);
        
        //c.- Muestra en pantalla el resultado de las operaciones !verdadero y !falso.
        System.out.println("(verdadero == falso) && (verdadero == true) ==>" + "(" + verdadero + "==" + falso +") && (" + verdadero + "==" + true +")");
        System.out.println("Entonces la operacion logica anterior es igual a " + operacionLogicaAnd);
        
        System.out.println("(verdadero == falso) || (verdadero == true) ==>" + "(" + verdadero + "==" + falso +") || (" + verdadero + "==" + true +")");
        System.out.println("Entonces la operacion logica anterior es igual a " + operacionLogicaOr);
    }
}
