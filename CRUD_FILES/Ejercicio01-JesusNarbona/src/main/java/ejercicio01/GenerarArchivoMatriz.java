package ejercicio01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerarArchivoMatriz {
    public static void main(String[] args) {
        //Ruta relativa para guardar el archivo
        String route = "matriz.txt";

        Matriz matriz = new Matriz(4,4);

        //Ficheros
        BufferedWriter bw = null;
        FileWriter fw = null;

        try{
            //Crear el fichero
            bw = new BufferedWriter(new FileWriter(route));

            //Escribir en el fichero
            for (int i = 0; i <matriz.getMatriz().length ; i++) {
                for (int j = 0; j <matriz.getMatriz()[i].length ; j++) {
                    bw.write(matriz.getMatriz()[i][j]+"\t");
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
