package ejercicio3;

import java.util.Map;
import java.util.TreeMap;

public class Alumnado implements Comparable<Alumnado>{
    private String nombre;
    private TreeMap<String, String> notas;

    public Alumnado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(TreeMap<String, String> notas) {
        this.notas = notas;
    }

    public TreeMap<String, String> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        String modulosNotas ="";
        for (Map.Entry<String, String> entry : notas.entrySet()) {
            modulosNotas+="["+entry.getKey()+": "+entry.getValue()+"] ";
        }
        return "[" + this.nombre + "]\n" + modulosNotas;
    }

    @Override
    public int compareTo(Alumnado o) {
        return this.getNombre().compareToIgnoreCase(o.getNombre());
    }
}
