package partec;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Flancos {
    private Map<Integer,Ejercito> flancos;
    private static int countId = 0;

    public Flancos() {
        this.flancos = new HashMap<>();
    }

    public void añadirEjercito(Ejercito ejercito){
        flancos.put(countId,ejercito);
        countId++;
    }

    public void imprimirDatos(){
        flancos.forEach((key,valor)->{
            System.out.println("Clave:"+key+" Valor:"+valor);
        });
    }

    public void imprimirEjercito(Ejercito ejercito){
        if(flancos.containsValue(ejercito)){
            flancos.forEach((key,valor)->{
                if(valor.equals(ejercito)){
                    System.out.println(valor);
                }
            });
        }
    }
}
