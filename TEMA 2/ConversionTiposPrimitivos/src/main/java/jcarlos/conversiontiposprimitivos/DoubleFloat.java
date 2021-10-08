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
public class DoubleFloat {
    
    public static void main(String[] args) {
        
        // El valor esperado sería 2.5 pero el compilador realiza la
        // división entera y obvia los decimales. Al final guarda el resultado
        // sin esos decimales
        double resultado = 5/2;  // Pérdida de información
        System.out.println(resultado);
        
        // En este caso se guarda un int en un double (promoción de tipo)
        double valor = 4;
        System.out.println(valor);
    }
    
}
