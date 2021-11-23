package daw.poo;

public class CajaCarton {
    private double ancho; //milimetros
    private double largo; //milimetros
    private double peso; //kilogramos
    private double alto; //milimetros

    public CajaCarton (){
        this.alto = 0.0;
        this.largo = 0.0;
        this.peso = 0.0;
        this.ancho = 0.0;
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

    public String getAllValues(){
        String tmp = this.ancho +", "+this.alto+ ", " + this.largo +", "+ this.peso;
        return tmp;
    }

    public void abrir(){

    }

    public void cerrar(){

    }
}
