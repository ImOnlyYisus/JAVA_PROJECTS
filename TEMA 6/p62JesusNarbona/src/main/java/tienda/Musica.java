package tienda;

import java.util.Objects;

public final class Musica extends Producto{
    private String grupo;

    public Musica() {
    }

    public Musica(String codigo, double precio, double iva, String descripcion, String grupo) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Musica musica = (Musica) o;
        return Objects.equals(grupo, musica.grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grupo);
    }

    @Override
    public String toString() {
        return super.toString()+"\nMusica{" +
                "grupo='" + grupo + '\'' +
                '}';
    }
}
