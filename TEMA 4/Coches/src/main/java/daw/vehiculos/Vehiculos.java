package daw.vehiculos;

public class Vehiculos {
    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;

    // el método constructor de la clase Vehiculo
    public Vehiculos(String matricula,
                    String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula; this.marca = marca;
        this.modelo = modelo; this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
    // los métodos ‘get’ y ‘set’ de la clase Vehiculo
    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public String getColor() {
        return this.color;
    }
    public double getTarifa() {
        return this.tarifa;
    }
    public boolean getDisponible() {
        return this.disponible;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;

    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

}