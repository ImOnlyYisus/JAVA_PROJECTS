package daw.vehiculos;

public class Vehiculos {
    String marca;
    String color;
    String matricula;
    String tipo;

    public Vehiculos(String marca, String color, String martricula, String tipo){
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getTipo(){
        return this.tipo;
    }
}
