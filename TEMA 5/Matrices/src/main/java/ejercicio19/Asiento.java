package ejercicio19;

import java.util.Random;

public class Asiento {
    private boolean estado;

    public Asiento() {
        Random rd= new Random();
        estado=rd.nextBoolean();
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
