package ejercicio14;

public class Frigorifico extends Electrodomestico implements Silencioso,Comparable<Frigorifico>{
    private int capacidad;

    public Frigorifico(double consumo, String modelo, int capacidad) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Frigorifico{" +
                "capacidad=" + capacidad +
                '}';
    }

    @Override
    public void silencio() {
        System.out.println("El frigorifico del modelo "+getModelo()+" emite 50db de sonido");
    }

    @Override
    public int compareTo(Frigorifico o) {
        return this.capacidad-o.capacidad;
    }
}
