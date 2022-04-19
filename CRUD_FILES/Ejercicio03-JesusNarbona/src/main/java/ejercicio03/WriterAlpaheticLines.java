package ejercicio03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterAlpaheticLines {
    public static void main(String[] args) {
        String route = "randomAlphabetic.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(route))){
            for (int i = 0; i <75 ; i++) {
                RandomChar rc = new RandomChar();
                bw.write(rc.getLinea());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
