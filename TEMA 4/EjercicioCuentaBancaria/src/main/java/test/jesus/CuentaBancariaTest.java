package test.jesus; 

import jesus.CuentaBancaria;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaBancariaTest {
    CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
    CuentaBancaria cuentaBancaria2 = new CuentaBancaria("233324F","Juanito",1000.63,2.1);

    /**
     * Method: getNumeroCuenta()
     */
    @Test
    public void testGetNumeroCuenta() {
        assertNotEquals(0, cuentaBancaria1.getNumeroCuenta());
    }

    /**
     * Method: getNIF()
     */
    @Test
    public void testGetNIF() {
        assertNotEquals(0, cuentaBancaria2.getNIF());
        assertEquals("233324F", cuentaBancaria2.getNIF());
    }

    /**
     * Method: getNombreCliente()
     */
    @Test
    public void testGetNombreCliente() {
        assertNotEquals(null, cuentaBancaria2.getNombreCliente());
        assertEquals("Juanito", cuentaBancaria2.getNombreCliente());
    }

    /**
     * Method: getSaldoActual()
     */
    @Test
    public void testGetSaldoActual() {
        assertNotEquals(0, cuentaBancaria2.getSaldoActual(), 0.00);
        assertEquals(1000.63, cuentaBancaria2.getSaldoActual(), 0.00);
    }

    /**
     * Method: getInteresAnual()
     */
    @Test
    public void testGetInteresAnual() {
        assertEquals(0.1, cuentaBancaria1.getInteresAnual(), 0.00);
        assertNotEquals(0, cuentaBancaria2.getInteresAnual(), 0.00);
        assertEquals(2.1, cuentaBancaria2.getInteresAnual(), 0.00);
    }

    /**
     * Method: setNIF(String NIF)
     */
    @Test
    public void testSetNIF() {
        cuentaBancaria1.setNIF("213123a");
        assertNotEquals("", cuentaBancaria1.getNIF());
        assertEquals("213123a", cuentaBancaria1.getNIF());
    }

    /**
     * Method: setNombreCliente(String nombreCliente)
     */
    @Test
    public void testSetNombreCliente() {
        cuentaBancaria1.setNombreCliente("Pepe");

        assertNotEquals("", cuentaBancaria1.getNombreCliente());
        assertEquals("Pepe", cuentaBancaria1.getNombreCliente());
    }

    /**
     * Method: setSaldoActual(double saldoActual)
     */
    @Test
    public void testSetSaldoActual() {
        cuentaBancaria1.setSaldoActual(2000.12);

        assertNotEquals(0.0, cuentaBancaria1.getSaldoActual(), 0.00);
        assertEquals(2000.12, cuentaBancaria1.getSaldoActual(), 0.00);
    }

    /**
     * Method: setInteresAnual(double interesAnual)
     */
    @Test
    public void testSetInteresAnual() {
        cuentaBancaria1.setInteresAnual(10);
        assertNotEquals(0.0, cuentaBancaria1.getInteresAnual(), 0.00);
        assertEquals(0.1,cuentaBancaria1.getInteresAnual(),0.00);

        cuentaBancaria1.setInteresAnual(1.5);
        assertNotEquals(0.0, cuentaBancaria1.getInteresAnual(), 0.00);
        assertEquals(1.5, cuentaBancaria1.getInteresAnual(), 0.00);
    }

    /**
     * Method: ingresarInteres()
     */
    @Test
    public void testIngresarIntereses() {
        cuentaBancaria2.ingresarIntereses(); //saldo=saldo+(intereses*sueldo) --> 1000.63 + (1000.63*2.1) =3101.95

        assertNotEquals(0.0, cuentaBancaria2.getSaldoActual(), 0.00);
        assertEquals(3101.953, cuentaBancaria2.getSaldoActual(), 0.00);
    }

    /**
     * Method: ingresarDinero(double dineroIngresar)
     */
    @Test
    public void testIngresarDinero() {
        assertNotEquals(0, cuentaBancaria2.getSaldoActual(), 0.00);
        assertEquals(1000.63, cuentaBancaria2.getSaldoActual(), 0.00);

        cuentaBancaria2.ingresarDinero(100);
        assertEquals(1100.63, cuentaBancaria2.getSaldoActual(), 0.00);
    }

    /**
     * Method: retirarDinero(double dineroRetirar)
     */
    @Test
    public void testRetirarDinero() {
        assertThrows(IllegalArgumentException.class, () -> {
            cuentaBancaria1.retirarDinero(123123);
        });

        cuentaBancaria2.retirarDinero(500);
        assertEquals(500.63, cuentaBancaria2.getSaldoActual(), 0.00);
    }
}
