package ejercicio07.vehiculos;

public class Deportivo extends Vehiculo{
    private int puertas;
    private boolean marchaAutomatica;
    private String neumaticos;

    public Deportivo(){

    }

    public Deportivo(String matricula, double kilometros, String numeroBastidor, String marca, int puertas, boolean marchaAutomatica, String neumaticos) {
        super(matricula, kilometros, numeroBastidor, marca);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
        this.neumaticos= neumaticos;
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

    public String getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(String neumaticos) {
        this.neumaticos = neumaticos;
    }

    public void getAtributos(){
        String atributos;
        atributos="Marca: "+super.getMarca()+", Matricula: "+super.getMatricula()+", NumeroBastidor: "+super.getNumeroBastidor()+
                ", Kilometros: "+super.getKilometros()+ ", MarchaAutomatica: "+this.marchaAutomatica+", Puertas: "+ this.puertas +
                ", Neumaticos: "+ this.neumaticos;

        System.out.println(atributos);
    }

    @Override
    public String toString() {
        return super.toString()+":" + puertas +
                ":" + marchaAutomatica;
    }
}
