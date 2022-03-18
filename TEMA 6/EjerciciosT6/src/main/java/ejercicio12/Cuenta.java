package ejercicio12;

import org.apache.commons.lang3.RandomStringUtils;

public abstract class Cuenta {
    private String cuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona persona) {
        this.cuenta=RandomStringUtils.randomAlphanumeric(20);
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public abstract void actualiozarSaldo();
    public abstract void retirar(double saldo);

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
