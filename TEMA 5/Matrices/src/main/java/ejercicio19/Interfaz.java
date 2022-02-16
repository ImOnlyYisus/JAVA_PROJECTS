package ejercicio19;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    public static void mainInterfaz(Avion avion){
        JFrame frame = new JFrame("VICO´S AIRLINE");
        JPanel panel = new JPanel();
        JButton[][] botones = new JButton[25][4];
        Container cIzq = new Container();
        Container c1 = new Container();
        Container c2 = new Container();
        Container cDerc = new Container();
        cIzq.setLayout(new GridLayout(25,1,20,5));
        c1.setLayout(new GridLayout(25,2,10,5));
        c2.setLayout(new GridLayout(25,2,10,5));
        cDerc.setLayout(new GridLayout(25,1,20,5));

        panel.setLayout(new GridLayout(1,6,50,0));


        for (int i = 0; i <botones.length ; i++) {
            for (int j = 0; j <botones[i].length ; j++) {
                botones[i][j]=new JButton(""+i+j);
                if(j<2){
                    c1.add(botones[i][j]);
                }else{
                    c2.add(botones[i][j]);
                }

                if(avion.getAsientosAvion()[i][j].isOcupado()){
                    botones[i][j].setBackground(Color.green);
                } else{
                    botones[i][j].setBackground(Color.red);
                }
                int indexA = i;
                int indexB = j;
                botones[i][j].addActionListener(e -> {
                    cambiarAsientos(avion, indexA, indexB,botones);
                });
            }
        }

        panel.add(cIzq);
        panel.add(c1);
        panel.add(c2);
        panel.add(cDerc);
        frame.add(panel);

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        frame.setSize(width/2, height/2);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void cambiarAsientos(Avion avion, int i, int j, JButton[][] botones){
        if(avion.getAsientosAvion()[i][j].isOcupado()){
            avion.getAsientosAvion()[i][j].reservar();
            botones[i][j].setBackground(Color.red);
            System.out.println(avion.getAsientosAvion()[i][j].isEstado());
        } else{
            avion.getAsientosAvion()[i][j].cancelar();
            botones[i][j].setBackground(Color.green);
            System.out.println(avion.getAsientosAvion()[i][j].isEstado());
        }
    }

}
