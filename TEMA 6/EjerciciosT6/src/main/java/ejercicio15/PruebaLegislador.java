package ejercicio15;

import java.util.ArrayList;

public class PruebaLegislador {
    public static void main(String[] args) {
        ArrayList<Legislador> listaLegis = new ArrayList<>();

        listaLegis.add(new Diputado("paco","Rodz","Cadiz","PP",12));
        listaLegis.add(new Senador("pepe","fdz","Malaga","VOX",14.3));

        listaLegis.forEach((legislador)->{
            System.out.println(legislador.getCamara());
        });
    }
}
