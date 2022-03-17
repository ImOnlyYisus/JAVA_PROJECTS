package ejercicio8;

import java.util.Random;

public class Dado extends Azar{

    public Dado(int posibilidades) {
        this.posibilidades=posibilidades;
    }

    @Override
    public int lanzar() {
        Random rd = new Random();
        return rd.nextInt(posibilidades)+1;
    }
}
