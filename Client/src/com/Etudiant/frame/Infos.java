package com.Etudiant.frame;

import java.awt.Toolkit;

public class Infos extends javax.swing.JFrame {
    public LoginGUI in;
    public Infos(String response,LoginGUI in) {
        this.in=in;
        initComponents();
        setIcon();
        String[] arr =response.split(",");
         this.ID.setText(arr[0]);
         this.Fname.setText(arr[1]);
         this.Lname.setText(arr[2]);
         this.BDate.setText(arr[3]);
         this.Class.setText(arr[4]);
         this.PhoneNumber.setText(arr[5]);
         this.Adress.setText(arr[6]);
         this.mail.setText(arr[8]);
    }
    public void setIcon()
        {setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("unnamed.png")));
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ID = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        BDate = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        Adress = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setBorder(null);
        ID.setOpaque(false);
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 47, 740, 50));

        Fname.setEditable(false);
        Fname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.setBorder(null);
        Fname.setOpaque(false);
        getContentPane().add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 740, 60));

        Lname.setEditable(false);
        Lname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.setBorder(null);
        Lname.setOpaque(false);
        getContentPane().add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 740, 60));

        BDate.setEditable(false);
        BDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BDate.setBorder(null);
        BDate.setOpaque(false);
        getContentPane().add(BDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 740, 60));

        Class.setEditable(false);
        Class.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Class.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Class.setBorder(null);
        Class.setOpaque(false);
        getContentPane().add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 740, 60));

        PhoneNumber.setEditable(false);
        PhoneNumber.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        PhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneNumber.setBorder(null);
        PhoneNumber.setOpaque(false);
        getContentPane().add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 730, 60));

        Adress.setEditable(false);
        Adress.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Adress.setBorder(null);
        Adress.setOpaque(false);
        getContentPane().add(Adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 740, 50));

        mail.setEditable(false);
        mail.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail.setBorder(null);
        mail.setOpaque(false);
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 740, 60));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Etudiant/images/-.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeMousePressed(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 40, 40));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Etudiant/images/x2 .png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Etudiant/images/interface 2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        this.dispose();
        this.in.showMe();
        
    }//GEN-LAST:event_closeMousePressed

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        this.setState(Infos.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Adress;
    public static javax.swing.JTextField BDate;
    public static javax.swing.JLabel Background;
    public static javax.swing.JTextField Class;
    public static javax.swing.JTextField Fname;
    public static javax.swing.JTextField ID;
    public static javax.swing.JTextField Lname;
    public static javax.swing.JTextField PhoneNumber;
    public static javax.swing.JLabel close;
    public static javax.swing.JTextField mail;
    public static javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
