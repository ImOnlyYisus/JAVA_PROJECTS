package cancion;

public class AlbumCanciones {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        System.out.println(cancion.toString());

        Cancion cancion1 = new Cancion("SleepWalking","Bring me the horizon");
        System.out.println(cancion1.toString());

        cancion.setAutor("System of a Down");
        cancion.setTitulo("Lonely Day");

        System.out.println(cancion.getAutor());
        System.out.println(cancion.getTitulo());
    }
}
