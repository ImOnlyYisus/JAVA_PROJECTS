package ejercicio15;

public class Senador extends Legislador{
    private double complemento;

    public Senador(String nombre, String apellidos, String politico, String partidoPolitico, double complemento) {
        super(nombre, apellidos, politico, partidoPolitico);
        this.complemento = complemento;
    }

    public Senador() {
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Senador{" +
                "complemento=" + complemento +
                '}';
    }

    @Override
    public String getCamara() {
        return "Senador";
    }
}
