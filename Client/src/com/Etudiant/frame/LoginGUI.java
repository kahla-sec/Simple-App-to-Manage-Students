package com.Etudiant.frame;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.HashSet;

public class LoginGUI extends javax.swing.JFrame {

    //Constructeur
    public LoginGUI() {
        
        initComponents();
        setIcon();
    }
   public boolean validID(String ID){
       if (ID.isEmpty()){
           return false;
       }else {
           HashSet<String> h = new HashSet<String>();
            h.add("0001");
            h.add("0002");
            h.add("0003");
            h.add("0004");
            if(!h.contains(ID))
            {return false;}
            else{
                return true;
            }
       }
   }    
 
    public void showMe(){
        this.setVisible(true);}
    public void hideMe(){
        this.setVisible(false);
    }
    public void closeMe(){
        this.dispose();
    }
    public void setIcon()
        {setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("unnamed.png")));
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        Num = new javax.swing.JPasswordField();
        zt1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(720, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 60, 50));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeMousePressed(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 50, 40));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Etudiant/images/search 2.png"))); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn1MouseReleased(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 250, 60));

        Num.setBackground(new java.awt.Color(255, 255, 255, 0));
        Num.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        Num.setForeground(new java.awt.Color(54, 47, 98));
        Num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num.setBorder(null);
        Num.setCaretColor(new java.awt.Color(102, 102, 255));
        Num.setOpaque(false);
        getContentPane().add(Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 450, 40));
        Num.getAccessibleContext().setAccessibleDescription("");

        zt1.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        zt1.setForeground(new java.awt.Color(255, 0, 0));
        zt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(zt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 470, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Etudiant/images/interface.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        ImageIcon img =new ImageIcon(getClass().getResource("search1.png"));
        btn1.setIcon(img);
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        ImageIcon img =new ImageIcon(getClass().getResource("search 2.png"));
        btn1.setIcon(img);
        
    }//GEN-LAST:event_btn1MouseExited

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
         //Design
         ImageIcon img =new ImageIcon(getClass().getResource("search1.png"));
         btn1.setIcon(img);
         //
         String ID=new String(this.Num.getPassword());
         if (!validID(ID)){
             zt1.setText("Please enter a valid Student's ID !");
             }
         
         else{
             zt1.setText("");
            try {
            ClientSocket cs=new ClientSocket(ID,this);
            zt1.setText(cs.msg);
            } 
            catch (Exception ex) {
            zt1.setText("Connection problem !");
                
             }
         }

    }//GEN-LAST:event_btn1MousePressed

    private void btn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseReleased
        ImageIcon img =new ImageIcon(getClass().getResource("search 2.png"));
        btn1.setIcon(img);
    }//GEN-LAST:event_btn1MouseReleased

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
       System.exit(0);
    
    }//GEN-LAST:event_closeMousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(LoginGUI.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed
 public static void main(String args[]) throws Exception
     {
        /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Num;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel zt1;
    // End of variables declaration//GEN-END:variables
}
