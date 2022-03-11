package ejercicio1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoria;
    private static final double SUELDO_BASE_COMUN = 1707;

    //Constructor parametrizado
    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if (comprobarEdad(fechaNacimiento) >= 16) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("La edad del individuo es menor a 16");
        }

        this.categoria = categoria;
    }

    //Constructor copia
    public Trabajador(Trabajador trabajador) {
        this.nombre = trabajador.nombre;
        this.fechaNacimiento = trabajador.fechaNacimiento;
        this.categoria = trabajador.categoria;
        this.apellidos = trabajador.apellidos;
    }

    //Metodo que te devuelve la edad de la persona segun su fecha de nacimiento
    private long comprobarEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();

        return ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
    }

    //Metodo que calcula el salario total
    public double calcularSueldo() {
        return (SUELDO_BASE_COMUN + this.categoria.getComplementoEuros());
    }

    //Metodo que te devuelve la fecha en la que el trabajador se jubilaria
    public static LocalDate fechaJubilacion(Trabajador trabajador) {
        final int EDAD_JUBILACION = 66;
        long edad = trabajador.comprobarEdad(trabajador.getFechaNacimiento());
        long añosRestantes = EDAD_JUBILACION - edad;

        return trabajador.getFechaNacimiento().plusYears(añosRestantes);
    }

    //Metodo para imprimir datos personalizados
    public String toString() {
        Locale spanishLocale = new Locale("es", "ES");
        DateTimeFormatter formateoFecha = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy", spanishLocale);
        LocalDate fechaJubilacion = fechaJubilacion(this);
        DateTimeFormatter formateoFecha2 = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del' yyyy", spanishLocale);

        return ("\t" + this.nombre + "\t" + "F.Nac:" + formateoFecha.format(this.fechaNacimiento) + "\n" +
                "Categoria:" + this.categoria.getNombreCategoria() + "\n" +
                "Fecha Jubilacion:" + formateoFecha2.format(fechaJubilacion) + "\n" +
                "Sueldo Actual:" + calcularSueldo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (comprobarEdad(fechaNacimiento) >= 16) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("La edad del individuo es menor a 16");
        }
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(fechaNacimiento, that.fechaNacimiento) && categoria == that.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, fechaNacimiento, categoria);
    }

    @Override
    public int compareTo(Trabajador trabajador) { //Intuyo que el trabajador se ordena por el nombre y luego por la fecha
        if ((this.nombre.compareToIgnoreCase(trabajador.nombre)) == 0) {
            return this.fechaNacimiento.compareTo(trabajador.fechaNacimiento);
        } else {
            return (this.nombre.compareToIgnoreCase(trabajador.nombre));
        }
    }
}
