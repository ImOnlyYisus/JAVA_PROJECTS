
package interfaz.form;

import conexion.chat.ChatDAO;
import javax.swing.ImageIcon;

import conexion.rol.RolDAO;
import conexion.usuarios.UserDAO;
import interfaz.model.CardModel;
import java.sql.SQLException;


public class Home extends javax.swing.JPanel {

//    private ChatDAO chatDao = new ChatDAO();
//    private RolDAO rolDao = new RolDAO();
//    private UserDAO userDao = new UserDAO();
    public Home() throws SQLException {
        initComponents();
        card3.setData(new CardModel(new ImageIcon("./iconos/1.png"),"Usuarios","1","Usuarios registrados en la base de datos"));
        card2.setData(new CardModel(new ImageIcon("./iconos/2.png"),"Chats","1","Chats registrados en la base de datos"));
        card1.setData(new CardModel(new ImageIcon("./iconos/3.png"),"Roles", "1", "Roles registrados en la base de datos"));
        card4.setData(new CardModel(new ImageIcon("./iconos/enlace.png"), "Conexion","Correcta","Conexion a la base de datos exitosa!"));
        card5.setData(new CardModel(new ImageIcon("./iconos/documento.png"), "Tablas","3","Tablas almacenadasen  la base de datos"));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card2 = new interfaz.components.Card();
        card3 = new interfaz.components.Card();
        card1 = new interfaz.components.Card();
        panel1 = new javax.swing.JLayeredPane();
        card4 = new interfaz.components.Card();
        card5 = new interfaz.components.Card();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card2.setColor1(new java.awt.Color(142, 142, 250));
        card2.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(186, 123, 247));
        card3.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card3);

        card1.setColor1(new java.awt.Color(241, 208, 62));
        card1.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card1);

        panel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card4.setColor1(new java.awt.Color(16, 153, 141));
        card4.setColor2(new java.awt.Color(55, 239, 125));
        panel1.add(card4);

        card5.setColor1(new java.awt.Color(255, 63, 108));
        card5.setColor2(new java.awt.Color(255, 75, 43));
        panel1.add(card5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfaz.components.Card card1;
    private interfaz.components.Card card2;
    private interfaz.components.Card card3;
    private interfaz.components.Card card4;
    private interfaz.components.Card card5;
    private javax.swing.JLayeredPane panel;
    private javax.swing.JLayeredPane panel1;
    // End of variables declaration//GEN-END:variables
}
