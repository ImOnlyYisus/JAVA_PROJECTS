package tarea1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jesus Narbona Aguilar");
        frame.setSize(800,400);//tamaño de la ventana
        frame.setResizable(false);//No se puede cambiar el tamaño de la ventana
        frame.setVisible(true);//Para que se vea el frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierra la ventana
        frame.setLayout(new BorderLayout()); //Layout

        //Componentes
        InterfazCliente panel1 = new InterfazCliente(Color.ORANGE, "Panel color naranja");
        frame.add(panel1,BorderLayout.NORTH);

        InterfazCliente panel2 = new InterfazCliente(Color.gray,"Panel color gris");
        frame.add(panel2, BorderLayout.SOUTH);

        InterfazCliente panel3 = new InterfazCliente(Color.red);
        panel3.cambiarTexto("Cambio con set, panel rojo");
        frame.add(panel3, BorderLayout.CENTER);

        InterfazCliente panel4 = new InterfazCliente(Color.green);
        panel4.cambiarTexto("Cambio con set, panel verde");
        frame.add(panel4, BorderLayout.WEST);

        InterfazCliente panel5 = new InterfazCliente(Color.magenta);
        panel5.cambiarTexto("Cambio con set, panel magenta");
        frame.add(panel5, BorderLayout.EAST);
    }
}
