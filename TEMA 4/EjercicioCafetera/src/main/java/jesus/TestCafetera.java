package jesus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCafetera {
    Cafetera cafeteraSinParametros = new Cafetera();
    Cafetera cafeteraConCantidadMaxima = new Cafetera(2000);
    Cafetera cafeteraConDosParamentros = new Cafetera(2000, 10);

    @Test
    void probarCafeteraSinParametro(){
        assertEquals(1000, cafeteraSinParametros.getCapacidadMaxima());
        assertEquals(0, cafeteraSinParametros.getCantidadActual());
    }

    @Test
    void probarCafeteraConCapacidadMax(){
        assertEquals(2000, cafeteraConCantidadMaxima.getCapacidadMaxima());
        assertEquals(cafeteraConCantidadMaxima.getCapacidadMaxima(),cafeteraConCantidadMaxima.getCantidadActual());
    }

    @Test
    void probarCafeteraConParametros(){
        assertEquals(2000, cafeteraConDosParamentros.getCapacidadMaxima());
        assertEquals(10, cafeteraConDosParamentros.getCantidadActual());

    }

    @Test
    void probarLlenarCafetera(){
        cafeteraSinParametros.llenarCafetera();
        cafeteraConCantidadMaxima.llenarCafetera();
        cafeteraConDosParamentros.llenarCafetera();

        assertEquals(cafeteraSinParametros.getCapacidadMaxima(),cafeteraSinParametros.getCantidadActual());
        assertEquals(cafeteraConCantidadMaxima.getCapacidadMaxima(),cafeteraConCantidadMaxima.getCantidadActual());
        assertEquals(cafeteraConDosParamentros.getCapacidadMaxima(),cafeteraConDosParamentros.getCantidadActual());
    }

    @Test
    void probarVaciarCafetera(){
        cafeteraSinParametros.vaciarCafetera();
        cafeteraConCantidadMaxima.vaciarCafetera();
        cafeteraConDosParamentros.vaciarCafetera();

        assertEquals(0,cafeteraSinParametros.getCantidadActual());
        assertEquals(0,cafeteraConCantidadMaxima.getCantidadActual());
        assertEquals(0,cafeteraConDosParamentros.getCantidadActual());
    }

    @Test
    void probarSevirTaza(){
        cafeteraSinParametros.servirTaza(2000); //Servir mas de lo que tengo
        assertEquals(0,cafeteraSinParametros.getCantidadActual());

        cafeteraConCantidadMaxima.servirTaza(100); //Servir normal
        assertEquals(cafeteraConCantidadMaxima.getCapacidadMaxima()-100,cafeteraConCantidadMaxima.getCantidadActual());

        cafeteraConDosParamentros.servirTaza(5);
        assertEquals(5,cafeteraConDosParamentros.getCantidadActual());
    }

    @Test
    void probarAgregarCafe(){
        //Sobre paso el limite de la cafetera
        assertThrows(IllegalArgumentException.class, ()-> {
                cafeteraSinParametros.agregarCafe(1500);
        });

        //Sirvo taza para que no este al maximo
        cafeteraConDosParamentros.agregarCafe(10); //Agrego y se queda en 2000 como antes
        assertEquals(20, cafeteraConDosParamentros.getCantidadActual());

    }
}
