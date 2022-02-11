package jesus.calcetines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class CajonCalcetines {
    private static Random rd = new Random();
    private Calcetines[] cajon;

    public CajonCalcetines() { //Constructor genera un cajon lleno de calcetines de tamaño entre 10 y 20
        this.cajon = new Calcetines[rd.nextInt(21) + 10];
        llenarCajon();
    }

    private void llenarCajon() { //Rellenar el array con calcetines
        for (int i = 0; i < cajon.length; i++) {
            cajon[i] = new Calcetines();
        }
    }

    public Calcetines[] parejar() {
        ArrayList<Calcetines> cajonCopia = new ArrayList<>();

        for (int i = 0; i < this.cajon.length; i++) {
            cajonCopia.add(this.cajon[i]);
        }

        for (int i = 0; i < cajonCopia.size(); i++) {
            for (int j = 0; j < cajonCopia.size() ; j++) {
                if(cajonCopia.get(i).equals(cajonCopia.get(j))){
                    Calcetines c= cajonCopia.get(i);
                    cajonCopia.remove(c);
                    cajonCopia.remove(c);
                }
            }
        }

        if (!cajonCopia.isEmpty()) {
            Calcetines[] parejas = new Calcetines[cajonCopia.size()];
            for (int i = 0; i < cajonCopia.size(); i++) {
                parejas[i] = cajonCopia.get(i);
            }
            return parejas;
        }

        return null;
    }

    public static void printCajon(CajonCalcetines cajon) {
        for (int i = 0; i < cajon.cajon.length; i++) {
            System.out.println("[" + cajon.cajon[i] + "]");
        }
    }

    @Override
    public String toString() {
        return "CajonCalcetines{" +
                "cajon=" + Arrays.toString(cajon) +
                '}';
    }
}
