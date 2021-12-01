package jesus;

public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera(){
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }
    public Cafetera(double capacidadMaxima) {
        //Si la capacidad maxima introducidad es negativa se convierte en positiva
        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = this.capacidadMaxima;
    }
    public Cafetera(double capacidadMaxima, double cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        if(cantidadActual>capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(double cantidadAServir){
        cantidadAServir = Math.abs(cantidadAServir);
        if(cantidadAServir>cantidadActual){
            System.out.println("Voy a servir lo que me queda ");
            vaciarCafetera();
        } else{
            this.cantidadActual-=cantidadAServir;
            System.out.println("Voy a servir "+ cantidadAServir + ", te queda " + this.cantidadActual);
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual=0;
    }

    public void agregarCafe(double cantidadAgregar){
        if(cantidadAgregar<(capacidadMaxima-cantidadActual)){
            this.cantidadActual+=cantidadAgregar;
        } else{
            throw new IllegalArgumentException("No se puede llenar con la cantidad indicada, supera la capacidad maxima");
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
}
