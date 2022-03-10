import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BarajaJuego {
    private static final int TAMAÑO_BARAJA= 48; //CON COMODINES SERIA 50

    private ArrayList<Carta> mazo = new ArrayList<>(TAMAÑO_BARAJA);

    public BarajaJuego() {
        inicializarMazo();
    }

    private void inicializarMazo(){
        for (int i = 1; i <=4 ; i++) {
            String simbolo = "";
            switch (i){
                case 1:
                    simbolo="Espada";
                    break;
                case 2:
                    simbolo="Oro";
                    break;
                case 3:
                    simbolo="Sota";
                    break;
                case 4:
                    simbolo="Corona";
                    break;
            }
            for (int j = 1; j <=12 ; j++) {
                mazo.add(new Carta(simbolo,j));
            }

        }
    }

    //Muestra las cartas del mazo
    public void mostrarMazo(){
        mazo.forEach((carta)->{
            System.out.println(carta);
        });
    }

    public Carta obtenerCartaAleatoria(){
        Random rd = new Random();
        Carta cartaDevolver = mazo.get(rd.nextInt(mazo.size()));
        return cartaDevolver;
    }

    public Carta obtenerCartaNumero(int numero){
        int index = mazo.indexOf(new Carta("",numero));
        return mazo.get(index);
    }

    public void borrarCarta(Carta carta){
        mazo.remove(carta);
    }

    public void shuffleMazo(){
        Collections.shuffle(mazo);
    }

}
