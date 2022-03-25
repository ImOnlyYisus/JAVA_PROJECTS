package herencia;

public class SoldadoTierra extends Soldado{ //Clase que hereda de Soldado, indicando que este soldado es un soldado de tierra
    private String armamento; //private, permite el acceso al atributo solo dentro de la misma clase
    private String vehiculo;

    public SoldadoTierra(String nombre, String apellidos, String dni, String provincia, int añosAlistado, String armamento, String vehiculo) {
        super(nombre, apellidos, dni, provincia, añosAlistado);
        this.armamento = armamento;
        this.vehiculo = vehiculo;
    }

    public SoldadoTierra() {
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void cubirse(){
        System.out.println("Soldado cubierto");
    }

    @Override
    public void saludar() { //Metodo sobrescrito de la clase padre
        System.out.println("Saludos desde tierra");
    }

    @Override
    public String toString() { //Metodo sobrescrito de la clase soldado
        return super.toString()+"\n"+"SoldadoTierra{" +
                "armamento='" + armamento + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                '}';
    }
}
