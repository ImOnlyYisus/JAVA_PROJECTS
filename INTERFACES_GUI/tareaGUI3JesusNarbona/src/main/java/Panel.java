import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Panel extends JPanel{
    private JButton btnRandom;
    private JLabel numero = new JLabel("Numero");

    public Panel() {
        initComponets();
    }

    private void initComponets() {
        btnRandom = new JButton("Generar Aleatorio");
        btnRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rd = new Random();
                numero.setText("" + (rd.nextInt(10) + 1));
            }
        });

        btnRandom.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnRandom.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnRandom.setBackground(Color.white);

            }
        });

        this.setLayout(new FlowLayout());
        this.add(btnRandom);
        this.add(numero);
    }
}
