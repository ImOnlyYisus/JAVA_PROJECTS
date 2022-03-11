package ejercicio4;

public class Teatro {
    private int filas;
    private int columnas;

    private int[][] asientos; //Si es 0 es libre, si es 1 es reservado y si es -1 es que esta cogido por covid

    public Teatro(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;

        asientos = new int[filas][columnas];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (((i + 1) % 2.0) != 0 && ((j + 1) % 2.0) != 0) {
                    asientos[i][j] = 0;
                } else {
                    asientos[i][j] = -1;
                }

            }
        }
    }

    public void imprimirAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                switch (asientos[i][j]) {
                    case -1:
                        System.out.print("X\t");
                        break;
                    case 0:
                        System.out.print("L\t");
                        break;
                    case 1:
                        System.out.print("V\t");
                        break;
                }
            }
            System.out.println();
        }
    }

    public void reservar(int fila, int columnas) {
        if (fila >= 1 && columnas >= 1 && fila < asientos.length && columnas < asientos[fila].length) {
            if (asientos[fila - 1][columnas - 1] == 0) {
                asientos[fila - 1][columnas - 1] = 1;
            }
        }
    }

    public void cancelar(int fila, int columnas) {
        if (fila >= 1 && columnas >= 1 && fila < asientos.length && columnas < asientos[fila].length) {
            if (asientos[fila - 1][columnas - 1] == 1) {
                asientos[fila - 1][columnas - 1] = 0;
            }
        }
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

}
