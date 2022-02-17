package jesus.ejercicio5d.parteb.ejercicio5d.parteb;

import java.util.ArrayList;

public class PruebaTreeSet {
    public static void main(String[] args) {
        Ejercito ejercito = new Ejercito(4);

        ejercito.alistarSoldado(new Soldado("213","Paco","Perez","Gomez",20));
        ejercito.alistarSoldado(new Soldado("45","Alberto","dfgssad","asdad",25));
        ejercito.alistarSoldado(new Soldado("643","Roberto","Perez","Fasd",19));
        ejercito.alistarSoldado(new Soldado("76567","Juan","Rodriguez","Adasd",23));
        ArrayList<Soldado> soldados = ejercito.sacarSoldados();
        soldados.forEach(System.out::println);
        System.out.println("Numero de soldados: "+ ejercito.numeroSoldados());

        ejercito.quitarSoldado(new Soldado("45","","","",0));
        System.out.println("Numero de soldados: "+ ejercito.numeroSoldados());

        System.out.println(ejercito.buscarSoldado(new Soldado("213","","","",0)));

    }
}
