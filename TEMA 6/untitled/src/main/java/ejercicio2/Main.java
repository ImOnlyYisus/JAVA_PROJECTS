package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Furgoneta furgoneta = new Furgoneta("asdasd123",1,"asdas","RENAULT",5,false);
        Deportivo deportivo = new Deportivo("asdad2312",123,"asdse3","PORCHE",2,true, "Michelines");
        Turismo turismo = new Turismo("asd2",2,"asdqsd","Mercedes",5,true,"Verde");

        furgoneta.getAtributos();
        turismo.getAtributos();
        deportivo.getAtributos();
    }
}
