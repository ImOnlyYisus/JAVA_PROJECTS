package EjercicioParecido20;

import java.util.Objects;

public class Peliculas {
    private String titulo;
    private String idioma;
    private String director;
    private String tipoPelicula;

    public Peliculas(String titulo, String idioma, String director, String tipoPelicula) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.director = director;
        this.tipoPelicula = tipoPelicula;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", idioma='" + idioma + '\'' +
                ", director='" + director + '\'' +
                ", tipoPelicula='" + tipoPelicula + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return Objects.equals(titulo, peliculas.titulo)  && Objects.equals(director, peliculas.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, idioma, director, tipoPelicula);
    }
}
