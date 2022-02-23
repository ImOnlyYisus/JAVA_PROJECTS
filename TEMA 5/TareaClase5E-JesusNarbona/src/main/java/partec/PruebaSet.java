package partec;

import java.util.ArrayList;

public class PruebaSet {
    public static void main(String[] args) {
        Ejercito ejercitoEstepona = new Ejercito(4);

        ejercitoEstepona.alistarSoldado(new Soldado("213","Paco","Perez","Gomez",20));
        ejercitoEstepona.alistarSoldado(new Soldado("45","Alberto","dfgssad","asdad",25));
        ejercitoEstepona.alistarSoldado(new Soldado("643","Roberto","Perez","Fasd",19));
        ejercitoEstepona.alistarSoldado(new Soldado("76567","Juan","Rodriguez","Adasd",23));

        Ejercito ejercitoMalaga = new Ejercito(4);

        ejercitoMalaga.alistarSoldado(new Soldado("213","Paco","Perez","Gomez",20));
        ejercitoMalaga.alistarSoldado(new Soldado("45","Alberto","dfgssad","asdad",25));
        ejercitoMalaga.alistarSoldado(new Soldado("643","Roberto","Perez","Fasd",19));
        ejercitoMalaga.alistarSoldado(new Soldado("76567","Juan","Rodriguez","Adasd",23));

        Flancos flancosTierra = new Flancos();
        flancosTierra.añadirEjercito(ejercitoEstepona);
        flancosTierra.añadirEjercito(ejercitoMalaga);

//        flancosTierra.imprimirDatos();

        flancosTierra.imprimirEjercito(ejercitoEstepona);
    }
}
