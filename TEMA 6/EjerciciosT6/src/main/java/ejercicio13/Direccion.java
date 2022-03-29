package ejercicio13;

public class Direccion {
    private String calle;
    private String nombreCiudad;
    private int codigoPostal;
    private String nombrePais;

    public Direccion(String calle, String nombreCiudad, int codigoPostal, String nombrePais) {
        this.calle = calle;
        this.nombreCiudad = nombreCiudad;
        this.codigoPostal = codigoPostal;
        this.nombrePais = nombrePais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", nombreCiudad='" + nombreCiudad + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", nombrePais='" + nombrePais + '\'' +
                '}';
    }
}
