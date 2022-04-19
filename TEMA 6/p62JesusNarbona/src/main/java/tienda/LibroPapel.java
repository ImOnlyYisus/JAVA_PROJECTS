package tienda;

import java.util.Objects;

public final class LibroPapel extends Libro implements SeEnvia{
    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(String codigo, double precio, double iva, String descripcion, String isbn, int numPaginas) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void abrirLibro() {
        System.out.println("Abriendo el libro fisico");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibroPapel that = (LibroPapel) o;
        return numPaginas == that.numPaginas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPaginas);
    }

    @Override
    public String toString() {
        return super.toString()+"\nLibroPapel{" +
                "numPaginas=" + numPaginas +
                '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println(super.toString() + "\n" + this.getClass().getSimpleName() + "\n" +
                "Enviado a: " +direccion);
    }
}
