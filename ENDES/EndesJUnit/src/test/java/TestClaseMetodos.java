import javaapptest1.Metodos;
import org.junit.Test;

import java.lang.reflect.Executable;

import static org.junit.Assert.*;

public class TestClaseMetodos {
    @Test
    public void testTallasExtraPequeña(){
        Metodos metodo = new Metodos();
        String clasificacion = metodo.Tallas("XS");
        assertNotEquals(null,clasificacion);
        assertEquals("Extra pequeña", clasificacion);
    }

    @Test
    public void testTallasPequeña(){
        Metodos metodo = new Metodos();
        String clasificacion = metodo.Tallas("S");
        assertNotEquals(null,clasificacion);
        assertEquals("Pequeña", clasificacion);
    }

    @Test
    public void testTallasMediana(){
        Metodos metodo = new Metodos();
        String clasificacion = metodo.Tallas("M");
        assertNotEquals(null,clasificacion);
        assertEquals("Mediana", clasificacion);
    }

    @Test
    public void testTallasGrande(){
        Metodos metodo = new Metodos();
        String clasificacion = metodo.Tallas("L");
        assertNotEquals(null,clasificacion);
        assertEquals("Grande", clasificacion);
    }

    @Test
    public void testTallasMuyGrande(){
        Metodos metodo = new Metodos();
        String clasificacion = metodo.Tallas("XL");
        assertNotEquals(null,clasificacion);
        assertEquals("Muy grande", clasificacion);
    }

    @Test
    public void testTallasExtraGrande(){
        Metodos metodo = new Metodos();
        String clasificacion = metodo.Tallas("XXL");
        assertNotEquals(null,clasificacion);
        assertEquals("Extra grande", clasificacion);
    }

    @Test
    public void testIva(){
        Metodos metodos= new Metodos();

        double ivaPrueba=metodos.iva(10);

        assertNotEquals(0.0, ivaPrueba);
        assertEquals(12.1,ivaPrueba,2);
    }

    @Test
    public void testTallaDiferente(){
        Metodos metodos=new Metodos();

        String clasificacion= metodos.Tallas("no esta");

        assertNotEquals(null,clasificacion);
        assertEquals("XS",clasificacion);
    }

}
