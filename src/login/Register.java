/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lie Samsudin
 */
public class Register extends javax.swing.JFrame {
    Connection con = Koneksi.getKoneksi();
    ResultSet rs;
    PreparedStatement pst;
    private static Connection koneksi;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        txID.setEnabled(false);
        autonumber();
    }
    
    private void autonumber(){
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM login ORDER BY id DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoID = r.getString("id").substring(2);
                String ID = "" +(Integer.parseInt(NoID)+1);
                String Zero = "";
                
                if (ID.length()==1) 
                {Zero = "00";}
                else if(ID.length()==2)
                {Zero = "0";}
                else if(ID.length()==3)
                {Zero = "";}
                
                txID.setText("AD" + Zero + ID);
            }else{
                txID.setText("AD001");
            }
            r.close();
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error");
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txUsername = new javax.swing.JTextField();
        txPassword = new javax.swing.JPasswordField();
        txConPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Con.Password");

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK TO LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txConPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Age");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "15", "20", "25", "30", "35", "40", "45", "50" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("id");

        txID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txConPassword, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(114, 114, 114))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txConPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTER PAGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(921, 787));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
//     public static boolean isValidEmail(String username) {
//       // create the EmailValidator instance
//       EmailValidator validator = EmailValidator.getInstance();
//       // check for valid email addresses using isValid method
//       
//     
//       return validator.isValid(username);
//   }
    
     public boolean isValidEmailAddress(String username) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(username);
           return m.matches();
    }
    
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                
        String id = txID.getText().toString().trim();
        
        String username = txUsername.getText().toString().trim();
        
        String password = txPassword.getText().toString().trim();
        String conPassword = txConPassword.getText().toString().trim();
        
        final byte[] authBytes = password.getBytes(StandardCharsets.UTF_8);
        final String encoded = Base64.getEncoder().encodeToString(authBytes);
        System.out.println(password + " => " + encoded);
        
        final byte[] authBytes1 = conPassword.getBytes(StandardCharsets.UTF_8);
        final String encoded1 = Base64.getEncoder().encodeToString(authBytes);
         System.out.println(conPassword + " => " + encoded);
        
        String age = jComboBox1.getSelectedItem().toString();
        
        ValidationsEmail validations = new ValidationsEmail();
        passwordValidationOne validationspass = new passwordValidationOne();
        
        boolean pass = validationspass.valPassword(password);
        String pass1 =String.valueOf(pass);  
        
        String emails =validations.validateEmailAddress(username);
//         System.out.println("check email : "+emails);
         
        if (emails == "Invalid Email Address"){
         JOptionPane.showMessageDialog(this, "username "+emails );
        }else if (pass1 == "Password must be at least 6 characters containing a combination of letters and numbers, and have at least 1 capital letter"){
         JOptionPane.showMessageDialog(this, "Password must be at least 6 characters containing a combination of letters and numbers, and have at least 1 capital letter" );
        }else if (pass1 == "Too Small"){
         JOptionPane.showMessageDialog(this, "Too Small" );
        }

          else 
        {
        if (!password.equals(conPassword)){
            JOptionPane.showMessageDialog(null, "Password not match");
        }else if (password.equals("") || emails.equals("")){
            JOptionPane.showMessageDialog(null, "Username or Password cannot be empty");
        }else if (emails == "Invalid Email Address)"){
            JOptionPane.showMessageDialog(null, "Invalid Email Address");
        }else{ 
            try{   
              
                
                String url = "jdbc:mysql://localhost:3306/login"; 
                String user = "root";
                String password1 = "admin"; 
      //                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection(url, user, password1);
      //          System.out.println("Connection 2 Successfully");


                 pst = con.prepareStatement("insert into login (id, username, password, age) VALUES ( '"+id+"','"+username+"','"+encoded+"','"+age+"');");
                     System.out.println("query1 :"+pst);
//                pst.setString(1, id);     
//                pst.setString(2, txUsername.getText()); 
//                pst.setString(3, txPassword.getText());
//                pst.setString(4, jComboBox1.getSelectedItem().toString());
                pst.executeUpdate();   
                
//                 System.out.println("query 2:"+pst);
//                 System.out.println("p :"+p); 
                  JOptionPane.showMessageDialog(this, "Create Account Successfully");
                pst.close();
                
            }
            catch(SQLException e){
                System.out.println("Error");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                this.dispose();
                Login a = new Login();
                a.setVisible(true);
            }
          }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txConPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txConPasswordActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //get selected value from combobox

        String selectedValue = jComboBox1.getSelectedItem().toString();

                 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txConPassword;
    private javax.swing.JTextField txID;
    private javax.swing.JPasswordField txPassword;
    private javax.swing.JTextField txUsername;
    // End of variables declaration//GEN-END:variables
}
