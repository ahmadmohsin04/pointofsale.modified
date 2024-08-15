package design_panel;

import entities.Employee;
import entities.Store;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        this.setLocation(500,200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emp_security_ans = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emp_password = new javax.swing.JPasswordField();
        emp_security_question = new javax.swing.JComboBox<>();
        emp_signup = new javax.swing.JButton();
        emp_reg_back = new javax.swing.JButton();
        emp_confirm_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        emp_u_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Registration Portal");
        setName("Registration"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Portal");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 310, 50));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("User name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 75, -1, 34));

        emp_security_ans.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        emp_security_ans.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        emp_security_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_security_ansActionPerformed(evt);
            }
        });
        getContentPane().add(emp_security_ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 299, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 127, -1, 34));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 34));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Security Question");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 34));

        emp_password.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(emp_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 299, 34));

        emp_security_question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Security Question --", "Your first Pet name?", "Mother Name?", "Teacher Name" }));
        emp_security_question.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(emp_security_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 299, 34));

        emp_signup.setBackground(new java.awt.Color(204, 204, 204));
        emp_signup.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emp_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        emp_signup.setText("SignUp");
        emp_signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        emp_signup.setIconTextGap(10);
        emp_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_signupActionPerformed(evt);
            }
        });
        getContentPane().add(emp_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 120, 40));

        emp_reg_back.setBackground(new java.awt.Color(204, 204, 204));
        emp_reg_back.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emp_reg_back.setText("Back");
        emp_reg_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        emp_reg_back.setIconTextGap(10);
        emp_reg_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_reg_backActionPerformed(evt);
            }
        });
        getContentPane().add(emp_reg_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 120, 40));

        emp_confirm_pass.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(emp_confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 299, 34));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Security Answer");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 34));

        emp_u_name.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        emp_u_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        emp_u_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_u_nameActionPerformed(evt);
            }
        });
        getContentPane().add(emp_u_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 299, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/light-blue-background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emp_security_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_security_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_security_ansActionPerformed

    private void emp_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_signupActionPerformed
        // TODO add your handling code here:                              
        if(!emp_u_name.getText().isEmpty()&&
           !new String(emp_password.getPassword()).isEmpty()&&
           !new String(emp_confirm_pass.getPassword()).isEmpty()&&
            emp_security_question.getSelectedIndex()!=0&&
            !emp_security_ans.getText().isEmpty()){
            if(new String(emp_password.getPassword()).equals(new String(emp_confirm_pass.getPassword()))){
                Employee e = new Employee(emp_u_name.getText(),
                new String(emp_password.getPassword()),
                emp_security_question.getSelectedItem().toString(),
                emp_security_ans.getText());
                Store.addEmployee(e);
                Store.showErrorMessage("Employee successfully registered");        
                this.setVisible(false);
                this.dispose();
                new Welcome().setVisible(true);
            }
            else
                Store.showErrorMessage("password and confirm password should be same");
        }
        else{
            Store.showErrorMessage("Fill the required Fields");
        }
           
        
    }//GEN-LAST:event_emp_signupActionPerformed

    private void emp_reg_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_reg_backActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
       this.dispose();
       new Welcome().setVisible(true);
    }//GEN-LAST:event_emp_reg_backActionPerformed

    private void emp_u_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_u_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_u_nameActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField emp_confirm_pass;
    private javax.swing.JPasswordField emp_password;
    private javax.swing.JButton emp_reg_back;
    private javax.swing.JTextField emp_security_ans;
    private javax.swing.JComboBox<String> emp_security_question;
    private javax.swing.JButton emp_signup;
    private javax.swing.JTextField emp_u_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
