package calculadora;

import calculadora.PanelCalculadora;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    public Interfaz(){
        super("Calculadora <<Jesus Narbona>>");
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(new PanelCalculadora(), BorderLayout.CENTER);
        panelPrincipal.add(new PanelLCD(), BorderLayout.NORTH);

        this.add(panelPrincipal);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }
}
