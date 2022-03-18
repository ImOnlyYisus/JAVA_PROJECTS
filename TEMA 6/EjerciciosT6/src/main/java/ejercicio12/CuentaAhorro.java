package ejercicio12;

public class CuentaAhorro extends Cuenta{

    private double interesVariable;
    private double comisionAnual;

    public CuentaAhorro(Persona persona, double interesVariable, double comisionAnual) {
        super(persona);
        this.interesVariable = interesVariable;
        this.comisionAnual = comisionAnual;
    }

    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interesVariable=" + interesVariable +
                ", comisionAnual=" + comisionAnual +
                '}';
    }

    @Override
    public void actualiozarSaldo() {
        setSaldo((getSaldo()+(getSaldo()*interesVariable)-comisionAnual));
    }

    @Override
    public void retirar(double saldo) {
        if(getSaldo()>0){
            setSaldo(getSaldo()-saldo);
        }
    }
}
