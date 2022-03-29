package apuntes.pagina5;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo Pag. 5");
        frame.setSize(800,600);
        frame.add(new Ejemplo5(Color.cyan));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
