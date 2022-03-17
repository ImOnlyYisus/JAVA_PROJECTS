package ejercicio7;

public class Cocinero extends Trabajador{
    private String rango;

    public Cocinero(String rango, String nombre, String apellido1,
                    String NIF) {
        // Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }

    // Método propio de camarero
    public void servirMesa(){
        System.out.println("Objeto Cocinero: Preparando plato");
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Cocinero");
    }

    @Override
    public String toString() {
        return super.toString()+"\nCocinero{" +
                "rango='" + rango + '\'' +
                '}';
    }
}

