package apuntes.pagina11;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo11 extends JPanel {
    private JButton boton;
    private JTextArea texto;

    public Ejemplo11(){
        initComponents();
    }

    private void initComponents(){
        this.setPreferredSize(new Dimension(600,200));

        this.setBorder(new TitledBorder("Borde del panel"));

        boton = new JButton("Saludar");

        texto =new JTextArea(1,25);

        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(boton);
        this.add(texto);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,texto.getText());
            }
        });
    }
}
