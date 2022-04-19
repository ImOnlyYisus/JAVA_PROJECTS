package ejercicio03;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomChar {
    private String linea = "";

    public RandomChar() {
        generarLinea();
    }

    private void generarLinea() {
        String roundChar = "";
        do {
            roundChar = RandomStringUtils.randomAlphabetic(1);
            linea += roundChar + ";";

        } while (!roundChar.equalsIgnoreCase("g"));
    }

    public String getLinea() {
        return linea;
    }

    public static void main(String[] args) {
        RandomChar rc = new RandomChar();
        System.out.println(rc.getLinea());
    }
}
