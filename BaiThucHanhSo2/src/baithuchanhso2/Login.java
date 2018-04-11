/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanhso2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame 
{

    String MSSV = "57131810";
    String pass = "1997";
    public Login() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDN = new javax.swing.JTextField();
        txtPw = new javax.swing.JPasswordField();
        Bdn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mật khẩu:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên ĐN:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        txtDN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDN.setToolTipText("Nhập tên đăng nhập");
        getContentPane().add(txtDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, -1));

        txtPw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPw.setToolTipText("Nhập mật khẩu");
        getContentPane().add(txtPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, -1));

        Bdn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bdn.setText("Đăng nhập");
        Bdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdnActionPerformed(evt);
            }
        });
        getContentPane().add(Bdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdnActionPerformed
        // TODO add your handling code here:
        if(!txtDN.getText().equals(MSSV) || !txtPw.getText().equals(pass))
        {
                JOptionPane.showMessageDialog(null, "Đăng nhập thất bại! "
                        ,"ERROR!",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            new StudentGUI().setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_BdnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
               new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDN;
    private javax.swing.JPasswordField txtPw;
    // End of variables declaration//GEN-END:variables
}
