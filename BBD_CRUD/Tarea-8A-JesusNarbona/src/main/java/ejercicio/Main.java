package ejercicio;

import conections.BDConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = BDConection.getInstance();


    }
}
