package canciones.jesus;

import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
    private String nombre;
    private int minutosDuracion;
    private String artista;
    private int añoLanzamiento;

    public Cancion(String nombre, int minutosDuracion, String artista, int añoLanzamiento) {
        this.nombre = nombre;
        this.minutosDuracion = minutosDuracion;
        this.artista = artista;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(int minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    @Override
    public boolean equals(Object o) { //Considero que son iguales cuando el autor y el titulo son iguales
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(nombre, cancion.nombre) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, minutosDuracion, artista, añoLanzamiento);
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", minutosDuracion=" + minutosDuracion +
                ", artista='" + artista + '\'' +
                ", añoLanzamiento=" + añoLanzamiento +
                '}';
    }

    @Override
    public int compareTo(Cancion o) { //COMPARA POR NOMBRE, ARTISTA, AÑO LANZAMIENTO Y MINUTOS DURACION
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
}
