package jesus.practicaenum;

import jesus.practicaenum.Response;

import java.util.Random;

public class Dados {
    private int dado;

    public Dados() {
        dadoAleatorio();
    }

    public int getDado() {
        return dado;
    }

    private void dadoAleatorio(){
        Random rd = new Random();

        dado=rd.nextInt(7); //Da de 1 a 6
    }

    public static Response quienGana(Dados dado1, Dados dado2){ //1 gana 1, 2 gana 2 y 3 empate
        Response respuesta=null;
        if(dado1.getDado()>dado2.getDado()){
            return Response.GANAJ1;
        }

        if(dado2.getDado()>dado1.getDado()){
            return Response.GANAJ2;
        }

        if(dado1==dado2){
            return Response.NOGANA;
        }
        return respuesta;
    }

}
