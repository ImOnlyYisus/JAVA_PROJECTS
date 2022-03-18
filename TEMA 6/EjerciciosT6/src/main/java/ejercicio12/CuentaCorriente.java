package ejercicio12;

public class CuentaCorriente extends Cuenta{

    private double interesFijo = 1.5;
    private double saldoMinimo;

    public CuentaCorriente(Persona persona, double saldoMinimo) {
        super(persona);
        this.interesFijo = interesFijo;
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteresFijo() {
        return interesFijo;
    }

    public void setInteresFijo(double interesFijo) {
        this.interesFijo = interesFijo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "interesFijo='" + interesFijo + '\'' +
                ", saldoMinimo=" + saldoMinimo +
                '}';
    }

    @Override
    public void actualiozarSaldo() {
        if(getSaldo()>=1000){
            setSaldo(((getSaldo())+(saldoMinimo*interesFijo)));
        }

    }

    @Override
    public void retirar(double saldo) {
        if(getSaldo()-saldo>=saldoMinimo){
            setSaldo(getSaldo()-saldo);
        }

    }
}
