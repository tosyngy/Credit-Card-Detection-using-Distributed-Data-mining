package creditcardfrauddictection;

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
        setTitle("User Registration Page");

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Registraion");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setText("Surname:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 80, 120, 14);

        jLabel2.setText("Other names:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 110, 14);

        jLabel3.setText("Date of Birth:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 170, 80, 20);

        jLabel4.setText("State of Origin:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 240, 90, 14);

        jLabel5.setText("Local Govt: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 280, 90, 14);

        jLabel6.setText("Marital Status: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 510, 80, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 70, 360, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 130, 360, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(160, 270, 360, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(160, 230, 360, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Status", "Single", "Married", "Divorce", "Widow" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 510, 360, 20);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton1.setText("Save and Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 680, 220, 27);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 680, 120, 27);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 680, 110, 27);

        jLabel8.setText("Phone No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 320, 70, 14);

        jLabel11.setText("First Name:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 110, 110, 14);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(160, 100, 360, 30);

        jLabel12.setText("Occupation: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 440, 90, 20);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(160, 470, 360, 30);

        jLabel13.setText("Place of Birth: ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 480, 90, 10);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(160, 350, 360, 30);

        jLabel18.setText("Maiden Name:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 360, 90, 10);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14);
        jTextField14.setBounds(160, 390, 360, 30);

        jLabel19.setText("Address:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 400, 60, 10);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(160, 200, 360, 20);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(160, 310, 360, 30);

        jLabel23.setText("Re-Confirm Password:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(30, 630, 130, 10);

        jLabel25.setText("E-mail address:");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(30, 550, 90, 20);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(160, 540, 360, 30);

        jLabel20.setText("Gender: ");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 200, 60, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setText("REGISTRATION PAGE");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 10, 420, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(160, 170, 70, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(240, 170, 70, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2001", "2002", "2003", "2004", "2005", "2006", "2007" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(340, 170, 70, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 430, 360, 30);

        jLabel24.setText("Password:");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(30, 590, 90, 10);

        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(160, 620, 360, 30);

        jPasswordField2.setText("jPasswordField1");
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(160, 580, 360, 30);

        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 60, 560, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-603)/2, (screenSize.height-757)/2, 603, 757);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addnew();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    void clear() {
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTextField11.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);

    }

    void addnew() {
        String emt = "";

        if (jTextField1.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "SurName  required");
            return;
        }
        if (jTextField7.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Atleast a First Name is Required");
            return;
        }
        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Gender must be select");
            return;
        }
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Marital Status is required");
            return;
        }
        if (jTextField9.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "A contact no must be supply");
            return;
        }
        if (jTextField4.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Local Govt require");
            return;
        }
        if (jTextField5.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "State of origin is required");
            return;
        }
        if (jTextField13.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Meidain Name required");
            return;
        }
        if (jTextField14.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Voters Residential Address required");
            return;
        }
        if (jTextField3.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Occupation Name required");
            return;
        }

        if (jTextField8.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Place of birth is required");
            return;
        }
        if (jPasswordField2.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Password is required");
            return;
        }
        if (!jPasswordField2.getText().equals(jPasswordField2.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Password does not match");
            return;
        }
        if (jTextField11.getText().equals(emt)) {
            JOptionPane.showMessageDialog(rootPane, "Emial is required");
            return;
        }
        if (jComboBox3.getSelectedIndex() == 0 || jComboBox4.getSelectedIndex() == 0 || jComboBox5.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Select Date Properly");
            return;
        }

        try {

            String datad = jComboBox3.getSelectedItem().toString();
            datad += "/" + jComboBox4.getSelectedItem().toString();
            datad += "/" + jComboBox5.getSelectedItem().toString();

            dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `register_detaila` (`email`, `surname`, `first name`, `other name`, `date of birth`, `gender`, `occupation`, `state of origin`, `local government`, `meiden name`, `address`, `state of birth`, `mobile no`, `marital status`, `password`) VALUES (?,?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            dbcon.ps.setString(1, jTextField11.getText());
            dbcon.ps.setString(2, jTextField1.getText());
            dbcon.ps.setString(3, jTextField7.getText());
            dbcon.ps.setString(4, jTextField2.getText());
            dbcon.ps.setString(5, datad);
            dbcon.ps.setString(6, jComboBox2.getSelectedItem().toString());
            dbcon.ps.setString(7, jTextField3.getText());
            dbcon.ps.setString(8, jTextField5.getText());
            dbcon.ps.setString(9, jTextField4.getText());
            dbcon.ps.setString(10, jTextField13.getText());
            dbcon.ps.setString(11, jTextField14.getText());
            dbcon.ps.setString(12, jTextField8.getText());
            dbcon.ps.setString(13, jTextField9.getText());
            dbcon.ps.setString(14, jComboBox1.getSelectedItem().toString());
            dbcon.ps.setString(15, jPasswordField1.getText());
            dbcon.ps.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "You have successfully registered");
            setVisible(false);

        } catch (Exception g) {
            g.printStackTrace();
            System.out.println("user not registered successfully.." + g);
        }
//        }
        clear();
    }
}