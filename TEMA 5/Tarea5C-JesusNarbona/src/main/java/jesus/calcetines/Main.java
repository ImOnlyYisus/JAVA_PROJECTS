package jesus.calcetines;

public class Main {
    public static void main(String[] args) {
        CajonCalcetines cajon=new CajonCalcetines();

        CajonCalcetines.printCajon(cajon);

        System.out.println("\n");


        Calcetines[] parejas = cajon.parejar();
        if(parejas!=null){
            for (int i = 0; i <parejas.length ; i++) {
                System.out.println(parejas[i]);
            }
        } else {
            System.out.println("Emparejados");
        }


    }
}
