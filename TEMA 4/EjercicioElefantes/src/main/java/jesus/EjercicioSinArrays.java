package jesus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioSinArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto peso aguanta la tela?");
        double pesoTela= sc.nextDouble();
        double pesoElefantes=0;
        double pesoElefantesTotal=0;
        double contadorElefantes=0;
        do{
            boolean verificarNumero=true;
            do{
                verificarNumero=true;
                System.out.println("Cuanto pesa el elefante:");
                try {
                    pesoElefantes=sc.nextDouble();
                }catch (InputMismatchException ime){
                    verificarNumero=!verificarNumero;
                    System.out.println("Introduce un numero!");
                    sc.nextLine();
                }

            }while(!verificarNumero);

            pesoElefantesTotal+=pesoElefantes;

            if(pesoElefantesTotal<=pesoTela){
                contadorElefantes++;
            }

        }while(pesoElefantes!=0);
            if(pesoElefantesTotal<=pesoTela){
                contadorElefantes--;
            }
        if(pesoElefantesTotal>pesoTela) {
            System.out.printf("Se puedieron montar %.0f el siguiente se cayó, ya que no soportaba el peso de la tela", contadorElefantes);
        }else{
            System.out.printf("Se puedieron montar %.0f y se balancearon", contadorElefantes);
        }
    }


}
