package jesus.practicaenum;

public class Prueba {
    public static void main(String[] args) {
        Dados j1= new Dados();
        Dados j2 = new Dados();

        String respuesta =  Dados.quienGana(j1,j2).getRespuesta();
        System.out.println(respuesta);
    }
}
