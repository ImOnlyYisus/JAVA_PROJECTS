package ejercicio14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Silencioso> silenciosos = new ArrayList<>();

        silenciosos.add(new Frigorifico(200,"Boss",200));
        silenciosos.add(new Microondas(100,"Pavana",300));
        //silenciosos.add(new CampanaExtractora(300,"Pavana",300)); No se puede instanciar porque no implementa la interfaz Silencioso

        for (Silencioso silencioso : silenciosos) {
            System.out.println(silencioso);
            silencioso.silencio();
            System.out.println();

        }
    }
}
