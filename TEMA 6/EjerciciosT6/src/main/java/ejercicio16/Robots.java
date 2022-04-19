package ejercicio16;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Robots implements Comparable<Robots> {
    private static Random rd = new Random();
    private int numeroSerie = Integer.parseInt(RandomStringUtils.randomNumeric(5));
    private int vida=rd.nextInt(101);

    public Robots() {
    }

    public Robots(int numeroSerie, int vida) {
        this.numeroSerie = numeroSerie;
        this.vida = vida;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "Robots{" +
                "numeroSerie=" + numeroSerie +
                ", vida=" + vida +
                '}';
    }

    //Orden natural por numeroSerie
    @Override
    public int compareTo(Robots robots) {
        return Integer.compare(numeroSerie,robots.getNumeroSerie());
    }
}
