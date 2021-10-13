
package EjeciciosTema2;

/**
 *
 * @author jesus
 */
public class Ej06 {
    
    //Main para ejecutar
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
        6.- Crea una nueva clase llamada Ej06, que contenga una llamada al método public static void main(String[] args). La aplicación Java contendrá comentarios descriptivos
            del código e intercambiará los valores de dos variables de tipo entero, haciendo uso de una tercera variable auxiliar. Antes de intercambiar los valores, debes declarar
            e inicializar las variables con los valores que tú quieras. Muestra los valores de las variables antes de intercambiar sus valores y después del intercambio.
        */
        
        //Resumen intercambiar valores var1 a var2 utilizando aux
            //Declaramos las variables int
                int var1 = 10;
                int var2 = 20;
                int aux;
                
            //Valores inciales de variables
                System.out.println("VALOR INICIAL:\t" + "VAR1-->" + var1 + "\tVAR2-->" + var2);
            
            //Valor de aux = var1 (aux = 10)
                aux = var1;
                System.out.println("VALOR DE AUX = VAR1 :\t" + "VAR1-->" + var1 + "\tVAR2-->" + var2 + "\tAUX-->" + aux);
                
            //Valor de var1 = var2 (var1 = 20)
                var1 = var2;
                System.out.println("VALOR DE VAR1 = VAR2 :\t" + "VAR1-->" + var1 + "\tVAR2-->" + var2 + "\tAUX-->" + aux);
                
                //Cambio de valor en var2 a aux (var = 10)
                    var2 = aux; 
                    System.out.println("CAMBIO VALOR VAR2 :\t" + "VAR1-->" + var1 + "\tVAR2-->" + var2 + "\tAUX-->" + aux);
    }
}
