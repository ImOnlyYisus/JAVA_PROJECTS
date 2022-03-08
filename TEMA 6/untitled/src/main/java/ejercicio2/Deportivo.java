package ejercicio2;

public class Deportivo extends Vehiculo{
    private int puertas;
    private boolean marchaAutomatica;

    public Deportivo(String matricula, double kilometros, String numeroBastidor, String marca, int puertas, boolean marchaAutomatica) {
        super(matricula, kilometros, numeroBastidor, marca);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public void getAtributos(){
        String atributos;
        atributos="Marca: "+super.getMarca()+", Matricula: "+super.getMatricula()+", NumeroBastidor: "+super.getNumeroBastidor()+
                ", Kilometros: "+super.getKilometros()+ ", MarchaAutomatica: "+this.marchaAutomatica+", Puertas: "+ this.puertas;

        System.out.println(atributos);
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "puertas=" + puertas +
                ", marchaAutomatica=" + marchaAutomatica +
                '}';
    }
}
