package ejercicio1;

public enum CategoriaEmpleado {
    //Objetos predefinidos
    INICIAL("Categoria Basica", 50),
    MEDIA("Categoria Media", 70),
    AVANZADA("Categoria Avanzada", 100);

    //Atributos
    private String nombreCategoria;
    private double complementoEuros;

    CategoriaEmpleado(String nombreCategoria, double complementoEuros) {
        this.nombreCategoria = nombreCategoria;
        this.complementoEuros = complementoEuros;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public double getComplementoEuros() {
        return complementoEuros;
    }
}
