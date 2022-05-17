package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCalculadora extends JPanel implements ActionListener, MouseListener {
    private static int operacion;
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
    private JButton n0 = new JButton("0");

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
        n0.setFont(new Font("Arial", Font.BOLD, 20));

        n1.setFocusPainted(false);
        n2.setFocusPainted(false);
        n3.setFocusPainted(false);
        n4.setFocusPainted(false);
        n5.setFocusPainted(false);
        n6.setFocusPainted(false);
        n7.setFocusPainted(false);
        n8.setFocusPainted(false);
        n9.setFocusPainted(false);
        plus.setFocusPainted(false);
        minus.setFocusPainted(false);
        equals.setFocusPainted(false);
        multiply.setFocusPainted(false);
        division.setFocusPainted(false);
        clear.setFocusPainted(false);
        n0.setFocusPainted(false);

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
        n0.setBorder(BorderFactory.createLineBorder(Color.BLACK));

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
        n0.addActionListener(this);

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
        n0.addMouseListener(this);

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
        n0.setBackground(Color.WHITE);


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
        this.add(n0);
        this.add(equals);
        this.add(division);
    }

    //Action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == n0) {
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "0");
        }
        if (e.getSource() == n1) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "1");
        }
        if (e.getSource() == n2) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "2");
        }
        if (e.getSource() == n3) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "3");
        }
        if (e.getSource() == n4) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "4");
        }
        if (e.getSource() == n5) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "5");
        }
        if (e.getSource() == n6) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "6");
        }
        if (e.getSource() == n7) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "7");
        }
        if (e.getSource() == n8) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "8");
        }
        if (e.getSource() == n9) {
            if(PanelLCD.calculos.getText().charAt(0) == '0'){
                PanelLCD.calculos.setText("");
            }
            PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "9");
        }
        if (e.getSource() == plus) {
            if(PanelLCD.calculos.getText().charAt(0) != '0') {
                if (PanelLCD.calculos.getText().contains("-") || PanelLCD.calculos.getText().contains("*") || PanelLCD.calculos.getText().contains("/")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("-", "+"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("*", "+"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("/", "+"));
                } else if (!PanelLCD.calculos.getText().contains("+") && !PanelLCD.calculos.getText().contains("=")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "+");
                }
            }
        }
        if (e.getSource() == minus) { //TODO: Arreglar poder operar con numeros negativos
            if(PanelLCD.calculos.getText().charAt(0) != '0'){
                if (PanelLCD.calculos.getText().contains("+") || PanelLCD.calculos.getText().contains("*") || PanelLCD.calculos.getText().contains("/") && PanelLCD.calculos.getText().charAt(0) != '-') {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("+", "-"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("*", "-"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("/", "-"));
                } else if (!PanelLCD.calculos.getText().contains("-") && !PanelLCD.calculos.getText().contains("=")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "-");
                } else if (PanelLCD.calculos.getText().charAt(0) == '-') {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "-");
                }
            }

        }
        if (e.getSource() == equals) {
            if (!PanelLCD.calculos.getText().contains("=")) {
                PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "=");
            }

            if (PanelLCD.calculos.getText().contains("+")) {
                String[] parts = PanelLCD.calculos.getText().substring(0, PanelLCD.calculos.getText().length() - 1).split("\\+");
                operacion = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
                PanelLCD.calculos.setText(String.valueOf(operacion));
            }
            if (PanelLCD.calculos.getText().contains("-")) {
                String[] parts = PanelLCD.calculos.getText().substring(0, PanelLCD.calculos.getText().length() - 1).split("\\-");
                operacion = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
                PanelLCD.calculos.setText(String.valueOf(operacion));

            }
            if (PanelLCD.calculos.getText().contains("*")) {
                String[] parts = PanelLCD.calculos.getText().substring(0, PanelLCD.calculos.getText().length() - 1).split("\\*");
                operacion = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
                PanelLCD.calculos.setText(String.valueOf(operacion));
            }
            if (PanelLCD.calculos.getText().contains("/")) {
                String[] parts = PanelLCD.calculos.getText().substring(0, PanelLCD.calculos.getText().length() - 1).split("\\/");
                operacion = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
                PanelLCD.calculos.setText(String.valueOf(operacion));
            }

        }
        if (e.getSource() == multiply) {
            if (PanelLCD.calculos.getText().charAt(0) != '0') {
                if (PanelLCD.calculos.getText().contains("+") || PanelLCD.calculos.getText().contains("-") || PanelLCD.calculos.getText().contains("/")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("+", "*"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("-", "*"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("/", "*"));
                } else if (!PanelLCD.calculos.getText().contains("*") && !PanelLCD.calculos.getText().contains("=")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "*");
                }
            }

        }
        if (e.getSource() == division) {
            if (PanelLCD.calculos.getText().charAt(0) != '0') {
                if (PanelLCD.calculos.getText().contains("+") || PanelLCD.calculos.getText().contains("-") || PanelLCD.calculos.getText().contains("*")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("+", "/"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("-", "/"));
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText().replace("*", "/"));
                } else if (!PanelLCD.calculos.getText().contains("/") && !PanelLCD.calculos.getText().contains("=")) {
                    PanelLCD.calculos.setText(PanelLCD.calculos.getText() + "/");
                }
            }

        }
        if (e.getSource() == clear) {
            PanelLCD.calculos.setText("0");
        }
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
