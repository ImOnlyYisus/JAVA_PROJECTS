import java.util.Random;

public class Carton {
    private Carta[][] carton = new Carta[5][5];
    private BarajaJuego barajaEjemplo = new BarajaJuego();

    public Carton() {
        inicializarCarton();
    }


    private void inicializarCarton(){
        for (int i = 0; i < carton.length; i++) {
            if (i == 0) {
                Random rd = new Random();
                int posicionDistinta = rd.nextInt(carton[i].length);
                int numeroCartaSelec =barajaEjemplo.obtenerCartaAleatoria().getNumero();
                for (int j = 0; j <carton[i].length ; j++) {
                    if(posicionDistinta==j){
                        carton[i][j] = barajaEjemplo.obtenerCartaAleatoria();
                        barajaEjemplo.borrarCarta(carton[i][j]);
                    } else{
                        carton[i][j] = barajaEjemplo.obtenerCartaNumero(numeroCartaSelec);
                        barajaEjemplo.borrarCarta(carton[i][j]);
                    }

                }
            } else {
                for (int j = 0; j < carton[i].length; j++) {
                    carton[i][j] = barajaEjemplo.obtenerCartaAleatoria();
                    barajaEjemplo.borrarCarta(carton[i][j]);
                }
            }

        }
    }

    public void imprimirCarton() {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                System.out.print(carton[i][j].getNumero() + "-" + carton[i][j].getSimbolo() + "\t\t\t");
            }
            System.out.println();
        }
    }
}
