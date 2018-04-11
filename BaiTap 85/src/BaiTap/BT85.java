/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import com.sun.org.apache.bcel.internal.util.BCELifier;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Admin
 */
public class BT85 extends javax.swing.JFrame {

    ArrayList<String> arrTen = new ArrayList<>();
    int stt = -1;
    public BT85() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Panright = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        Bxoa = new javax.swing.JButton();
        Bthem = new javax.swing.JButton();
        Bsua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaInfo = new javax.swing.JTextPane();
        Paneleft = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTen = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách Sinh viên");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panright.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tên: ");
        Panright.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, 40));

        txtTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTen.setToolTipText("Nhập tên mới / Hiển thị Tên đang chọn");
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        Panright.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

        Bxoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bxoa.setText("Xóa");
        Bxoa.setToolTipText("Xóa Tên được chọn");
        Bxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BxoaActionPerformed(evt);
            }
        });
        Panright.add(Bxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 70, -1));

        Bthem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bthem.setText("Thêm");
        Bthem.setToolTipText("Thêm Tên vào Danh sách");
        Bthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BthemActionPerformed(evt);
            }
        });
        Panright.add(Bthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        Bsua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bsua.setText("Sửa");
        Bsua.setToolTipText("Sửa Tên được chọn");
        Bsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsuaActionPerformed(evt);
            }
        });
        Panright.add(Bsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, -1));

        jScrollPane2.setEnabled(false);

        txtaInfo.setEditable(false);
        txtaInfo.setEnabled(false);
        jScrollPane2.setViewportView(txtaInfo);

        Panright.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 290, 190));

        jSplitPane1.setRightComponent(Panright);

        Paneleft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstTen.setToolTipText("Danh sách");
        lstTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstTenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstTen);

        Paneleft.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 300));

        jSplitPane1.setLeftComponent(Paneleft);

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsuaActionPerformed
        // TODO add your handling code here:
        arrTen.set(stt, txtTen.getText());
        Object[] mTen = arrTen.toArray();
        lstTen.setListData(mTen);
    }//GEN-LAST:event_BsuaActionPerformed

    private void BthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BthemActionPerformed
        // TODO add your handling code here:
        //cảnh ô nhập để trống
        if(txtTen.getText().equals("") || txtTen.getText().equals(null)) 
            JOptionPane.showConfirmDialog(this, "Không thể thêm dữ liệu Rỗng","Cảnh báo!",JOptionPane.WARNING_MESSAGE);
        //ô nhập không để trống
        else
        {
            //cảnh báo dữ liệu đã tồn tại
            if(arrTen.indexOf(txtTen.getText()) != -1)
            {
                JOptionPane.showConfirmDialog(this, "Không thể thêm dữ liệu Đã tồn tại","Cảnh báo!",JOptionPane.WARNING_MESSAGE);
            }
            //ô nhập hợp lệ
            else
            {
                //thêm vào ArrayList
                arrTen.add(txtTen.getText());
                // chuyển sang kiểu mảng để đưa vào JList
                Object[] mTen = arrTen.toArray();
                lstTen.setListData(mTen);
            }
        }
    }//GEN-LAST:event_BthemActionPerformed

    //nhận diện L-Click vào ArrayList
    private void lstTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstTenMouseClicked
        // TODO add your handling code here:
        ListModel dsTen= lstTen.getModel();
        stt = lstTen.getSelectedIndex();
        String tensl = dsTen.getElementAt(stt).toString();
        txtTen.setText(tensl);
    }//GEN-LAST:event_lstTenMouseClicked

    private void BxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BxoaActionPerformed
        // TODO add your handling code here:
        if(stt<0)
            JOptionPane.showConfirmDialog(this, "Không thể xóa dữ liệu Không được chọn","Cảnh báo!",JOptionPane.WARNING_MESSAGE);
        int a = JOptionPane.showConfirmDialog(this,"Bạn có chắc chắn xóa \"" + lstTen.getModel().getElementAt(stt).toString() + "\" ? ",
                 "Cảnh báo!",JOptionPane.WARNING_MESSAGE);  
        if(a==JOptionPane.YES_OPTION)
        {
            arrTen.remove(stt);
            Object[] mTen = arrTen.toArray();
            lstTen.setListData(mTen);
            stt = -1;
        }
    }//GEN-LAST:event_BxoaActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        
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
            java.util.logging.Logger.getLogger(BT85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BT85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BT85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BT85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new BT85().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsua;
    private javax.swing.JButton Bthem;
    private javax.swing.JButton Bxoa;
    private javax.swing.JPanel Paneleft;
    private javax.swing.JPanel Panright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList lstTen;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextPane txtaInfo;
    // End of variables declaration//GEN-END:variables
}