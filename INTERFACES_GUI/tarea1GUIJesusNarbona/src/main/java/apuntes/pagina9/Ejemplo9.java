package apuntes.pagina9;

import javax.swing.*;
import java.awt.*;

public class Ejemplo9 extends JPanel {
    private JLabel texto;

    public Ejemplo9(Color color){
        initComponent();
        cambiarColor(color);
    }

    private void initComponent(){
        texto = new JLabel("Etiqueta de MiPanel");
        this.add(texto);
    }

    private void cambiarColor(Color color){
        this.setBackground(color);
    }

    public JLabel getTexto() {
        return texto;
    }
}
