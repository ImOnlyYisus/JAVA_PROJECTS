package tienda;

import java.util.Objects;

public abstract class Libro extends Producto implements Comparable<Libro>{
    private String isbn;

    public Libro() {
    }

    public Libro(String codigo, double precio, double iva, String descripcion, String isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
    public abstract void abrirLibro();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn);
    }

    @Override
    public String toString() {
        return super.toString()+"\nLibro{" +
                "isbn='" + isbn + '\'' +
                '}';
    }

    //Orden natural por el isbn del libro
    @Override
    public int compareTo(Libro libro) {
        return this.isbn.compareToIgnoreCase(libro.isbn);
    }
}
