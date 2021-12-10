package Geometria;

public class Linea {
    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    public Linea() {
        this.puntoA = new PuntoGeometrico(0,0);
        this.puntoB = new PuntoGeometrico(1,1);
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "puntoA=" + puntoA +
                ", puntoB=" + puntoB +
                '}';
    }

    //METODOS
    public void mueveDerecha(double x){
        this.puntoA.setX(this.puntoA.getX()+x);
        this.puntoB.setX(this.puntoB.getX()+x);
    }
    public void mueveIzquierda(double x){
        this.puntoA.setX(this.puntoA.getX()-x);
        this.puntoB.setX(this.puntoB.getX()-x);
    }
    public void mueveArriba(double y){
        this.puntoA.setY(this.puntoA.getY()+y);
        this.puntoB.setY(this.puntoB.getY()+y);
    }
    public void mueveAbajo(double y){
        this.puntoA.setY(this.puntoA.getY()-y);
        this.puntoB.setY(this.puntoB.getY()-y);
    }

    public void mostrarLinea(){
        System.out.println("["+this.puntoA+", "+ this.puntoB +"]");
    }
}
