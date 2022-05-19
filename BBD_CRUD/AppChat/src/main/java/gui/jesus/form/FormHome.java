package gui.jesus.form;

import gui.jesus.model.ModelCard;
import gui.jesus.component.Card;

import javax.swing.ImageIcon;


import controladores.*;

public class FormHome extends javax.swing.JPanel {
	private static ControladorChat controladorChat = new ControladorChat();
	private static  ControladorUsuario controladorUsuario = new ControladorUsuario();
	private static  ControladorCuenta controladorCuenta = new ControladorCuenta();
	
	
    public FormHome() {
        initComponents();
        card3.setData(new ModelCard(new ImageIcon("./iconos/1.png"),"Usuarios",""+controladorUsuario.findAll().size(),"Usuarios registrados en la base de datos"));
        card2.setData(new ModelCard(new ImageIcon("./iconos/2.png"),"Chats",""+controladorChat.findAll().size(),"Chats registrados en la base de datos"));
        card1.setData(new ModelCard(new ImageIcon("./iconos/3.png"),"Cuentas", ""+controladorCuenta.findAll().size(), "Cuentas registrados en la base de datos"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new Card();
        card2 = new Card();
        card3 = new Card();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Card card1;
    private Card card2;
    private Card card3;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
