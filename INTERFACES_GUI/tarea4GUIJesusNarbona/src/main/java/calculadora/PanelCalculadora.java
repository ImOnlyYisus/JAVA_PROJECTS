package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCalculadora extends JPanel implements ActionListener, MouseListener {
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
    private JButton backspace = new JButton("←");

    public PanelCalculadora() {
        initComponets();
    }

    private void initComponets() {
        //Layout
        this.setLayout(new GridLayout(4, 4));

        //Set button properties
        n1.setFont(new Font("Arial", Font.BOLD, 20));
        n2.setFont(new Font("Arial", Font.BOLD, 20));
        n3.setFont(new Font("Arial", Font.BOLD, 20));
        n4.setFont(new Font("Arial", Font.BOLD, 20));
        n5.setFont(new Font("Arial", Font.BOLD, 20));
        n6.setFont(new Font("Arial", Font.BOLD, 20));
        n7.setFont(new Font("Arial", Font.BOLD, 20));
        n8.setFont(new Font("Arial", Font.BOLD, 20));
        n9.setFont(new Font("Arial", Font.BOLD, 20));
        plus.setFont(new Font("Arial", Font.BOLD, 20));
        minus.setFont(new Font("Arial", Font.BOLD, 20));
        equals.setFont(new Font("Arial", Font.BOLD, 20));
        multiply.setFont(new Font("Arial", Font.BOLD, 20));
        division.setFont(new Font("Arial", Font.BOLD, 20));
        clear.setFont(new Font("Arial", Font.BOLD, 20));
        backspace.setFont(new Font("Arial", Font.BOLD, 20));

        n1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        n9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        plus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        minus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        equals.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        multiply.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        division.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        clear.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        backspace.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        equals.addActionListener(this);
        multiply.addActionListener(this);
        division.addActionListener(this);
        clear.addActionListener(this);
        backspace.addActionListener(this);

        n1.addMouseListener(this);
        n2.addMouseListener(this);
        n3.addMouseListener(this);
        n4.addMouseListener(this);
        n5.addMouseListener(this);
        n6.addMouseListener(this);
        n7.addMouseListener(this);
        n8.addMouseListener(this);
        n9.addMouseListener(this);
        plus.addMouseListener(this);
        minus.addMouseListener(this);
        equals.addMouseListener(this);
        multiply.addMouseListener(this);
        division.addMouseListener(this);
        clear.addMouseListener(this);
        backspace.addMouseListener(this);

        n1.setBackground(Color.WHITE);
        n2.setBackground(Color.WHITE);
        n3.setBackground(Color.WHITE);
        n4.setBackground(Color.WHITE);
        n5.setBackground(Color.WHITE);
        n6.setBackground(Color.WHITE);
        n7.setBackground(Color.WHITE);
        n8.setBackground(Color.WHITE);
        n9.setBackground(Color.WHITE);
        plus.setBackground(Color.WHITE);
        minus.setBackground(Color.WHITE);
        equals.setBackground(Color.WHITE);
        multiply.setBackground(Color.WHITE);
        division.setBackground(Color.WHITE);
        clear.setBackground(Color.WHITE);
        backspace.setBackground(Color.WHITE);


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
        this.add(division);
        this.add(clear);
        this.add(backspace);
        this.add(equals);
        this.add(division);
    }

    //Action listener
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
        //No tiene uso
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //No tiene uso
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //No tiene uso
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.WHITE);
    }
}
