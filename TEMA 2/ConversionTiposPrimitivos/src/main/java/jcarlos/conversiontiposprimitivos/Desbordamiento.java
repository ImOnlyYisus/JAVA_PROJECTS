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
public class Desbordamiento {
    
    public static void main(String[] args) {
        
        int numero1 = 100;
        int numero2 = 1_000_000_000; // Mil millones
        
        int numeroGrande = numero1*numero2;
        
        // Valor esperado 100_000_000_000
        // Rango de los int -2_147_483_648 hasta 2_147_483_647 (inclusive)
        // Se produce desbordamiento
        
        System.out.println(numeroGrande);
      
        
        // En operaciones entre números, si la operación se desborda 
        // (queda fuera del rango), el compilador no da error pero 
        // arroja un valor erróneo
        
        // Probamos a guardar en un long
        long numeroMuyGrande = numero1*numero2;
        System.out.println(numeroMuyGrande);
        
        // numero1*numero2 es una operación entre int y el resultado será int,
        // se desborda y se guarda el resultado erróneo en el long
        
        // Si forzamos la operación a long el resultado es correcto
        numeroMuyGrande = numero1*(long)numero2;
        System.out.println(numeroMuyGrande);
       
        // Otro ejemplo de desbordamiento
        numero1 = Integer.MAX_VALUE; // Mayor valor posible de los int
        System.out.println("Número mayor de los int: " + numero1);
        numero1 +=1; // Se desborda
        System.out.println("Después de sumar 1: " + numero1); 
        
    }
    
}
