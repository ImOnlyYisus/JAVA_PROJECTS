package jesus.calcetines;

import java.util.Objects;
import java.util.Random;

public class Calcetines{
    private Colores color; //negro, gris_claro, gris_oscuro
    private int talla ; //{40,41,42,43}
    private static int[] tallasPosibles= {40,41,42,43};
    private static Colores[] coloresPosibles ={Colores.NEGRO,Colores.GRIS_CLARO,Colores.GRIS_OSCURO};

    private static Random rd = new Random();
    public Calcetines() {
        this.talla=tallasPosibles[rd.nextInt(tallasPosibles.length)];
        this.color=coloresPosibles[rd.nextInt(coloresPosibles.length)];

    }



    public Colores getColor() {
        return color;
    }

    public int getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        return color + ", "+talla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calcetines that = (Calcetines) o;
        return talla == that.talla && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, talla);
    }

}
