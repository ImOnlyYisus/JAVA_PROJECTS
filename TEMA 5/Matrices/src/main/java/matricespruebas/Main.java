package matricespruebas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},
                          {4,5,6,7},
                          {8,9,1,2},
                          {3,4,5,6}
        };
//        recorrerFila(2,matriz);
//        recorrerColumna(0,matriz);
        recorrerVecinas(1,1,matriz);
    }

    public static void recorrerFila(int x, int[][] matriz){
        if(matriz.length>=x && x>= 0){
            for (int i = 0; i <matriz[x].length ; i++) {
                System.out.print(matriz[x][i]+"\t");
            }
        }

    }

    public static void recorrerColumna(int x, int[][] matriz){
        for (int i = 0; i <matriz.length ; i++) {
            if(matriz[i].length>=x && x>=0){
                System.out.println(matriz[i][x]);
            }
        }
    }

    public static void recorrerVecinas(int i, int j, int[][] matriz){
        if((i>=0 && j>=0) && matriz.length>=i && matriz[i].length>=j){
            int iUp = i+1;
            int iDown = i-1;
            int jLeft=j-1;
            int jRight=j+1;

            for (int k = iUp; k >=iDown ; k--) {
                for (int l = jLeft; l <=jRight; l++) {
                    if(k==i && l==j){
                        System.out.print("X\t");
                    }else{
                        System.out.print(matriz[k][l]+"\t");
                    }

                }
                System.out.println();
//                System.out.println(Arrays.toString(matriz[k]));
            }

        }
    }
}
