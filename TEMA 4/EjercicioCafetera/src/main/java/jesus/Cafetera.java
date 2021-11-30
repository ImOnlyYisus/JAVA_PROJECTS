package jesus;

public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera(){
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
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
        if(cantidadAServir>cantidadActual){
            System.out.println("Voy a servir lo que me queda "+ this.cantidadActual);
        } else{
            System.out.println("Voy a servir "+ cantidadAServir);
            this.cantidadActual-=cantidadAServir;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual=0;
    }

    public void agregarCafe(double cantidadAgregar){
        if(cantidadAgregar<(capacidadMaxima-cantidadActual)){
            this.cantidadActual+=cantidadAgregar;
        } else{
            this.cantidadActual= this.capacidadMaxima;
        }
    }
}
