package ejercicio1;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja() {
        inicializarBaraja();
    }

    private void inicializarBaraja(){
        for (int i = 0; i <4 ; i++) {
            for (int j = 1; j <=12 ; j++) {
                Palos palo = null;
                switch (i){
                    case 0:
                        palo = Palos.TREBOLES;
                        break;
                    case 1:
                        palo = Palos.CORAZONES;
                        break;
                    case 2:
                        palo = Palos.PICAS;
                        break;
                    case 3:
                        palo = Palos.ROMBOS;
                        break;
                }

                String numero=""+j;
                int valor = 0;
                numero = j==1 ? "A" : numero;
                numero = j==10 ? "J" : numero;
                numero = j==11 ? "Q" : numero;
                numero = j==12 ? "K" : numero;

                valor= j==1 ? 14 : j;

                Carta carta = new Carta();
                carta.setNumero(numero);
                carta.setPalo(Palos.PICAS);
                carta.setValor(valor);
                baraja.add(carta);

            }
        }
    }

    public void mostrarBaraja(){
        this.baraja.forEach(System.out::println);
    }
}
