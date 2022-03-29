package ejercicio14;

public abstract class Electrodomestico {
    private double consumo;
    private String modelo;

    public Electrodomestico (double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "consumo=" + consumo +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}



