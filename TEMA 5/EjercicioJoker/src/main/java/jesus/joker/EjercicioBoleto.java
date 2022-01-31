package jesus.joker;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EjercicioBoleto {

    public static void main(String[] args) {
        int[] boletoAleatorio = generarBoleto();
        System.out.println(Arrays.toString(boletoAleatorio));
        int[] boletoUsuario=generarBoletoUsuario();

        //Comprobar boletos
        int comprobarBoletos=comprobarBoletos(boletoAleatorio,boletoUsuario);
        if(comprobarBoletos==1){
            System.out.println("Sale JOKER MALO, coiciden los numero pero en diferentes posiciones");
        } else if(comprobarBoletos==0){
            System.out.println("Sale JOKER BUENO, los numero son identicos");
        } else{
            System.out.println("No sale nada, no coinciden todos los numeros");
        }
    }

    private static int [] generarBoleto(){
        Random rd= new Random();
        int [] boleto = new int[7];

        for (int i = 0; i <boleto.length ; i++) {
            boleto[i]=rd.nextInt(boleto.length)+1; //Numeros del 0 al 7
        }

        return boleto;
    }

    private static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        int numero=0;
        boolean verificarNum= true;

        do {
            verificarNum=true;
            System.out.println("Introduce un numero:");
            try {
                numero=sc.nextInt();
            }catch (InputMismatchException ime){
                System.out.println("Introduce un numero!");
                sc.nextLine();
                verificarNum=!verificarNum;
            }
        }while (!verificarNum);

        return numero;
    }

    private static int[] generarBoletoUsuario(){
        int [] arrayUsuario = new int [7];

        for (int i = 0; i <arrayUsuario.length ; i++) {
            int numeroPedido= 0;

            do {
                System.out.println("Introduce un numero para el indice ["+i+"]:");
                numeroPedido=pedirNumero();
                if(numeroPedido<0 || numeroPedido>7){
                    System.out.println("Debes de introducir un numero del 0-7!");
                }
                arrayUsuario[i] = numeroPedido;
            }while(numeroPedido<0 || numeroPedido>7);


        }

        return arrayUsuario;
    }

    private static int comprobarBoletos(int[] boletoBueno, int[] boletoUsuario){ //Si devuelve 0 es joker bueno, significa qeu estan exactamente iguales
        // (a:a), si devuelve 1 es que tiene los mismo numero pero desordenados, y si devuelve -1 es que no coinciden
        int tipoJoker=0; //0 joker bueno, 1 joker malo, -1 no hay joker

        for (int i = 0; i <boletoBueno.length ; i++) {
            if(boletoBueno[i]!=boletoUsuario[i]){
                tipoJoker=-1;
                break;
            }
        }
        if(tipoJoker==-1){
            Arrays.sort(boletoBueno);
            Arrays.sort(boletoUsuario);
            for (int i = 0; i <boletoBueno.length ; i++) {
                if(boletoBueno[i]!=boletoUsuario[i]){
                    tipoJoker=-1;
                    break;
                } else{
                    tipoJoker=1;
                }
            }
        }

        return tipoJoker;
    }
}
