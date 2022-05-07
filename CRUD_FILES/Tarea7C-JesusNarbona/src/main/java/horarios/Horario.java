package horarios;

public class Horario{
    private String curso;
    private String iniciales;
    private String asignatura;
    private String aula;
    private int diaSemana;
    private int hora;

    public Horario() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return  curso +
                ";" + iniciales +
                ";" + asignatura +
                ";" + aula +
                ";" + diaSemana +
                ";" + hora;
    }
}
