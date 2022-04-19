package tienda;

import java.util.Objects;

public final class LibroDigital extends Libro implements SeDescarga{
    private int numKBytes;

    public LibroDigital() {
    }

    public LibroDigital(String codigo, double precio, double iva, String descripcion, String isbn, int numKBytes) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numKBytes = numKBytes;
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public void abrirLibro() {
        System.out.println("Abriendo el libro digital en google chrome");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibroDigital that = (LibroDigital) o;
        return numKBytes == that.numKBytes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numKBytes);
    }

    @Override
    public String toString() {
        return super.toString()+"\nLibroDigital{" +
                "numKBytes=" + numKBytes +
                '}';
    }

    @Override
    public void descargar() {
        System.out.println("http://jesusnarbona.daw/"+this.hashCode());
    }
}
