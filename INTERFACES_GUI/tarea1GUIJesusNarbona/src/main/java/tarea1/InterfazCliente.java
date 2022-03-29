package tarea1;

import javax.swing.*;
import java.awt.*;

public class InterfazCliente extends JPanel {
    private JLabel texto;

    //Constructor
    public InterfazCliente(Color color, String texto){
        initComponent();
        cambiarColor(color);
        this.texto.setText(texto);
    }

    public InterfazCliente(Color color){
        initComponent();
        cambiarColor(color);
    }

    //Inicializar componentes
    private void initComponent(){
        texto = new JLabel("Etiqueta de MiPanel");
        this.add(texto);
    }

    //Cambiar color
    private void cambiarColor(Color color){
        this.setBackground(color);
    }
    //Cambiar texto
    public void cambiarTexto(String text){
        texto.setText(text);
    }

    public JLabel getTexto() {
        return texto;
    }
}
