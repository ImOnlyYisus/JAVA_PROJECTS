package ejercicio11;

import org.apache.commons.lang3.RandomStringUtils;

import javax.xml.bind.annotation.*;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

@XmlRootElement(name = "app")
@XmlAccessorType(XmlAccessType.FIELD)

public class App {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double tamañoKB;
    private int numeroDescargas;

    private static int instacias;
    private static Random rd = new Random();
    private static String[] descripciones = {"App para escuchar musica", "App para la escucha de peticiones http", "App que revisa la temperatura",
            "App que seleciona los alumnos de un colegio", "App que evalua un grupo de persona", "App de seleccion de CV", "App que muestra el estado de su vehiculo",
            "App para jugar", "App para ver videos en straming", "App para llevar las cuentas de un empresario"};

    //Constructores
    public App() {
        this.codigo = instacias;
        this.nombre = "app" + this.codigo + RandomStringUtils.randomAlphabetic(1).toLowerCase();
        this.descripcion = descripciones[rd.nextInt(descripciones.length)];
        DoubleStream doubles = rd.doubles(1, 100.0, 1024.0);
        this.tamañoKB = doubles.max().getAsDouble(); //TODO: No se como se devuelve el Stream a int sin hacer algo asi

        IntStream ints = rd.ints(1, 0, 50000);
        this.numeroDescargas = ints.min().getAsInt(); //TODO: No se como se devuelve el Stream a int sin hacer algo asi

        instacias++;
    }

    public App(int codigo, String nombre, String descripcion, double tamañoKB, int numeroDescargas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamañoKB = tamañoKB;
        this.numeroDescargas = numeroDescargas;
        instacias++;
    }

    //Getter y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTamañoKB() {
        return tamañoKB;
    }

    public void setTamañoKB(double tamañoKB) {
        this.tamañoKB = tamañoKB;
    }

    public int getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(int numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    //toString

    @Override
    public String toString() {
        return codigo +
                ";" + nombre +
                ";" + descripcion +
                ";" + tamañoKB +
                ";" + numeroDescargas;
    }

    public static void main(String[] args) {
        App ap1 = new App();
        System.out.println(ap1);
    }
}
