package ejercicio01;

public class Matriz {
    private int[][] matriz;

    public Matriz(int filas, int columnas) {
        this.matriz = new int[filas][columnas];
        initMatriz();
    }

    private void initMatriz(){
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                int numI = i+1;
                matriz[i][j]=(100*numI) + j;
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
