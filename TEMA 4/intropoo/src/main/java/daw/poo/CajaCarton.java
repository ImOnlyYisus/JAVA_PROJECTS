package daw.poo;

public class CajaCarton {
    private double ancho; //milimetros
    private double largo; //milimetros
    private double peso; //kilogramos
    private double alto; //milimetros

    public CajaCarton (){
    }

    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", peso=" + peso +
                ", alto=" + alto +
                '}';
    }

    public void abrir(){

    }

    public void cerrar(){

    }
}
