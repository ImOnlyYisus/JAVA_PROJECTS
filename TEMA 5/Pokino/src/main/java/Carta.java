import java.util.Objects;

public class Carta{
    private String simbolo;
    private int numero;

    public Carta(String simbolo, int numero) {
        this.simbolo = simbolo;
        this.numero = numero;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "simbolo='" + simbolo + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return numero == carta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(simbolo, numero);
    }
}
