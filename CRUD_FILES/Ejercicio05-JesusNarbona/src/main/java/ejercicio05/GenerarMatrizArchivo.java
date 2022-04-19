package ejercicio05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerarMatrizArchivo {
    private static int[][] matriz;

    public static void imprimirMatriz(){
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        String route = "matriz.txt";
        String matrizRead ="";
        ArrayList<String[]> objetosDeMatriz = new ArrayList<>();

        try (Scanner sc = new Scanner(new FileReader(route))){
            while(sc.hasNextLine()){
                matrizRead=sc.nextLine();
                String[] splitData = matrizRead.split("\\s");
                objetosDeMatriz.add(splitData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        matriz= new int[objetosDeMatriz.size()][objetosDeMatriz.size()];
        for (int i = 0; i <objetosDeMatriz.size() ; i++) {
            for (int j = 0; j <objetosDeMatriz.get(i).length ; j++) {
                matriz[i][j]=Integer.parseInt(objetosDeMatriz.get(i)[j]);
            }
        }

        GenerarMatrizArchivo.imprimirMatriz();

    }

}
