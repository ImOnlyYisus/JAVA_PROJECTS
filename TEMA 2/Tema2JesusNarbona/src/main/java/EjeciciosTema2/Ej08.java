
package EjeciciosTema2;

/**
 *
 * @author jesus
 */
public class Ej08 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo a ejecutar
        /*
            Crea una nueva clase llamada Ej08, que contenga una llamada al método public static void main(String[] args).
            La aplicación Java contendrá comentarios descriptivos del código y realice lo siguiente:
        */
        
        //a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
        int a=10, b=5, i=0;
        
        //b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
        double c=71.3, d=4.8;
        
        //c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d. El resultado de cada operación
        //    se almacena en una nuevas variables que se crearán para tal efecto.
        //Operaciones int
        int primeraOperacion = a+b;
        int segundaOperacion = a-b;
        int terceraOperacion = a*b;
        int cuartaOperacion = a/b;
        
        //Operaciones double
        double quintaOperacion = c+d;
        double sextaOperacion = c-d;
        double septimaOperacion = c*d;
        double octavaOperacion = c/d;
        
        //d.- Muestra el resultado de cada operación, usando las variables creadas en el paso c).
        System.out.println("OPERACIONES INT\n"
                + "-----------------------------\n"
                + "a + b = " + primeraOperacion + "\n"
                + "a - b = " + segundaOperacion + "\n"
                + "a * b = " + terceraOperacion + "\n"
                + "a / b = " + cuartaOperacion + "\n\n"
                + "OPERACIONES DOUBLE\n"
                + "-----------------------------\n"
                + "c +d = " + quintaOperacion + "\n"
                + "c - d = " + sextaOperacion + "\n"
                + "c * d = " + septimaOperacion + "\n"
                + "c / d = " + octavaOperacion + "\n\n");
        
        //e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
        System.out.println("a*=3 --> " + (a*=3) + "\tb-=1--> " + (b-=1) + "\ta/=b-->" + (a/=b) + "\tc+=d-->" + (a+=d) + "\n\n");
        
        //f.- Finalmente, el programa muestra en consola la siguiente información, en distintas instrucciones: valor de i, valor de i++,
        //    valor de i y valor de ++i.
        System.out.println("i= " + i);
        System.out.println("i++ -->" + (i++));
        System.out.println("i= " + i);
        System.out.println("++i-->" + (++i));
        System.out.println("i= " + i);
        
        

        

    }
}
