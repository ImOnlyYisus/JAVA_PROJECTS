
package interfaz.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import interfaz.model.CardModel;


public class Card extends javax.swing.JPanel {
    
    private Color color1;
    private Color color2;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1=Color.BLACK;
        color2=Color.white;
    }
    
    public void setData(CardModel data){
        lbIcon.setIcon(data.getIcon());
        lbDescrip.setText(data.getDescription());
        lbValues.setText(data.getValues());
        lbTitulo.setText(data.getTitle());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbDescrip = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();

        lbIcon.setIcon(new javax.swing.ImageIcon("./iconos/user.png"));

        lbDescrip.setBackground(new java.awt.Color(255, 255, 255));
        lbDescrip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDescrip.setForeground(new java.awt.Color(255, 255, 255));
        lbDescrip.setText("Descripcion");

        lbValues.setBackground(new java.awt.Color(255, 255, 255));
        lbValues.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbValues.setForeground(new java.awt.Color(255, 255, 255));
        lbValues.setText("Values");

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo)
                            .addComponent(lbValues)
                            .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 312, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValues)
                .addGap(18, 18, 18)
                .addComponent(lbDescrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 =(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grandient = new GradientPaint(0,0,color1,0,getHeight(),color2);
        g2.setPaint(grandient);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth()- (getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()- (getHeight()/2)-20, getHeight()/2+20, getHeight(), getHeight());
        
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDescrip;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables
}
