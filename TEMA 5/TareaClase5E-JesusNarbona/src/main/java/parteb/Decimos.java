package parteb;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Decimos {
    private Map<String, Integer> decimos;

    public Decimos() {
        this.decimos = new HashMap<>();
        insertarNumeros();
    }

    private void insertarNumeros() {
        for (int i = 0; i <= 1000; i++) {
            String numero = "0000";
            if (i <= 9) {
                numero = "000" + i;
            } else if (i <= 99) {
                numero = "00" + i;
            } else if (i <= 999) {
                numero = "0" + i;
            } else {
                numero = "" + i;
            }

            decimos.put(numero,generarPremio());
        }
    }

    private int generarPremio() {
        Random rd = new Random();
        int premio = 0;
        int probabilidad = rd.nextInt(50);

        if(probabilidad==50){
            premio=100_000_000;
        } else if(probabilidad>=45 && probabilidad<50){
            premio=50_000_000;
        } else if(probabilidad>=30 && probabilidad<45){
            premio=10_000;
        } else if(probabilidad>=20 && probabilidad<30){
            premio=500;
        } else if(probabilidad>10 && probabilidad<20){
            premio=50;
        } else{
            premio=0;
        }

        return premio;
    }

    public void mostrarDatos(){
        decimos.forEach((key,valor)->{
            System.out.println("Decimo: "+ key + "--> premio:"+valor);
        });
    }

    public void mostrarPremioDecimo(String decimo){
        if(decimos.containsKey(decimo)){
            System.out.println(decimos.get(decimo) + "€");
        }
    }
}
