package creditfraudadmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author damhiesax
 */
public class Register extends javax.swing.JFrame {

    DbConnect dbcon = new DbConnect();
    ResultSetMetaData md;
    String firstname, lastname, PassWord, address, mobileNo, administrator, username, Userid;
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement st;
    Vector<String> data = new Vector<String>();
    byte[] image = null;
    byte print[] = null;
    byte print2[] = null;
    public static String[] rowData;
    int j = 0;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setTitle("Credit Card Registration Page");

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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Registraion");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 70, 420, 30);

        jLabel1.setText("Card Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 70, 30);

        jLabel2.setText(" Card No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 120, 70, 20);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 120, 420, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 160, 420, 30);

        jLabel3.setText("Card Secrity No:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 90, 30);

        jLabel8.setText("Bank Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 200, 80, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Bank Name --", "GTB", "access", "UBA", "FirstBank", "FCMB", "Diamond", "Wema" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(120, 200, 420, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 250, 90, 27);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 250, 70, 27);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(440, 250, 100, 27);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 570, 40);

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 50, 570, 250);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Card Registration Page");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(230, 10, 170, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-603)/2, (screenSize.height-346)/2, 603, 346);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addnew();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        Object ch = evt.getKeyChar();
        num(jTextField2, ch);
        textSize(jTextField2, 16);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        Object ch = evt.getKeyChar();
        num(jTextField3, ch);
        textSize(jTextField3, 3);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(1);
    }

    void addnew() {
        String emt = "";
        if (jTextField1.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Card Name  required");
            return;
        }
        if (jTextField2.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Card No required");
            return;
        }
        if (jTextField3.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Card Security No required");
            return;
        }
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bank Name required");
            return;
        }
        try {
            //System.out.println("qqqqq  "+query);
            dbcon.rs = dbcon.st.executeQuery("SELECT * FROM  `atmacc` WHERE  `name` =  '" + jTextField1.getText() + "' AND  `no` =  '" + jTextField2.getText() + "' AND  `security_no` ='" + jTextField3.getText() + "' AND  `bank` =  '" + jComboBox1.getSelectedItem().toString() + "'");
            if (dbcon.rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Atm Card with such details already existed");
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An Error occur while fecthing information!!!");
        }

        int id = 0;
        try {
            dbcon.ps = dbcon.con.prepareStatement("insert into atmacc (name,no,security_no,bank,pin) VALUES(?,?,?,?,?)");
            dbcon.ps.setString(1, jTextField1.getText());
            dbcon.ps.setString(2, jTextField2.getText());
            dbcon.ps.setString(3, jTextField3.getText());
            dbcon.ps.setString(4, jComboBox1.getSelectedItem().toString());
            dbcon.ps.setString(5, "0000");
            dbcon.ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Card registered successfully..");
        } catch (Exception g) {
            g.printStackTrace();
            System.out.println("Card not registered successfully.." + g);
        }

        clear();
        //  getSetter();
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
