package calculadora;

import javax.swing.*;
import java.awt.*;

public class PanelLCD extends JPanel {
    protected static JLabel calculos = new JLabel("0");
    protected static JLabel resultado = new JLabel("");

    public PanelLCD() {
        initComponets();
    }

    private void initComponets(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.BLACK);

        calculos.setFont(new Font(Font.MONOSPACED,1,29));
        calculos.setForeground(Color.WHITE);
        resultado.setFont(new Font(Font.MONOSPACED,1,29));
        resultado.setForeground(Color.green);
        this.add(calculos);
    }

    public JLabel getCalculos() {
        return calculos;
    }
}
