package ejercicio4;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.print.DocFlavor;
import java.time.LocalDate;

public class Precipitacion {
    @JsonDeserialize(using = LocalDateDeserializer.class)
//    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate fecha;
    private String estacionMeteorologica;
    private String provincia;
    private double precipitacion;

    public Precipitacion() {
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public void setEstacionMeteorologica(String estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "Precipitacion{" +
                "fecha=" + fecha +
                ", estacionMeteorologica='" + estacionMeteorologica + '\'' +
                ", provincia='" + provincia + '\'' +
                ", precipitacion=" + precipitacion +
                '}';
    }
}
