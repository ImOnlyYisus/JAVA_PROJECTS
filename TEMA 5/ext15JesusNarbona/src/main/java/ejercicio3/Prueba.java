package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;

import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {
        Empresa empresaA = new Empresa("VICO SL", "12345A");
        Empresa empresaB = new Empresa("PINTURAS ALT", "23456B");

        Trabajador t1 = new Trabajador("Juan", "Perez", LocalDate.of(1973, 4, 13), CategoriaEmpleado.AVANZADA);
        Trabajador t2 = new Trabajador("Rodrigo", "ASdasd", LocalDate.of(2000, 6, 23), CategoriaEmpleado.INICIAL);
        Trabajador t3 = new Trabajador("Obi-wan", "Lopez", LocalDate.of(1985, 1, 15), CategoriaEmpleado.AVANZADA);
        Trabajador t4 = new Trabajador("Albert", "jkldf", LocalDate.of(1999, 1, 15), CategoriaEmpleado.MEDIA);
        Trabajador t5 = new Trabajador("Joaquin", "fgfdg", LocalDate.of(1970, 4, 8), CategoriaEmpleado.INICIAL);
        Trabajador t6 = new Trabajador(t3);

        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);

        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);

        empresaA.imprimir();
        System.out.println();
        empresaB.imprimir();

        empresaB.despedir(t5);
        empresaA.contratar(t5);

        empresaA.ordenarNombre();
        empresaB.ordenarNombre();

        empresaA.imprimir();
        System.out.println();
        empresaB.imprimir();

        System.out.println(empresaA.buscarNombre(new Trabajador("Obi-wan", "Lopez", LocalDate.of(1985, 1, 15), CategoriaEmpleado.AVANZADA)));

        System.out.println(empresaB.buscarNombre(new Trabajador("Obi-wan", "Lopez", LocalDate.of(1985, 1, 15), CategoriaEmpleado.AVANZADA)));


    }
}
