package daw.jesus;

import javax.swing.*;

public class Prueba {
    public static void main(String[] args) {
        //Objetos
        LibroElectronico primerLibro = new LibroElectronico();
        LibroElectronico segundoLibro = new LibroElectronico();
        LibroElectronico tercerLibro = new LibroElectronico("El principito", 234, 2.7);
        LibroElectronico cuartoLibro = new LibroElectronico("Caperucita Roja", 100, 4);
        LibroElectronico quintoLibro = new LibroElectronico("Mago de Oz", 12_000,12); //Datos que no pueden ser posibles

        System.out.println(primerLibro); //Por defecto te coge el metodo toString
        System.out.println(segundoLibro);

        JOptionPane.showMessageDialog(null,tercerLibro.toString());
        JOptionPane.showMessageDialog(null,cuartoLibro.toString());

        System.out.println(quintoLibro); //Los datos al no estar dentro del rango se ponen por defecto en 0 y en 0

        //Cambio de nº paginas al libro 1
        primerLibro.setNumeroPaginas(13_000);
        System.out.println(primerLibro);

        //Cambio de tamaño al libro 1
        segundoLibro.setTamañoMB(15);
        System.out.println(segundoLibro);

        //Prueba pasarPagina y retrocederPagina
        System.out.println("Pagina Actual: "+tercerLibro.getPaginaActual());
        tercerLibro.pasarPagina(); //Pasar 1 pagina
        System.out.println("Pagina Actual: "+tercerLibro.getPaginaActual());
        tercerLibro.retrocederPagina(); //Retroceder 1 pagina
        System.out.println("Pagina Actual: " +tercerLibro.getPaginaActual());
        tercerLibro.retrocederPagina(); //Retroceder 1 pagina que no hay en el libro
        System.out.println("Pagina Actual: " +tercerLibro.getPaginaActual());

        tercerLibro.saltar(233);//ir a la ultima pagina
        System.out.println("Pagina Actual: " +tercerLibro.getPaginaActual());
        tercerLibro.pasarPagina(); //Pasar pagina que el libro no tiene
        System.out.println("Pagina Actual: " +tercerLibro.getPaginaActual());

        System.out.println("\n\n");

        //Prueba saltar
        System.out.println("Pagina Actual: "+cuartoLibro.getPaginaActual());
        cuartoLibro.saltar(80); //Hacia delante
        System.out.println("Pagina Actual: "+cuartoLibro.getPaginaActual());
        cuartoLibro.saltar(-75); //Hacia detras
        System.out.println("Pagina Actual: "+cuartoLibro.getPaginaActual());
        cuartoLibro.saltar(-20); //Ir a una pagina que ya no tiene el libro
        System.out.println("Pagina Actual: "+cuartoLibro.getPaginaActual());

    }
}
