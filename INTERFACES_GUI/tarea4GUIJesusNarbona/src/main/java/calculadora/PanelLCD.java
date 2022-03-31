package calculadora;

import javax.swing.*;
import java.awt.*;

public class PanelLCD extends JPanel {
    private JLabel calculos = new JLabel("ejemplo");

    public PanelLCD() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.BLACK);

        calculos.setFont(new Font("Dialog", 1, 29));
        calculos.setForeground(Color.WHITE);
        this.add(calculos);
    }
}
