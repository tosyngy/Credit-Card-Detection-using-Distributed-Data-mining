package creditcardfrauddictection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author damhiesax
 */
public class RegCard extends javax.swing.JFrame {

    DbConnect dbcon = new DbConnect();
    DbConnect dbcon2 = new DbConnect();
    ResultSetMetaData md;
    String firstname, lastname, PassWord, address, mobileNo, administrator, username, Userid;
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement st;
    Vector<String> data = new Vector<String>();
    Variables var;
    String agentid = "";
    public static String[] rowData;
    int j = 0;

    /**
     * Creates new form UserReg
     */
    public RegCard() {
        initComponents();
        setTitle("Credit Card Registration Page");
        var = new Variables();
        getSetter();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Registraion");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setText("Card Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 80, 30);

        jLabel2.setText(" Card No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 120, 70, 20);

        jLabel3.setText("Card Secrity No:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 90, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 70, 460, 30);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 120, 460, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 160, 460, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 250, 100, 27);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 250, 110, 27);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 250, 100, 27);

        jLabel8.setText("Bank Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 200, 70, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Card Operation Page");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 10, 160, 20);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 610, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 620, 220);

        jButton4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton4.setText("Delete card");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(500, 550, 130, 27);

        jButton5.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton5.setText("block card");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(370, 550, 110, 27);

        jLabel4.setText("1 means BLOCKED 0 means ACTIVE at the status column");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 554, 330, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Bank Name --", "GTB", "access", "UBA", "FirstBank", "FCMB", "Diamond", "Wema" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(120, 200, 460, 30);

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 50, 610, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-665)/2, (screenSize.height-622)/2, 665, 622);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addnew();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(1);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int chk = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to remove this card", "Confirm massage", JOptionPane.YES_NO_OPTION);
        if (chk == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            dbcon.ps = dbcon.con.prepareStatement("delete from card where user_id=? and no=?");
            dbcon.ps.setString(2, jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            dbcon.ps.setInt(1, var.getId());
            dbcon.ps.executeUpdate();
            getSetter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int chk = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to block this card", "Confirm massage", JOptionPane.YES_NO_OPTION);
        if (chk == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            dbcon.ps = dbcon.con.prepareStatement("update card set status=1 where user_id=? and no=?");
            dbcon.ps.setString(2, jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            dbcon.ps.setInt(1, var.getId());
            dbcon.ps.executeUpdate();
            getSetter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        Object ch = evt.getKeyChar();
        num(jTextField2, ch);
        textSize(jTextField2, 30);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegCard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    void getSetter() {
        DefaultTableModel dataSet = new DefaultTableModel();
        j = 0;
        dataSet.addColumn("S/N");
        dataSet.addColumn("Card Name");
        dataSet.addColumn("Card No");
        dataSet.addColumn("Security Digit");
        dataSet.addColumn("Bank Name");
        dataSet.addColumn("Status");
        try {
            //System.out.println("qqqqq  "+query);
            dbcon.rs = dbcon.st.executeQuery("Select * from card where user_id='" + var.getId() + "'");
            while (dbcon.rs.next()) {
                Object[] data = new Object[]{++j, dbcon.rs.getString("name"), dbcon.rs.getString("no"), dbcon.rs.getString("security"), dbcon.rs.getString("bank"), dbcon.rs.getString("status")};
                dataSet.addRow(data);
            }
            jTable1.setModel(dataSet);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An Error occur while fecthing information!!!");
        }

    }

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
            if (!dbcon.rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Kindly meet your finiancial institution to register your card","Card Invalid",JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An Error occur while fecthing information!!!");
        }

        int id = 0;
        try {
            dbcon.ps = dbcon.con.prepareStatement("insert into card (name,no,security,bank,user_id) VALUES(?,?,?,?,?)");
            dbcon.ps.setString(1, jTextField1.getText());
            dbcon.ps.setString(2, jTextField2.getText());
            dbcon.ps.setString(3, jTextField3.getText());
            dbcon.ps.setString(4, jComboBox1.getSelectedItem().toString());
            dbcon.ps.setInt(5, var.getId());
            dbcon.ps.executeUpdate();
            String amt = (Math.random() * 10000) + "";
            String strAmt = String.format(amt, "%.2f");
            dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `bank_account` (`bank_name`, `amt`, `usr_id`) VALUES (?, ?, ?)");
            dbcon.ps.setString(1, jComboBox1.getSelectedItem().toString());
            dbcon.ps.setString(2, strAmt);
            dbcon.ps.setInt(3, var.getId());
            dbcon.ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Card registered successfully..");
        } catch (Exception g) {
            g.printStackTrace();
            System.out.println("Agent not registered successfully.." + g);
        }

        clear();
        getSetter();
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
