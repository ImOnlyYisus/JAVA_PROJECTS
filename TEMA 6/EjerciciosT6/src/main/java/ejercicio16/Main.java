package ejercicio16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Robots> listaRobots = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listaRobots.add(new Robots());
        }

        //Imprimir lista
        listaRobots.forEach(System.out::println);

        //Imprimir robots ordenados por vida
        System.out.println("\nROBOTS ORDENADOS POR VIDA");
        Comparator<Robots> criterioVida = (r1,r2)-> Integer.compare(r1.getVida(),r2.getVida());
        listaRobots.sort(criterioVida);
        listaRobots.forEach(System.out::println);

        //Imprimir robots con mas de un 50% de vida
        System.out.println("\nROBOTS CON 50 O MAS DE VIDA");
        listaRobots.forEach(robots -> {
            if(robots.getVida()>=50){
                System.out.println(robots);
            }
        });

        //Imprimir 3 robots con mas vida
        System.out.println("\nTOP 3 ROBOTS CON MAS VIDA");
        System.out.println(listaRobots.get(listaRobots.size()-1));
        System.out.println(listaRobots.get(listaRobots.size()-2));
        System.out.println(listaRobots.get(listaRobots.size()-3));


        //Imprimir ordenado por numero de serie
        System.out.println("\nROBOTS ORDENADOS POR N.SERIE");
        Collections.sort(listaRobots);
        listaRobots.forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        int serie = sc.nextInt();
        System.out.println(Collections.binarySearch(listaRobots,new Robots(serie,0)));
    }
}
