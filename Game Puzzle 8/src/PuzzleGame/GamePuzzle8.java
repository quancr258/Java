/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuzzleGame;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class GamePuzzle8 {

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
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameForm().setVisible(true);
                JOptionPane.showMessageDialog(null, "**Hướng dẫn sử dụng:\n"
                        + "+ Chương trình đòi hỏi Bạn phải tự tráo đổi các ô số theo ý mình bằng cách Nhấn vào chúng để đổi vị trí.\n"
                        + "+ Sau khi tráo đổi hãy nhấn Bắt đầu để chương trình tự động tìm Phương án thực hiện.\n"
                        + "+ Sau khi đã tìm ra Phương án bạn có thể Cho phép chương trình Thực hiện hoặc không.\n\n"
                        + "**Lưu ý: Bạn vẫn có thể tự chơi Game bằng cách Nhấn vào các ô số để đổi vị trí của chúng, phù hợp để thách đố với bạn bè.",
                        "Hướng dẫn!",JOptionPane.PLAIN_MESSAGE,
                        new javax.swing.ImageIcon(getClass().getResource("/PuzzleGame/Images/AnswerIcon.png")));
            }
        });
    }
}
