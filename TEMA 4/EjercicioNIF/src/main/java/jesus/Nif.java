package jesus;

public class Nif {
    private String DNI="?????????";
    private char dniLetra='?';
    private static int instacias;

    //CONSTRUCTOR
    public Nif(String DNI) {
        if(DNI.length()==8){
            this.DNI = DNI;
            this.dniLetra=letraDni(DNI);
            instacias++;
        }

    }

    //Metodos
    private char letraDni(String Dni){
        int resto = 0;
        try {
            resto = Integer.parseInt(Dni) % 23;
        } catch (NumberFormatException nfe) {
            System.out.println("Formato de numero incorrecto "+this.DNI);
            this.DNI="0";
        }

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[resto];
    }

    //GETTERS

    public String getDNI() {
        return DNI;
    }

    public char getDniLetra() {
        return dniLetra;
    }

    //Metodos static
    public static int getInstacias(){
        return instacias;
    }

    //TO string

    @Override
    public String toString() {
        return (getDNI()+"-"+getDniLetra());
    }
}
