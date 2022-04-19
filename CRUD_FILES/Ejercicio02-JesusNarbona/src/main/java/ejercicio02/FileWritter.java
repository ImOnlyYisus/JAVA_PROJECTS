package ejercicio02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {
    public static void main(String[] args) {
        String route= "teclado.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(route))){
            InputText it = new InputText();
            bw.write(it.getText());
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
