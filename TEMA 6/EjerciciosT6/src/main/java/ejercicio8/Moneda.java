package ejercicio8;

import java.util.Random;

public class Moneda extends Azar{
    public Moneda() {
        this.posibilidades=2;
    }

    @Override
    public int lanzar() {
        Random rd = new Random();
        return rd.nextInt(posibilidades)+1;
    }
}
