
package estructurasSeleccion;

/**
 *
 * @author jesus
 */
public class Ej09 {
    public static void main(String[] args) {
        /*
            9.- ¿Cuánto vale variable2 al finalizar la ejecución del switch?
        */
        
        int variable=3, variable2;
        switch(variable){

            case 1:
                variable2=5;
                break;
            case 2:
                variable2=20;
                break;
            case 3:
                variable2=30;
            case 4:
                variable2=10;
            default:
                variable2=100;
                break; 
        }
        
        System.out.println(variable2);
        
        //Resultado el valor de variable 2 es 100 ya que no cumple con la condiciones y toma el valor por default que es 100
    }
}
