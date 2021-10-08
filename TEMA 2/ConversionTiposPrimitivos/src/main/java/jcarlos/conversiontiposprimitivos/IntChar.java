/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.conversiontiposprimitivos;

/**
 *
 * @author JCarlos F.Vico <jfervic933@maralboran.es>
 */
public class IntChar {
    
    public static void main(String[] args) {
        
        // Recordar que un char no deja de ser un número de 16 bits
        // por lo tanto, almacena cualquier valor de 0 a 65536
        
        // Conversión implícita, asignamos un valor constante int a un char
        // Esto es posible porque está dentro del rango y es constante
        char letra1 = 99; // correcto, a pesar de estar guardando un int
        
        // char letra = -4;     // Error, fuera de rango del char
        // char letra = 70000;  // Error, fuera de rango del char
        
        // Se imprime la letra representada por el número 99, que es la c
        // Ver tabla de caracteres Unicode
        System.out.println(letra1);
        
        int numerito = 100;
        // Asignamos numerito a un char, error porque los tipos son diferentes
        // En este caso, numerito vale 100 pero podría valer -50, 
        // lo que provocaría un error si se guarda en un char, por eso hay
        // necesidad de conversión explícita
        // char<--int
        char letra2 = (char)numerito;
        
        // Si la variable es final y dentro del rango char, no hay error
        final int numerito2 = 100;
        char letra3 = numerito2;
        
        // También podemos asignar un char a un int, ya que guarda el número que 
        // representa la letra 'd'
        // Conversión implícita. int<--char
        int letra4 = 'd';
        char x = 'x';
        int equis = x;
        
        System.out.println(letra4); // Se imprime el número que representa a 'd'
        System.out.println(equis); // Se imprime el número que representa a 'x'
    }
    
}
