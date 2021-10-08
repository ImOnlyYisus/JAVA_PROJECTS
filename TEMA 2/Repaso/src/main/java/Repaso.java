
import java.util.Scanner;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jesus
 */
public class Repaso {
    public static void main(String[] args) {
        //Declaracion de variables
        int var1, var2;
        
        //Cuidado con los nombre --> CamelCase
        double estaturaPersona;
        
        //Inicializacion de variables
        var1 = 12;
        var2 = 13;
        
        //Declaracion y inicializacion
        float pesoPersona = 67.5f;
        long milMillonesDeDinero = 23_000_000_000L;
        
        //Constantes
        final boolean SIEMPRE_SI = true;
        final double SUPLEMENTO = 123.45;
        
        //Los valores concretos de un tipo son literales
        long numero1 = 23; //ES un entero dentro de un long (conversion implicita)
        long numero2 = (long)23; //conversion explicita
        
        //Math ceil(redondea al entero mayor)
        System.out.println(Math.ceil(3.4));
        
        //Math floor(redondea al menor)
        System.out.println(Math.floor(4.9));
        
        //Math round(redondea al mas proximo)
        System.out.println(Math.round(4.2));
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.8));
        
        //Lectura teclado
        /*
        Scanner entradaTeclado = new Scanner(System.in);
        
        
        
        System.out.println("Peso persona: ");
        pesoPersona = entradaTeclado.nextFloat();
        
        System.out.println("Estatura persona: ");
        estaturaPersona = entradaTeclado.nextDouble();
        
        entradaTeclado.nextLine(); //Para limpiar el buffer
        System.out.println("Nombre: ");
        String nombre = entradaTeclado.nextLine(); 
        
        //IMC = peso / estatura²
        double IMC = pesoPersona / Math.pow(estaturaPersona,2);
        System.out.printf("%s, El IMC es de: %.2f", nombre ,IMC);
        */
        
        //JOption
        String nombre = JOptionPane.showInputDialog(null,"Introduce tu apellido");
        String dineroString = JOptionPane.showInputDialog(null, "Introduce el dinero para sobornar al de programacion");
        double dinero = Double.parseDouble(dineroString);
        
        JOptionPane.showMessageDialog(null, "El de programacion recibe " + (SUPLEMENTO + dinero) + ", de parte de " + nombre);
                
               
        
    }
}
