package test.jesus; 

import jesus.CuentaBancaria;
import org.junit.Test;

import static org.junit.Assert.*;

/** 
* CuentaBancaria Tester. 
* 
* @author <jesus>
* @since <pre>dic. 2, 2021</pre> 
* @version 1.0 
*/ 
public class CuentaBancariaTest {
    CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
    CuentaBancaria cuentaBancaria2 = new CuentaBancaria("233324F","Juanito",1000.63,2.1);
/**
* 
* Method: getNumeroCuenta() 
* 
*/ 
@Test
public void testGetNumeroCuenta() throws Exception {
    assertNotEquals(0,cuentaBancaria1.getNumeroCuenta());
} 

/** 
* 
* Method: getNIF() 
* 
*/ 
@Test
public void testGetNIF() throws Exception {
    assertNotEquals(0, cuentaBancaria2.getNIF());
    assertEquals("233324F", cuentaBancaria2.getNIF());
} 

/** 
* 
* Method: getNombreCliente() 
* 
*/ 
@Test
public void testGetNombreCliente() throws Exception {
    assertNotEquals(null, cuentaBancaria2.getNombreCliente());
    assertEquals("Juanito", cuentaBancaria2.getNombreCliente());
} 

/** 
* 
* Method: getSaldoActual() 
* 
*/ 
@Test
public void testGetSaldoActual() throws Exception { 
    assertNotEquals(0, cuentaBancaria2.getSaldoActual(),0.00);
    assertEquals(1000.63, cuentaBancaria2.getSaldoActual(),0.00);
} 

/** 
* 
* Method: getInteresAnual() 
* 
*/ 
@Test
public void testGetInteresAnual() throws Exception {
    assertEquals(0.1, cuentaBancaria1.getInteresAnual(),0.00);
    assertNotEquals(0, cuentaBancaria2.getInteresAnual(),0.00);
    assertEquals(2.1, cuentaBancaria2.getInteresAnual(),0.00);
}

/** 
* 
* Method: setNIF(String NIF) 
* 
*/ 
@Test
public void testSetNIF() throws Exception {
    cuentaBancaria1.setNIF("213123a");
    assertNotEquals("", cuentaBancaria1.getNIF());
    assertEquals("213123a",cuentaBancaria1.getNIF());
} 

/** 
* 
* Method: setNombreCliente(String nombreCliente) 
* 
*/ 
@Test
public void testSetNombreCliente() throws Exception { 
    cuentaBancaria1.setNombreCliente("Pepe");

    assertNotEquals("",cuentaBancaria1.getNombreCliente());
    assertEquals("Pepe",cuentaBancaria1.getNombreCliente());
} 

/** 
* 
* Method: setSaldoActual(double saldoActual) 
* 
*/ 
@Test
public void testSetSaldoActual() throws Exception { 
    cuentaBancaria1.setSaldoActual(2000.12);

    assertNotEquals(0.0, cuentaBancaria1.getSaldoActual(),0.00);
    assertEquals(2000.12, cuentaBancaria1.getSaldoActual(),0.00);
} 

/** 
* 
* Method: setInteresAnual(double interesAnual) 
* 
*/ 
@Test
public void testSetInteresAnual(){
    assertThrows(IllegalArgumentException.class, ()->{
       cuentaBancaria1.setInteresAnual(10);
    });

    cuentaBancaria1.setInteresAnual(0.2);
    assertNotEquals(0.0, cuentaBancaria1.getInteresAnual(),0.00);
    assertEquals(0.2,cuentaBancaria1.getInteresAnual(),0.00);
} 

/** 
* 
* Method: ingresarInteres() 
* 
*/ 
@Test
public void testIngresarIntereses(){
    cuentaBancaria1.ingresarIntereses();
    assertEquals();
} 

/** 
* 
* Method: ingresarDinero(double dineroIngresar) 
* 
*/ 
@Test
public void testIngresarDinero() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: retirarDinero(double dineroRetirar) 
* 
*/ 
@Test
public void testRetirarDinero() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here... 
} 


} 
