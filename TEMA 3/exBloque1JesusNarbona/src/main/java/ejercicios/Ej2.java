package ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ej2 {
    //EJ2 JESUS NARBONA AGUILAR
    public static void main(String[] args) {
        //OBJETIVO CALCULAR ax²+bx+c = 0
        //DATOS INTRODUCIR: A,B,C JOption (EN EL CASO DE QUE NO SE CUMPLAN REPETIR PARA EL DATO CORRECTO)
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
        boolean formatoCorrecto = true;

        //DATOS DE ENTRADA
        do { //SE REPITE HASTA QUE EL FORMATO DEL NUMERO "a" SEA CORRECTO
            formatoCorrecto = true;
            String aTxt = JOptionPane.showInputDialog(null, "Dame el valor de a");
            try {
                a = Double.parseDouble(aTxt);
            } catch (NumberFormatException nfe) {
                System.out.println("Debes de introducir un formato correcto");
                formatoCorrecto = !formatoCorrecto;
            }
        } while (!formatoCorrecto);

        do { //SE REPITE HASTA QUE EL FORMATO DEL NUMERO "b" SEA CORRECTO
            formatoCorrecto = true;
            String bTxt = JOptionPane.showInputDialog(null, "Dame el valor de b");
            try {
                b = Double.parseDouble(bTxt);
            } catch (NumberFormatException nfe) {
                System.out.println("Debes de introducir un formato correcto");
                formatoCorrecto = !formatoCorrecto;
            }
        } while (!formatoCorrecto);

        do { //SE REPITE HASTA QUE EL FORMATO DEL NUMERO "c" SEA CORRECTO
            formatoCorrecto = true;
            String cTxt = JOptionPane.showInputDialog(null, "Dame el valor de c");
            try {
                c = Double.parseDouble(cTxt);
            } catch (NumberFormatException nfe) {
                System.out.println("Debes de introducir un formato correcto");
                formatoCorrecto = !formatoCorrecto;
            }
        } while (!formatoCorrecto);

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
