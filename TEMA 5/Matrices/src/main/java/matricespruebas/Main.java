package matricespruebas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 1, 2},
                {3, 4, 5, 6}
        };
//        recorrerFila(2,matriz);
//        recorrerColumna(0,matriz);
        recorrerVecinas(0, 0, matriz);
    }

    public static void recorrerFila(int x, int[][] matriz) {
        if (matriz.length >= x && x >= 0) {
            for (int i = 0; i < matriz[x].length; i++) {
                System.out.print(matriz[x][i] + "\t");
            }
        }

    }

    public static void recorrerColumna(int x, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length >= x && x >= 0) {
                System.out.println(matriz[i][x]);
            }
        }
    }

    public static void recorrerVecinas(int i, int j, int[][] matriz) {
        if ((i >= 0 && j >= 0) && matriz.length >= i && matriz[i].length >= j) {
            int[] minimoCoordenada = {i - 1, j - 1};
            int[] maximoCoordenada = {i + 1, j + 1};

            if (minimoCoordenada[0] < 0) {
                minimoCoordenada[0]++;
            }

            if (maximoCoordenada[0] >= matriz.length) {
                maximoCoordenada[0]--;
            }

            for (int k = minimoCoordenada[0]; k <= maximoCoordenada[0]; k++) {
                if(minimoCoordenada[1]<0){
                    minimoCoordenada[1]++;
                }
                if(maximoCoordenada[1]>= matriz[k].length){
                    maximoCoordenada[1]--;
                }

                for (int l = minimoCoordenada[1]; l <=maximoCoordenada[1] ; l++) {
                    if(k == i && j == l){
                        System.out.print("X\t");
                    }else{
                        System.out.print(matriz[k][l]+"\t");
                    }
                }
                System.out.println();
            }

        }
    }
}
