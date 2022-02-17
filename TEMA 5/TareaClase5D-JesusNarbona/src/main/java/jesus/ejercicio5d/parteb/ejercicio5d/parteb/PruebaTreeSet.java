package jesus.ejercicio5d.parteb.ejercicio5d.parteb;

import java.util.ArrayList;

public class PruebaTreeSet {
    public static void main(String[] args) {
        EjercitoOrdenado ejercitoOrdenado = new EjercitoOrdenado(4);

        ejercitoOrdenado.alistarSoldado(new Soldado("213","Paco","Perez","Gomez",20));
        ejercitoOrdenado.alistarSoldado(new Soldado("45","Alberto","dfgssad","asdad",25));
        ejercitoOrdenado.alistarSoldado(new Soldado("643","Roberto","Perez","Fasd",19));
        ejercitoOrdenado.alistarSoldado(new Soldado("76567","Juan","Rodriguez","Adasd",23));
        ArrayList<Soldado> soldados = ejercitoOrdenado.sacarSoldados();
        soldados.forEach(System.out::println);
        System.out.println("Numero de soldados: "+ ejercitoOrdenado.numeroSoldados());

        ejercitoOrdenado.quitarSoldado(new Soldado("45","","","",0));
        System.out.println("Numero de soldados: "+ ejercitoOrdenado.numeroSoldados());

        System.out.println(ejercitoOrdenado.buscarSoldado(new Soldado("213","","","",0)));

    }
}
