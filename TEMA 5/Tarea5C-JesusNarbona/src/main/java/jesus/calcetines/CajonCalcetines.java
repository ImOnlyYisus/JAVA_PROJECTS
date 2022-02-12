package jesus.calcetines;

import java.util.*;

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
        boolean[] restantesConfirm =new boolean[cajon.length];
        for (int i = 0; i < cajon.length ; i++) {
            restantesConfirm[i]=false;
        }

        for (int i = 0; i <cajon.length ; i++) {
            for (int j = i+1; j < cajon.length ; j++) {
                if(cajon[i].equals(cajon[j])){
                    restantesConfirm[i]=true;
                    restantesConfirm[j]=true;
                    break;
                }
            }
        }

        ArrayList<Calcetines> sinParejaList = new ArrayList<>();
        for (int i = 0; i < restantesConfirm.length ; i++) {
            if(!restantesConfirm[i]){
                sinParejaList.add(cajon[i]);
            }
        }

        if(!sinParejaList.isEmpty()) {
            Calcetines[] sinPareja = new Calcetines[sinParejaList.size()];
            for (int i = 0; i < sinPareja.length; i++) {
                sinPareja[i] = sinParejaList.get(i);
            }

            return sinPareja;
        }

        return null;

    }

    public static void printCajon(CajonCalcetines cajon) {
        for (int i = 0; i < cajon.cajon.length; i++) {
            System.out.println(i+"-->"+"[" + cajon.cajon[i] + "]");
        }
    }

    @Override
    public String toString() {
        return "CajonCalcetines{" +
                "cajon=" + Arrays.toString(cajon) +
                '}';
    }
}
