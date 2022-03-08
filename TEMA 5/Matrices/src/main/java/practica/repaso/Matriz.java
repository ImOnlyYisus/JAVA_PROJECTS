package practica.repaso;

import java.nio.charset.CoderResult;
import java.util.Random;

public class Matriz {
    private static Random rd = new Random();
    private boolean[][] matriz = new boolean[rd.nextInt(11)+3][rd.nextInt(11)+3]; //Tamaño entre 3-10
//            {
//                    {true, false, false},
//                    {false, false, false},
//                    {false, false, false}
//            };

    public Matriz() { //Inicializo con valores aletorios
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                matriz[i][j]=rd.nextBoolean();
            }
        }
    }

    //Método para imprimir la matriz
    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("" + matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }

    //Crear un metodo que dada la matriz, encuentre la primera casilla que sea true
    //y este rodeada de false en sus vecinas. El metodo devuelve un objeto Coordenada
    public Coordenada casillaRodeadasDeFalse() {
        Coordenada coordenada;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]) { //Busco algun true
                    boolean rodeado = casillasVecinas(i, j);

                    if (rodeado) { //Si lo ha encontrado
                        coordenada = new Coordenada(i, j);
                        return coordenada;
                    }

                }
            }
        }
        return null;
    }

    public boolean casillasVecinas(int i, int j) {
        int[] minimo = {i - 1, j - 1};
        int[] maximo = {i + 1, j + 1};

        if (minimo[0] < 0) {
            minimo[0]++;
        }

        if (maximo[0] >= matriz.length) {
            maximo[0]--;
        }

        for (int k = minimo[0]; k <= maximo[0]; k++) {
            if (minimo[1] < 0) {
                minimo[1]++;
            }
            if (maximo[1] >= matriz[k].length) {
                maximo[1]--;
            }

            for (int l = minimo[1]; l <= maximo[1]; l++) {
                if (k != i || j != l) {
                    if (matriz[k][l]) {
                        return false;
                    }

                }
            }
        }

        return true;
    }


}
