
package estructurasSeleccion;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ej07 {
    public static void main(String[] args) {
        /*
            7.- Reescribe el programa anterior usando la estructura Switch.
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
        
        switch (opcion){
        
            case 1: 
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.println("Introduce el lado:");
                double ladoCuadrado = entrada.nextDouble();

                //Caluculo area
                double areaCuadrado = Math.pow(ladoCuadrado,2);
                System.out.printf("El area del cuadrado de lado [%.2f] es de: %.2f" ,ladoCuadrado, areaCuadrado);

                break;


            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduce la base: ");
                double baseTriangulo = entrada.nextDouble();
                System.out.println("Introduce la altura: ");
                double alturaTriangulo = entrada.nextDouble();

                //Calculo de area
                double areaTriangulo = ( baseTriangulo * alturaTriangulo ) /2;
                System.out.printf("El area del triangulo de base [%.2f] y altura [%.2f] es de: %.2f" , baseTriangulo, alturaTriangulo, areaTriangulo);
                
                break;

            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.println("Introduce el radio: ");
                double radioCirculo = entrada.nextDouble();

                //Caluclo area
                double areaCirculo = PI * Math.pow(radioCirculo,2);
                System.out.printf("El area del circulo de radio [%.2f] es de: %.2f", radioCirculo, areaCirculo);

                break;

            default: 
                System.out.println("Ha seleccionado terminar");
                
                break;
       	
        }
    }
}
