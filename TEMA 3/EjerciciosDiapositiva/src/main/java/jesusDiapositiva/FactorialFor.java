/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jesusDiapositiva;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class FactorialFor {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        
        int factorial=1;
        System.out.println("Introduzca un numero para calcular su factorial:");
        int numeroParaCalcular= entradaTeclado.nextInt();
                
        for(int i=1; i<=numeroParaCalcular;i++){
            factorial=i*factorial;
        }
        
        System.out.println("El factorial de "+numeroParaCalcular+" es --> "+factorial);
    }
}
