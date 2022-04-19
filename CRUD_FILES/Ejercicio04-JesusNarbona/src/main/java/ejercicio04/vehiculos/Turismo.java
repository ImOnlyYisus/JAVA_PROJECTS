package ejercicio04.vehiculos;

public class Turismo extends Vehiculo{

    private int puertas;
    private boolean marchaAutomatica;
    private String color;

    public Turismo(String matricula, double kilometros, String numeroBastidor, String marca, int puertas, boolean marchasAutomaticas, String color) {
        super(matricula, kilometros, numeroBastidor, marca);
        this.puertas = puertas;
        this.marchaAutomatica = marchasAutomaticas;
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean getMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getAtributos(){
        String atributos;
        atributos="Marca: "+super.getMarca()+", Matricula: "+super.getMatricula()+", NumeroBastidor: "+super.getNumeroBastidor()+
                ", Kilometros: "+super.getKilometros()+ ", MarchaAutomatica: "+this.marchaAutomatica+", Puertas: "+ this.puertas +
                ", Color: "+ this.color;

        System.out.println(atributos);
    }

    @Override
    public String toString() {
        return super.toString() + ":" + puertas +
                ":" + marchaAutomatica +
                ":" + color + '\'';
    }
}
