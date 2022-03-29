package ejercicio14;

public class Microondas extends Electrodomestico implements Silencioso,Comparable<Microondas>{
    private double potenciaMax;

    public Microondas(double consumo, String modelo, double potenciaMax) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Microondas{" +
                "potenciaMax=" + potenciaMax +
                '}';
    }

    @Override
    public void silencio() {
        System.out.println("El microondas de consumo "+getConsumo()+" emite 40db de sonido");
    }

    @Override
    public int compareTo(Microondas o) {
        return Double.compare(this.potenciaMax, o.potenciaMax);
    }
}
