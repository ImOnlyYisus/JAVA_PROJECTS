package jesus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
    Utilidades(){
    }

    public int leerDia(){
        Scanner sc= new Scanner(System.in);
        int numero=0;
        do{
            boolean verificarInt= true;
            do {
                verificarInt=true;
                try {
                    numero=sc.nextInt();
                }catch (InputMismatchException ime){
                    verificarInt=!verificarInt;
                    sc.nextLine();
                }
            }while (!verificarInt);
        }while (!(numero>=1 || numero<=31));

        return numero;
    }

    public int leerMes(){
        Scanner sc= new Scanner(System.in);
        int numero=0;
        do{
            boolean verificarInt= true;
            do {
                verificarInt=true;
                try {
                    numero=sc.nextInt();
                }catch (InputMismatchException ime){
                    verificarInt=!verificarInt;
                    sc.nextLine();
                }
            }while (!verificarInt);
        }while (!(numero>=1 || numero<=12));

        return numero;
    }

    public int leerAnio(){
        Scanner sc= new Scanner(System.in);
        int numero=0;
        do{
            boolean verificarInt= true;
            do {
                verificarInt=true;
                try {
                    numero=sc.nextInt();
                }catch (InputMismatchException ime){
                    verificarInt=!verificarInt;
                    sc.nextLine();
                }
            }while (!verificarInt);
        }while (!(numero>=1900 || numero<=2100));

        return numero;
    }

}
