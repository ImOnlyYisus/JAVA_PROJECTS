package jesus;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinaAdivinanzaJesus {
    /*
        |-------------------------------------------------------------|
        |              ~~~ METODO MAIN ~~~                            |
        |-------------------------------------------------------------|
    */
    public static void main(String[] args) {
        //CONSTANTES
        final int vidas = 3;

        //VARIABLES
        boolean victoria = false;

        //INFORMACION PARA EL JUGADOR
        System.out.println("Bienvenido al juego");
        System.out.println("Debes de adivinar el numero...");
        System.out.println("Tienes 3 oportunidades.");

        //RANGOS DE NUMEROS SOLICITADOS
        System.out.println("Dime el rango de numeros en el que quieres adivinar");
        System.out.println("Desde:");
        int inicioRango =  pedirNumero();
        System.out.println("Hasta:");
        int finalRango = pedirNumero();

        //GENERO NUMERO ALEATORIO
        int numeroAleatorio= generarAleatorio(inicioRango,finalRango);

        //LOGICA DEL JUEGO: 3 VIDAS, EN EL CASO DE QUE LO ACIERTE SALE Y GUARDA EN UNA VARIABLE SI HA GANADO, EN EL OTRO CASO PIERDE
        for(int i=1; i <= vidas; i++){

            System.out.println("Intento numero [" + i + "]: ");
            int numeroSugerido = pedirNumero();

            if(numeroEsMayor(numeroAleatorio, numeroSugerido)){
                System.out.println((i<3) ? "El numero es mayor" : "Se acabo el juego");
            } else if(!numeroEsMayor(numeroAleatorio, numeroSugerido)){
                System.out.println((i<3) ? "El numero es menor" : "Se acabo el juego");
            } else{
                victoria = true;
                break;
            }
        }

        //COMPRUEBA SI HA GANADO O PERDIDO
        if(victoria){
            System.out.println("Enhorabuena el numero era ["+ numeroAleatorio +"]");
        } else{
            System.out.println("Lo siento has perdido el numero era ["+ numeroAleatorio +"]");
        }

    }

    /*
        |--------------------------------------------------------------|
        |               ~~~METODOS CREADOS~~~                          |
        |--------------------------------------------------------------|
    */
    //METODO QUE PIDE UN NUMERO HASTA QUE SEA CORRECTO, CUANDO ES CORRECTO DEVUELVE EL NUMERO
    private static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        boolean esCorrecto = true;
        int numero=0;
        do{
            esCorrecto = true;
            try {
                numero = sc.nextInt();
            } catch (InputMismatchException ime){
                esCorrecto = false;
                System.out.println("Introduce un numero!");
                sc.nextLine();
            }
        }while(!esCorrecto);

        return numero;
    }

    //METODO QUE GENERA UN NUMERO ALEATORIO ENTRE DOS RANGOS QUE SON PASADOS POR PARAMENTROS, DEVUELVE EL NUMERO GENERADO
    private static int generarAleatorio(int inicioRango, int finalRango){
        Random random = new Random();
        int cambioDeOrden;

        //Controlo si el numero inicial es mayor al final, en caso de que lo sean se cambian los valores de las variables entre ellas
        if(inicioRango>finalRango){
            cambioDeOrden= inicioRango;
            inicioRango = finalRango;
            finalRango = cambioDeOrden;
        }

        return (random.nextInt(finalRango - inicioRango +1) + inicioRango);
    }

    //METODO QUE COMPRUEBA SI ES MAYOR O MENOR, DEVUELVE TRUE SI ES MAYOR, FALSE SI ES MENOR
    private static boolean numeroEsMayor(int primerNumero, int segundoNumero){
        return (primerNumero>segundoNumero);
    }


}
