package jesus;

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
            System.out.println("Cuanto pesa el elefante:");
            pesoElefantes=sc.nextDouble();
            pesoElefantesTotal+=pesoElefantes;

            if(pesoElefantesTotal<=pesoTela){
                contadorElefantes++;
            }

        }while(pesoElefantes!=0);
        System.out.printf("Se puedieron montar %.0f el siguiente se cayó, ya que no soportaba el peso de la tela", contadorElefantes);
    }


}
