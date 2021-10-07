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
public class Promocion {
    
    public static void main(String[] args) {
        
        // En operaciones entre long e int el tipo siempre será long, que
        // es el más grande
        
        int num1 = 23234;
        long num2 = 4432L;
        
        //int resultado = num1 + num2;   // El resultado de num+num2 es long
        long resultado = num1+num2;
        
        // RECORDAR QUE EN OPERACIONES ARITMÉTICAS EL TIPO SE PROMOCIONA AL
        // TIPO MAYOR DE LOS OPERANDOS IMPLICADOS.
        
        // Si hay en una operación enteros y reales, entonces se promociona
        // al real más grande (float o double).
       
        float a = 3.4f;
        long b = 23452L;
        
        // long res = a+b;  // Error, el tipo será float
        float res = a+b;
        
        // Si hay dos reales, al más grande
        double x = 234.234;
        float y = 234234.234f;
        
        // float res = x+y;  // Error, el tipo será double
        double res2 = x+y;
        
        
        
    }
    
}
