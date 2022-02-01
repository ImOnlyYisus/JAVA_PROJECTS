package javaapptest1;

import java.util.Scanner;

public class JavaAppTest1 {

    public static void main(String[] args) {
        // TODO code application logic here
        ClasificacionTallas();
    }

    public static void ClasificacionTallas(){
        Scanner in = new Scanner(System.in);
        String talla;
        double precio = 0;
        System.out.println("Introduzca la talla:(XS,S,M,L,XL,XXL)");
        talla = in.next().toUpperCase();
        System.out.println("Introduzca el precio");
        precio = in.nextDouble();
        Metodos met = new Metodos();
        System.out.println();
        System.out.println("La talla es: "+ met.Tallas(talla));
        System.out.println("El precio final es: " + met.iva(precio));
    }

}

