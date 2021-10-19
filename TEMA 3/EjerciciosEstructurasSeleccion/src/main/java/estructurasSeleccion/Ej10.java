
package estructurasSeleccion;

/**
 *
 * @author jesus
 */
public class Ej10 {
    public static void main(String[] args) {
        /*
            10.- Modifica el código anterior para que variable2 valga 30.
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
                break; //Solucion
            case 4:
                variable2=10;
                break; //Solucion
            default:
                variable2=100;
                break; 
        }
        
        System.out.println(variable2);
    }
}
