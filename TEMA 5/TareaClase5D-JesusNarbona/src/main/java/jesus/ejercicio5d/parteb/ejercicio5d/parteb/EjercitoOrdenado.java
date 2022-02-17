package jesus.ejercicio5d.parteb.ejercicio5d.parteb;

import java.util.ArrayList;
import java.util.TreeSet;

public class EjercitoOrdenado {
    private int numeroSoldados;
    private TreeSet<Soldado> conjuntoSoldados;

    public EjercitoOrdenado(int numeroSoldados) {
        conjuntoSoldados=new TreeSet<>();
        this.numeroSoldados=numeroSoldados;
    }

    public void alistarSoldado(Soldado soldado){ //Añade un soldado
        int numeroActuales= numeroSoldados();
        if((numeroActuales+1)<=numeroSoldados){ //controlar que no pueda introducir mas de n numero de soldados
            conjuntoSoldados.add(soldado);
        }
    }

    public boolean tieneSoldados(){ //Ver si tiene soldados
        return conjuntoSoldados.isEmpty();
    }

    public int numeroSoldados(){ //Numero de soldados
        return conjuntoSoldados.size();
    }

    public ArrayList<Soldado> sacarSoldados(){ //Saca todos los soldados en forma de arrayList
        ArrayList<Soldado> response = new ArrayList<>();

        response.addAll(conjuntoSoldados);
        return response;
    }

    public boolean buscarSoldado(Soldado soldado){ //Ver si el soldado esta alistado
        return conjuntoSoldados.contains(soldado);
    }

    public void quitarSoldado(Soldado soldado){ //Quita el soldado si esta alistado
        conjuntoSoldados.remove(soldado);
    }
}
