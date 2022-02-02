package vehiculo;

import de.vandermeer.asciitable.AsciiTable;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Vehiculo {
//Atributos
    private String bastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

//Variables
    private static Random rd = new Random();
    private static String[] marcaCoches = {"Mercedes","Audi","BMW","KIA","RENAULT","FORD","LAMBORGUINI","OPEL"};
    private static String [] modeloCoches = {"Turismo","Sport","Berlina","Monovolumen", "Furgoneta","Familiar"};
    private static String [] coloresCoches = {"Verde", "Negro", "Azul" , "Rojo", "Rosa", "Amarillo", "Blanco"};

    public Vehiculo() {
        this.marca = marcaCoches[rd.nextInt(marcaCoches.length)];
        this.modelo = modeloCoches[rd.nextInt(modeloCoches.length)];
        this.bastidor = RandomStringUtils.randomAlphanumeric(17);
        this.matricula = RandomStringUtils.randomNumeric(4)+RandomStringUtils.randomAlphabetic(3);
        this.color = coloresCoches[rd.nextInt(coloresCoches.length)];
        this.tarifa = rd.nextDouble()+ rd.nextInt(11);
        this.disponible = rd.nextBoolean();
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    @Override
    public String toString() {
        AsciiTable tabla = new AsciiTable();
        tabla.addRule();
        tabla.addRow("BASTIDOR","MATRICULA","MARCA","MODELO","COLOR","TARIFA","DISPONIBLE");
        tabla.addRule();
        tabla.addRow(bastidor,matricula,marca,modelo,color,tarifa,disponible);
        tabla.addRule();
        return tabla.render();
//        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }
    
    

}
