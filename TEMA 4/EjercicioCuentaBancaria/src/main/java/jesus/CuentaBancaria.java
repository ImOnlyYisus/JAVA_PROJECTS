package jesus;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class CuentaBancaria {
    private String numeroCuenta =RandomStringUtils.randomNumeric(20).toUpperCase();
    private String NIF;
    private String nombreCliente;
    private double saldoActual;
    private double interesAnual = 0.1; //entre 0.1% y 3%

    //CONSTRUCTORES
    public CuentaBancaria(){
    }

    public CuentaBancaria(String NIF, String nombreCliente, double saldoActual, double interesAnual) {
        this.NIF = NIF;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        if(!(interesAnual<0.1 && interesAnual>3)){
            this.interesAnual = interesAnual;
        }
    }

    //GETTERS
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    //SETTERS
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(double interesAnual) {
        if(!(interesAnual<0.1 && interesAnual>3)){
            this.interesAnual = interesAnual;
        }
    }

    //METODOS
    //aumenta el saldo de la cuenta, aplicando el interés anual [saldo = saldo + (interés * saldo)].
    public void ingresarIntereses(){
        this.saldoActual += (this.interesAnual*this.saldoActual);
    }

    //permite ingresar una cantidad en la cuenta.
    public void ingresarDinero(double dineroIngresar){
        dineroIngresar=Math.abs(dineroIngresar);
        this.saldoActual+= dineroIngresar;
    }

    //permite sacar una cantidad de la cuenta (si hay saldo). Si no hay saldo suficiente no se realiza la operación.
    public void retirarDinero(double dineroRetirar){
        if(dineroRetirar>this.saldoActual){
            throw new IllegalArgumentException("No hay dinero suficiente para retirar, dinero restante: "+this.saldoActual);
        } else{
            this.saldoActual-=dineroRetirar;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", NIF='" + NIF + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", saldoActual=" + saldoActual +
                ", interesAnual=" + interesAnual +
                '}';
    }
}
