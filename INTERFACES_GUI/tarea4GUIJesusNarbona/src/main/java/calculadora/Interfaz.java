package calculadora;

import calculadora.PanelCalculadora;

import javax.swing.*;

public class Interfaz extends JFrame {
    public Interfaz(){
        super("Calculadora <<Jesus Narbona>>");
        this.add(new PanelCalculadora());
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }
}
