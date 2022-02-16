package ejercicio19;

public class Asiento {
    private boolean estado=true;

    public Asiento() {
    }

    public boolean isOcupado(){ //si devuelve true es que no esta ocupado
        return estado;
    }

    public void reservar(){
        estado=false;
    }

    public void cancelar(){
        estado=true;
    }

    public boolean isEstado() {
        return estado;
    }
}
