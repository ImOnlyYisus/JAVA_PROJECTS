package tienda;

import java.sql.SQLOutput;
import java.util.Objects;

public final class Pantalon extends Ropa {
    private String talla;

    public Pantalon(String codigo, double precio, double iva, String descripcion, String marca, String talla) {
        super(codigo, precio, iva, descripcion, marca);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pantalon pantalon = (Pantalon) o;
        return Objects.equals(talla, pantalon.talla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), talla);
    }

    @Override
    public void enviar(String direccion) {
        System.out.println(super.toString() + "\n" + this.getClass().getSimpleName() + "\n" +
                "Enviado a: " +direccion);
    }

    @Override
    public String toString() {
        return super.toString()+"\nPantalon{" +
                "talla='" + talla + '\'' +
                '}';
    }
}
