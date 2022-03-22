package ejercicio15;

public class Diputado extends Legislador{
    private int numeroAsiento;

    public Diputado(String nombre, String apellidos, String politico, String partidoPolitico, int numeroAsiento) {
        super(nombre, apellidos, politico, partidoPolitico);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado() {
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Diputado{" +
                "numeroAsiento=" + numeroAsiento +
                '}';
    }

    @Override
    public String getCamara() {
        return "Diputado";
    }
}
