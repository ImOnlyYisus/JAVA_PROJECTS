package ejercicio20.jesusnarbona;

import java.util.ArrayList;

public class Cartelera {
    private ArrayList<Peliculas> cartelera;

    public Cartelera() {
        this.cartelera = new ArrayList<>();
    }

    public void insertPelicula(Peliculas pelicula){
        cartelera.add(pelicula);
    }

    public void imprimirPeliculas(){ //IMPRIMIR DATOS DE LA LISTA
        cartelera.forEach(e -> {
            System.out.println("["+e+"]");
        });
    }

    public boolean modificar(Peliculas peliculas, Peliculas peliculaNueva){ //Modificar una pelicula pasando la pelicula que quieres modificar
        int index=cartelera.indexOf(peliculas);
        if(index!=-1){
            cartelera.set(index,peliculaNueva);
            return true;
        }

        return false;
    }

    public boolean removePelicula(Peliculas pelicula){ //REMOVER UNA PELICULA SEGUN EL OBJETO PASADO, DEVUELVE TRUE SI SE REALIZA Y FALSE
        if(cartelera.remove(pelicula)){
            return true;
        }
        return false;
    }

    public int numeroPeliculas(){
        return cartelera.size();
    } //OBTENER EL NUMERO DE DATOS DE LA LISTA

    //BUSCAR DATOS
    public ArrayList<Peliculas> buscarPeliculaDirector(String director){ //BUSQUEDA POR DIRECTOR
        ArrayList<Peliculas> catalogoBuscado = new ArrayList<>();

        for (Peliculas pelicula: cartelera) {
            if(pelicula.getDirector().equalsIgnoreCase(director)){
                catalogoBuscado.add(pelicula);
            }
        }
        return catalogoBuscado;
    }

    public ArrayList<Peliculas> buscarPeliculaTitulo(String titulo){ //BUSQUEDA POR TITULO
        ArrayList<Peliculas> catalogoBuscado = new ArrayList<>();

        for (Peliculas pelicula: cartelera) {
            if(pelicula.getTitulo().equalsIgnoreCase(titulo)){
                catalogoBuscado.add(pelicula);
            }
        }
        return catalogoBuscado;
    }

    public ArrayList<Peliculas> buscarPeliculaIdioma(String idioma){ //BUSQUEDA POR IDIOMA
        ArrayList<Peliculas> catalogoBuscado = new ArrayList<>();

        for (Peliculas pelicula: cartelera) {
            if(pelicula.getIdioma().equalsIgnoreCase(idioma)){
                catalogoBuscado.add(pelicula);
            }
        }
        return catalogoBuscado;
    }

    public ArrayList<Peliculas> buscarPeliculaTipo(String tipo){ //BUSQUEDA POR TIPO DE PELICULA
        ArrayList<Peliculas> catalogoBuscado = new ArrayList<>();

        for (Peliculas pelicula: cartelera) {
            if(pelicula.getTipoPelicula().equalsIgnoreCase(tipo)){
                catalogoBuscado.add(pelicula);
            }
        }
        return catalogoBuscado;
    }
}
