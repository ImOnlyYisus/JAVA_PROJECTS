package calculadora;

import javax.swing.*;
import java.awt.*;

public class PanelCalculadora extends JPanel {
    private JButton n1 = new JButton("1");
    private JButton n2 = new JButton("2");
    private JButton n3 = new JButton("3");
    private JButton n4 = new JButton("4");
    private JButton n5 = new JButton("5");
    private JButton n6 = new JButton("6");
    private JButton n7 = new JButton("7");
    private JButton n8 = new JButton("8");
    private JButton n9 = new JButton("9");

    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton equals = new JButton("=");
    private JButton multiply = new JButton("*");
    private JButton division = new JButton("/");
    private JButton clear = new JButton("C");
    private JButton backspace = new JButton("<-");

    public PanelCalculadora() {
        initComponets();
    }

    private void initComponets(){
        //Layout
        this.setLayout(new GridLayout(4, 4));

        //Add buttons
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.add(plus);
        this.add(n4);
        this.add(n5);
        this.add(n6);
        this.add(minus);
        this.add(n7);
        this.add(n8);
        this.add(n9);
        this.add(multiply);
        this.add(clear);
        this.add(equals);
        this.add(division);
        this.add(backspace);

        //Set button properties


    }
}
