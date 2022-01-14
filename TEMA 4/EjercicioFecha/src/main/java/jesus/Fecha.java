package jesus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.*;
import java.util.Locale;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //Contructores
    public Fecha() { //Por defecto
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }

    public Fecha(int dia, int mes, int anio) { //Parametrizado
        //Comprobar fecha
        if (!comprobarFecha(dia, mes, anio)) {
            throw new IllegalArgumentException("Los parametros introducidos son invalidos");
        }

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Getters Setters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        if (comprobarFecha(dia, this.mes, this.anio)) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (comprobarFecha(this.dia, mes, this.anio)) {
            this.mes = mes;
        }
    }

    public void setAnio(int anio) {
        if (comprobarFecha(this.dia, this.mes, anio)) {
            this.anio = anio;
        }
    }

    //Metodos
    public boolean comprobarFecha(int dia, int mes, int anio) {
        boolean verificarFecha = true;
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (DateTimeException dte) {
            verificarFecha = !verificarFecha;
        }

        return verificarFecha;
    }

    public boolean bisiesto() {
        return LocalDate.of(this.anio, this.mes, this.dia).isLeapYear();
    }

    public int diasMes() {
        return LocalDate.of(this.anio, this.mes, this.dia).getDayOfMonth();
    }

    public String mostrarFechaCorta() {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        DateTimeFormatter formateoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return formateoFecha.format(fecha);
    }

    public String mostrarFechaLarga() {
        Locale spanishLocale = new Locale("es", "ES");
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        DateTimeFormatter formateoFecha = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del' yyyy", spanishLocale);
        return formateoFecha.format(fecha);
    }

    public String diaSemana() {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        return ("" + fecha.getDayOfWeek());
    }

    public void siguiente() {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        fecha =fecha.plusDays(1);//Pasar dia

        this.dia = fecha.getDayOfMonth();
        this.mes = fecha.getMonthValue();
        this.anio = fecha.getYear();
    }

    public void anterior() {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        fecha=fecha.plusDays(-1);//Pasar dia

        this.dia = fecha.getDayOfMonth();
        this.mes = fecha.getMonthValue();
        this.anio = fecha.getYear();
    }

    public Fecha copia() {
        return new Fecha(this.dia, this.mes, this.anio);
    }

    public boolean igualQue(Fecha fechaPasada) {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        ChronoLocalDate pasada = LocalDate.of(fechaPasada.getAnio(), fechaPasada.getMes(), fechaPasada.getDia());
        return (fecha.isEqual(pasada));
    }

    public boolean mayorQue(Fecha fechaPasada) {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        ChronoLocalDate pasada = LocalDate.of(fechaPasada.getAnio(), fechaPasada.getMes(), fechaPasada.getDia());
        return (fecha.isAfter(pasada));
    }

    public boolean menorQue(Fecha fechaPasada) {
        LocalDate fecha = LocalDate.of(this.anio, this.mes, this.dia);
        ChronoLocalDate pasada = LocalDate.of(fechaPasada.getAnio(), fechaPasada.getMes(), fechaPasada.getDia());
        return (fecha.isBefore(pasada));
    }

    public static long diasEntreFechas(Fecha inicial, Fecha fin) {
        LocalDate incio = LocalDate.of(inicial.getAnio(), inicial.getMes(), inicial.getDia());
        LocalDate ultima = LocalDate.of(fin.getAnio(), fin.getMes(), fin.getDia());

        return ChronoUnit.DAYS.between(incio, ultima);
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
