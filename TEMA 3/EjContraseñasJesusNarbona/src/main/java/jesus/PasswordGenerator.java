package jesus;

import java.util.Random;

public class PasswordGenerator {

    /*
        Vamos a crear contraseñas aleatorias que cumplan las siguientes restricciones:
        - 4 números (entre 0 y 9) distintos(no se pueden repetir ninguno de los 4 números)
        - La suma de los dígitos 1 y 4 debe de ser impar
        - La multiplicación de los dígitos 2 y 3 debe de ser par
        - Además de los 4 números debe de tener 1 letra aleatoria (entre F y X Mayúscula)
     */

    public static void main(String[] args) {
        //VARIABLE CONTRASEÑA
        String password="";
        int primerDigito = 0;
        int segundoDigito = 0;
        int tercerDigito = 0;
        int cuartoDigito = 0;

        //SE REPITE HASTA QUE:
        // LOS NUMEROS TIENEN QUE SER DISTINTOS ENTRE ELLOS
        // LA SUMA DEL PRIMERO Y EL CUARTO TIENE QUE SER IMPAR
        // LA MULTIPLICACION DEL SEGUNDO Y EL TERCERO DEBE SER PAR
        do {
            primerDigito = generarRandom(0,9);
            segundoDigito = generarRandom(0,9);
            tercerDigito = generarRandom(0,9);
            cuartoDigito = generarRandom(0,9);

        }while((primerDigito == segundoDigito || primerDigito == tercerDigito || primerDigito == cuartoDigito ||
                segundoDigito == tercerDigito || segundoDigito == cuartoDigito || tercerDigito == cuartoDigito) ||
                ((primerDigito+cuartoDigito)%2==0) || (segundoDigito*tercerDigito)%2!=0);

        //AÑADO LETRA MAYUSCULA DE LA "F" A LA "X", F=70 y X=88
        password=""+primerDigito+segundoDigito+tercerDigito+cuartoDigito+(char)generarRandom(70,88);

        System.out.println(password);


    }

    //METODO PARA GENERAR UN NUMERO RANDOM, DEVUELVE EL NUMERO RANDOM
    private static int generarRandom(int inicioRandom, int finalRandom){
        Random random = new Random();

        return(random.nextInt(finalRandom-inicioRandom+1)+inicioRandom);
    }
}
