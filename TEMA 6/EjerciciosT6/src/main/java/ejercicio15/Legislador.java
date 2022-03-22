package ejercicio15;

public abstract class Legislador extends Persona {
    private String provincia;
    private String partidoPolitico;

    public Legislador(String nombre, String apellidos, String provincia, String partidoPolitico) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador() {
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Legislador{" +
                "politico='" + provincia + '\'' +
                ", partidoPolitico='" + partidoPolitico + '\'' +
                '}';
    }

    public abstract String getCamara();
}
