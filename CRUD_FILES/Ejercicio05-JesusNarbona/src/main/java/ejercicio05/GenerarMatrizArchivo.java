package ejercicio05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerarMatrizArchivo {
    public static void main(String[] args) {
        //Ruta del archivo
        String route = "matriz.txt";

        String matrizRead ="";
        int suma=0;

        //Leer el archivo
        try (Scanner sc = new Scanner(new FileReader(route))){
            while(sc.hasNextLine()){
                matrizRead=sc.nextLine();
                String[] splitData = matrizRead.split("\\s");
                for (int i = 0; i <splitData.length ; i++) {
                    suma+=Integer.parseInt(splitData[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(suma);

    }

}
