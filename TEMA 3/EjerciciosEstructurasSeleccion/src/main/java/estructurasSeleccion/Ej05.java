
package estructurasSeleccion;

//Importamos clases
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej05 {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecutar
        /*
            5.- Implementa y completa el siguiente programa. Ten en cuenta que cuando se entre en cada una de las opciones (1,2 o 3) el programa realice su función.
                Esto es, si se selecciona la opción 1, el programa debe entrar en la parte de calcular el área de un cuadrado y debe solicitar los dos lados y mostrar el resultado.
                Así con el resto de opciones.
        */
        final double PI = 3.14159265359;
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
 
        //Menu de opciones
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
 
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
 
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduce el lado:");
            double ladoCuadrado = entrada.nextDouble();
            
            //Caluculo area
            double areaCuadrado = Math.pow(ladoCuadrado,2);
            System.out.printf("El area del cuadrado de lado [%.2f] es de: %.2f" ,ladoCuadrado, areaCuadrado);
            
        } 
        else if (opcion == 2){
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
            System.out.println("Introduce la base: ");
            double baseTriangulo = entrada.nextDouble();
            System.out.println("Introduce la altura: ");
            double alturaTriangulo = entrada.nextDouble();
            
            //Calculo de area
            double areaTriangulo = ( baseTriangulo * alturaTriangulo ) /2;
            System.out.printf("El area del triangulo de base [%.2f] y altura [%.2f] es de: %.2f" , baseTriangulo, alturaTriangulo, areaTriangulo);
        } 
        else if (opcion == 3){
            System.out.println("Ha seleccionado calcular el área de un círculo...");
            System.out.println("Introduce el radio: ");
            double radioCirculo = entrada.nextDouble();
            
            //Caluclo area
            double areaCirculo = PI * Math.pow(radioCirculo,2);
            System.out.printf("El area del circulo de radio [%.2f] es de: %.2f", radioCirculo, areaCirculo);
        } 
        else {
            System.out.println("Ha seleccionado terminar");
       	}     
   	

    }
}
