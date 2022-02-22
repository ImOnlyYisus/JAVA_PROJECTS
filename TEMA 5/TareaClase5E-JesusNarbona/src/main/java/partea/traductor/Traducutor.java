package partea.traductor;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Traducutor {
    private TreeMap<String,String> traductor;

    public Traducutor() {
        this.traductor = new TreeMap<>();
    }

    public void introducirPalabra(String ingles, String español){
        traductor.put(ingles, español);
    }

    public void imprimirValores(){
        for (String key : traductor.keySet()) {
            System.out.printf("[Ingles] %s -- [Español] %s %n", key, traductor.get(key));
        }
    }

    public void quitarPalabra(String palabra){
        traductor.remove(palabra);
    }

    public void modificarPalabra(String palabra, String palabraEspañol){
        if(traductor.containsKey(palabra)){
            traductor.put(palabra,palabraEspañol);
        }
    }

    public Set<String> devolverPalabrasIngles(){
        Set<String> ingles = new HashSet<>();
        traductor.forEach((key,valor)-> ingles.add(key));

        return ingles;
    }

    public Set<String> devolverPalabrasEspañol(){
        Set<String> español = new HashSet<>();
        traductor.forEach((key,valor)-> español.add(valor));

        return español;
    }
}
