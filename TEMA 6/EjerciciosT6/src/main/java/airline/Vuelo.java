package airline;

import java.util.ArrayList;
import java.util.Objects;

public class Vuelo {
    private String codVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int duracion; //minutos
    private ArrayList<Pasajeros> pasajeros = new ArrayList<>();

    public Vuelo(String codVuelo, String ciudadOrigen, String ciudadDestino, int duracion, ArrayList<Pasajeros> pasajeros) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracion = duracion;
        this.pasajeros = pasajeros;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Pasajeros> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajeros> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vuelo)) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codVuelo, vuelo.codVuelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codVuelo);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codVuelo='" + codVuelo + '\'' +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", duracion=" + duracion +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
