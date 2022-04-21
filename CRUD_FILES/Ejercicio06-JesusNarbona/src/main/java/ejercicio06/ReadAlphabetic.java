package ejercicio06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAlphabetic {
    public static void main(String[] args) {
        //Ruta
        String route = "randomAlphabetic.csv";

        //Datos archivos
        String data = "";
        ArrayList<Integer> lineasOcurrencia = new ArrayList<>();
        int contador = 0;
        ArrayList<Integer> position = new ArrayList<>();
        //Lectura
        try (Scanner sc = new Scanner(new FileReader(route))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                data += linea + "\n";
                contador++;
                if (linea.contains("w;e;b") || linea.contains("W;E;B")) {
                    lineasOcurrencia.add(contador);
                    for (int i = 0; i < linea.length(); i++) {
                        if (linea.charAt(i) == 'w' || linea.charAt(i) == 'W') {
                            position.add(i);
                            break;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(data);
        lineasOcurrencia.forEach(valor -> {
            System.out.println(valor);
        });
    }

}
