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
public class ChangePin extends javax.swing.JFrame {

    Variables var;
    DbConnect db;
    JOptionPane jp;
    static String permit = "";

    /**
     * Creates new form Login
     */
    public ChangePin() {
        initComponents();
        jp = new JOptionPane();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("New Pin:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 60, 40);

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 150, 130, 23);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 150, 130, 23);

        jLabel2.setText("Confirm Pin:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 60, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Change Pin");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(130, 0, 120, 20);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 350, 30);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(140, 90, 200, 30);

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(140, 50, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-382)/2, (screenSize.height-240)/2, 382, 240);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userLogin();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2KeyReleased

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
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables

    void userLogin() {
       
        if (jPasswordField1.getText().isEmpty()) {
            jp.showMessageDialog(rootPane, "Type in Your new Password", "Password", jp.ERROR_MESSAGE);
            jPasswordField1.requestFocus();
            return;
        }
        if (jPasswordField2.getText().isEmpty()) {
            jp.showMessageDialog(rootPane, "Confirm Your Password", "Password", jp.ERROR_MESSAGE);
            jPasswordField2.requestFocus();
            return;
        }
        new SecurityQues(new javax.swing.JFrame(), true).setVisible(true);
        if(jPasswordField1.getText().equalsIgnoreCase(jPasswordField2.getText())){
            try {
               db.ps = db.con.prepareStatement("Update atmacc set pin='"+jPasswordField1.getText()+"' where no='"+var.getCard_id()+"'");
               db.ps.execute();
               JOptionPane.showMessageDialog(rootPane, "Your pin has been change successfully");
               new TransactionHistory(var.getCard_id(),"pin changed", "status", 0);
               setVisible(false);
               new Password().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
                JOptionPane.showMessageDialog(rootPane, "Password did not match\nYour pin has not change");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            }
        

    }

   
}
