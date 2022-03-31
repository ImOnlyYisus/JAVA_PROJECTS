package tarea2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JPanel implements ActionListener {
    private JButton botonNombre;
    private JButton botonApellidos;
    private JTextArea areaNombre=new JTextArea(1,25);
    private JTextArea areaApellido=new JTextArea(1,25);

    public Interfaz() {
        initComponents();
    }

    private void initComponents(){
        botonNombre = new JButton("Show Nombre");
        botonApellidos = new JButton("Show Apellidos");

        areaNombre.setBackground(Color.ORANGE);
        areaApellido.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());
        this.add(botonNombre);
        this.add(areaNombre);
        this.add(botonApellidos);
        this.add(areaApellido);

        botonNombre.addActionListener(this);
        botonApellidos.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonNombre){
            areaNombre.setText("Jesus");
            areaNombre.setBackground(Color.white);
        }
        if(e.getSource()==botonApellidos){
            areaApellido.setText("Narbona Aguilar");
            areaApellido.setBackground(Color.blue);
        }
    }
}

