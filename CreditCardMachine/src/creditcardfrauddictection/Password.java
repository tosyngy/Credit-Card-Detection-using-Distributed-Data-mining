package creditcardfrauddictection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tosyngy
 */
public class Password extends javax.swing.JFrame {

    Variables var;
    DbConnect db;
    int b = 0;

    /**
     * Creates new form Login
     */
    public Password() {
        initComponents();
        db = new DbConnect();
        var = new Variables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("Pin:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 100, 60, 30);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 60, 200, 30);

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 140, 130, 23);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 140, 130, 23);

        jLabel2.setText("Please supply your credit card details below.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 30, 220, 20);

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(120, 100, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" Credit Card Machine");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 0, 150, 30);

        jLabel4.setText("Card No:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 60, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-382)/2, (screenSize.height-229)/2, 382, 229);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setSelectionStart(0);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userLogin();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        Object ch = evt.getKeyChar();
        num(jTextField1, ch);
        textSize(jTextField1, 16);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    void userLogin() {
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Type your Card no", "Credit Card", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
            return;
        }
        if (jPasswordField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please type in your pin", "Credit Card", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
            return;
        }

        //testing if internet connection is available

        try {
            String sqlQuery = "select a.pin,a.id,a.status,b.user_id from atmacc as a,card as b where a.no='" + jTextField1.getText() + "' and a.no=b.no";
            db.rs = db.st.executeQuery(sqlQuery);
            if (db.rs.next()) {
                if (db.rs.getInt(3) == 1) {
                    JOptionPane.showMessageDialog(rootPane, "This Card has Been Block\nContact your finacial assistance");
                    this.setVisible(false);
                    new Password().setVisible(true);
                    return;
                }

                if (db.rs.getString(1).equals(jPasswordField1.getText())) {
                    var.setCard_id(jTextField1.getText());
                    var.setId(db.rs.getInt(4));
                    this.setVisible(false);
                    new CreditCardWelcome().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Invalid Pin");
                    b++;
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Invalid Info Supply");
            }
            if (b >= 3) {
                db.ps = db.con.prepareStatement("Update atmacc set status=1 where no='" + jTextField1.getText() + "'");
                db.ps.execute();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "There was a Problem retrying this data");
            e.printStackTrace();
        }

    }

    public void num(JTextField a, Object ch) {
        String cha = ch.toString();
        if (!"123456789.0\b\n".contains(cha)) {
            a.setText(a.getText().substring(0, (a.getText().length() - 1)));
        }
    }

    public void textSize(JTextField a, int i) {
        if (a.getText().length() > i) {
            a.setText(a.getText().substring(0, i));
        }
    }
}
