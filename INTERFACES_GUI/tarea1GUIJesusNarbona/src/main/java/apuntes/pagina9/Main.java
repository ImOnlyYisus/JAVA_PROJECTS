package apuntes.pagina9;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo pag. 9");
        frame.setSize(800,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //Componentes
        frame.add(new Ejemplo9(Color.yellow), BorderLayout.NORTH);

        frame.add(new Ejemplo9(Color.red), BorderLayout.SOUTH);

        frame.add(new Ejemplo9(Color.gray), BorderLayout.CENTER);
        frame.add(new Ejemplo9(Color.green), BorderLayout.WEST);
        frame.add(new Ejemplo9(Color.cyan), BorderLayout.EAST);
    }
}
