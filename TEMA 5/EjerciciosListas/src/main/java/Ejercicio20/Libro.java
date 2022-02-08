package Ejercicio20;

import java.util.Objects;

public class Libro {
    /*
    Desarrollar una lista de Libros. La funcionalidad de la lista será la habitual: conocer el número de libros
    que hay en la lista, insertar un nuevo libro (en la posición que le corresponda), eliminar el libro de una
    determinada posición y obtener el libro de una determinada posición. También incluirá un método para buscar
    de forma secuencial un libro a partir de su título (no se diferencian entre mayúsculas y minúsculas); el
    método devolverá la posición en la que se encuentra el libro (–1 si no se encuentra). Se debe crear la clase
    Libro con un par de atributos, constructores, getters y setters. De forma opcional se pueden implementar los
    método equals() y la interfaz <<Comparable>> en Libro y usar los métodos sort() y binarySearch().
     */

    private String isbn;
    private String nombre;
    private String editorial;
    private int numeroPaginas;
    private double precio;

    public Libro() {
    }

    public Libro(String isbn, String nombre, String editorial, int numeroPaginas, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) { //Se consideran dos libros iguales cuando el isbn coincidan
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, nombre, editorial, numeroPaginas, precio);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", nombre='" + nombre + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", precio=" + precio +
                '}';
    }
}
