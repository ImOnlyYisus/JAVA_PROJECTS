package ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ej1 {
    //EJ1 JESUS NARBONA AGUILAR
    public static void main(String[] args) {
        //OBJETIVO CALCULAR ax²+bx+c = 0
        //DATOS INTRODUCIR: A,B,C JOption
        //Mostrar con consola
        //CONDICIONES:
        //A=0 Y B=0, MENSAJE NO TIENE SOLUCION
        //A=0 Y B!=0, X=-C/B
        //FORMULAS: ...
        //CONSIDERAR QUE B² -4AC NO PUEDE SER NEGATIVO, MOSTRAR MENSAJE

        //SCANNER
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double resultadoEcuacionX1;
        double resultadoEcuacionX2;

        //DATOS DE ENTRADA
        String aTxt = JOptionPane.showInputDialog(null, "Dame el valor de a");
        String bTxt = JOptionPane.showInputDialog(null, "Dame el valor de b");
        String cTxt = JOptionPane.showInputDialog(null, "Dame el valor de c");

        //STRING TO DOUBLE
        a = Double.parseDouble(aTxt);
        b = Double.parseDouble(bTxt);
        c = Double.parseDouble(cTxt);

        if (a == 0 && b == 0) { //TRUE SI A=0 Y B=0
            System.out.println("La ecuacion no tiene solución");
        } else if (a == 0 && b != 0) { //TRUE SI A=0 Y B!=0
            resultadoEcuacionX1 = -c / b;
            System.out.println("El resultado de la ecuacion es: " + resultadoEcuacionX1);
        } else {
            if ((Math.pow(b, 2) - (4 * a * c)) < 0) { //TRUE SI B²-4AC ES NEGATIVO
                System.out.println("Los valores suministrados no permiten calcular la ecuacion");
            } else {
                double parteRaiz = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
                resultadoEcuacionX1 = (-b + parteRaiz) / (2 * a);
                resultadoEcuacionX2 = (-b - parteRaiz) / (2 * a);
                System.out.println("El resultado de la ecuacion es : \nx1=" + resultadoEcuacionX1 +
                        "\nx2=" + resultadoEcuacionX2);
            }
        }
    }
}
