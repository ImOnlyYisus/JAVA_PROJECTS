
package jesus;

/**
 *
 * @author jesus
 */
public class ej03 {
    public static void main(String[] args) {
        /*
            3.- Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. No se introducen valores por teclado.
        */
        
        int numero = 15;
        
        for(int z=0; z<=25; z++ ){
            System.out.println(numero);
            numero*=2;
        }
//        int contador = 0;
        
//        while (contador<=25){
//            System.out.println(numero);
//            numero*=2;
//            contador++;
//        }
    }
}
