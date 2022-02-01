package javaapptest1;

public class Metodos {
    private String clasificacion="XS";
    private double iva=0.0;

    public String Tallas(String t){
        if(t.equals("XS")){
            clasificacion="Extra pequeña";
        }else if (t.equals("S")){
            clasificacion="Pequeña";
        }else if (t.equals("M")){
            clasificacion="Mediana";
        }else if (t.equals("L")){
            clasificacion="Grande";
        }else if (t.equals("XL")){
            clasificacion="Muy grande";
        }else if (t.equals("XXL")){
            clasificacion="Extra grande";
        }
        return clasificacion;
    }


    public double iva(double precio){
        iva=(precio*1.21);
        return iva;
    }
}
