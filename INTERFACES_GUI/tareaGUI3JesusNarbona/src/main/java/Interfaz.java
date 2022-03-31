import javax.swing.*;

public class Interfaz extends JFrame {
    public Interfaz(){
        super("Tarea 3 <<Jesus Narbona>>");
        this.add(new Panel());

        this.setVisible(true);

        this.setSize(500,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
