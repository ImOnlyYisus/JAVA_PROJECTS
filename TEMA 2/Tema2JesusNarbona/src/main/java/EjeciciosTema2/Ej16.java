
package EjeciciosTema2;

/**
 *
 * @author jesus
 */
public class Ej16 {
    //Main para ejecucion
    public static void main(String[] args) {
        //COdigo para ejecutar
        /*
            Evalúa las siguientes expresiones del lenguaje, teniendo en cuenta las siguientes tablas de verdad:
        */
        
        //a- 67>20 && 13>12 
        boolean primerValor = 67>20 && 13>12 ;
        
        //b- 10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1 
        boolean segundoValor = 10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1;
        
        //c- !(a>b&&2*a<=b), con a = 5 y b = 3
        int a=5, b=3;
        boolean tercerValor = !(a>b&&2*a<=b);
        
        //d- a++/2<b&&(a++/2>b || (a*2<b*4)) con a = 5 y b = 3
        boolean cuartoValor = a++/2<b&&(a++/2>b || (a*2<b*4));
        
        //e- b++>3||a+b<=8&&!(a>b) con a = 5 y b = 3
        boolean quintoValor = b++>3||a+b<=8&&!(a>b);
        
        System.out.println("a- 67>20 && 13>12 ==> [" + primerValor + "]");
        System.out.println("b- 10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1 ==> [" + segundoValor + "]");
        System.out.println("c- !(a>b&&2*a<=b) ==> [" + tercerValor + "]");
        System.out.println("d- a++/2<b&&(a++/2>b || (a*2<b*4)) ==> [" + cuartoValor + "]");
        System.out.println("e- b++>3||a+b<=8&&!(a>b) ==> [" + quintoValor + "]");
        
    }
}
