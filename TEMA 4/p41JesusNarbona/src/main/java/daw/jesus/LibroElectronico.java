package daw.jesus;

import org.apache.commons.lang3.RandomStringUtils;

public class LibroElectronico {

    /*
        He puesto en public los metodos y los constructores para permitir que puedan ser accedido desde otras clases,
        sin embargo he puesto los atributos en private para que no puedan ser accedido desde otras clases y puedan cambiar su valor accediendo directamente
        a ellos, esto se le denomina encasulamiento y es un pilar fundamental en la programacion orientada a objetos.
     */

    //ATRIBUTOS
    private final String identificador = RandomStringUtils.randomNumeric(3); //Numero aleatorio entre el 000 al 999
    private String titulo;
    private int numeroPaginas =0; //Inicio valor por defecto a 0
    private double tamañoMB = 0; //Inicio valor por defecto a 0
    private int paginaActual = 1; //Incio la pagina por defecto en 1

    //CONSTRUCTORES
    public LibroElectronico() { //POR DEFECTO
        this.titulo = "Don Quijote de la Mancha";
        this.numeroPaginas = 1435;
        this.tamañoMB = 5;
    }

    public LibroElectronico(String titulo, int numeroPaginas, double tamañoMB) { //PARAMETRIZADO
        this.titulo = titulo;
        if(!(numeroPaginas>9999 || numeroPaginas<0)){ //Limitar el numero de paginas a 9999
            this.numeroPaginas=numeroPaginas;
        }
        if(!(tamañoMB>10 || tamañoMB<0)) { //Limitar el numero de MB a 10
            this.tamañoMB = tamañoMB;
        }
    }

    //GETTERS (OBTENER DATOS DE LOS ATRIBUTOS)
    public String getIdentificador() {
        return identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getTamañoMB() {
        return tamañoMB;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    //SETTERS (CAMBIAR DATOS DE LOS ATRIBUTOS)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(!(numeroPaginas>9999 || numeroPaginas<1)){ //Limitar el numero de paginas de 1 a 9999
            this.numeroPaginas=numeroPaginas;
        }
    }

    public void setTamañoMB(double tamañoMB) {
        if(!(tamañoMB>10 || tamañoMB<0)) { //Limitar el numero de MB a 10
            this.tamañoMB = tamañoMB;
        }
    }

    //TO STRING --> [SHOW DATA]
    @Override
    public String toString() {
        return "LibroElectronico{" +
                "identificador=" + identificador +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", tamañoMB=" + tamañoMB +
                ", paginaActual=" + paginaActual +
                '}';
    }

    //METODOS
    public void pasarPagina(){
        if(!((paginaActual+1)>numeroPaginas)){ //AVANZA UNA PAGINA SI EL ESTADO DE LA PAGINA ACTUAL NO ES 9999 (LIMITE)
            this.paginaActual++;
        }
    }

    public void retrocederPagina(){ //RETROCEDE UNA PAGINA SI EL ESTADO DE LA PAGINA NO ES 1 (LIMITE)
        if(!((paginaActual-1)<1)){
            this.paginaActual--;
        }
    }

    public void saltar(int numero){ //SALTA HACIA DELANTE SI ES POSITIVO Y SALTA HACIA DETRAS SIS ES NEGATIVO
        if(paginaActual+numero>=1 && paginaActual+numero<=numeroPaginas){
            paginaActual+=numero;
        }
    }

}
