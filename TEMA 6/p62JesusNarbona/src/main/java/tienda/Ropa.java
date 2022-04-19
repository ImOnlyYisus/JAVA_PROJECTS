package tienda;

import java.util.Objects;

public abstract class Ropa extends Producto implements SeEnvia {
    private String marca;

    public Ropa(String codigo, double precio, double iva, String descripcion, String marca) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public Ropa() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ropa ropa = (Ropa) o;
        return Objects.equals(marca, ropa.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marca);
    }

    @Override
    public String toString() {
        return super.toString()+"\nRopa{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
