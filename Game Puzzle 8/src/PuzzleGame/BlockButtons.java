/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuzzleGame;

import static PuzzleGame.GameForm.TB;
import static PuzzleGame.GameForm.a;
import static PuzzleGame.GameForm.ktra;
import java.awt.Button;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BlockButtons extends Button
{
    public BlockButtons(int i)
    {        
        //Cài đặt thông số cho Button
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.setFont(new java.awt.Font("Dialog", 1, 48));

        this.setMaximumSize(new java.awt.Dimension(100, 100));

        this.setMinimumSize(new java.awt.Dimension(100, 100));

        this.setPreferredSize(new java.awt.Dimension(100, 100));
            
        //ActionListener MouseClicked
        this.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                lMouseClicked(evt);
            }

            private void lMouseClicked(MouseEvent evt) 
            {
                GameForm.kt = i;
                if(ktra(GameForm.kt) != "null")
                    DoiViTri(GameForm.kt);
                if(GameForm.saiso() == 0) Win();
            }
        });
    }
    public void DoiViTri(int j) //Chương trình thực thi hoán đổi ô số
    {
        if(ktra(j) != "null")
        {
            for(int i = 1; i <= 9; i++)
                if(a[i] == j)
                {
                    int t = a[9];
                    a[9] = j;
                    a[i] = t;
                    setIcon(j,9);
                    setIcon(t, i);
                    break;
                }
        }
    }
     public void setIcon(int i, int j) //Tạo giao diện Icon cho các ô số
    {
        if(j != 9) 
        {
            TB[i].setLabel(String.valueOf(j));
            TB[i].setBackground(new java.awt.Color(204, 204, 255));
        }
        else 
        {
            TB[i].setLabel("");
            TB[i].setBackground(new java.awt.Color(255, 255, 255));
        }
    }
    public void Win()
    {
        JOptionPane.showMessageDialog(this, "Bạn thật Tài Giỏi!",
                "Congratulation!",JOptionPane.PLAIN_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/PuzzleGame/Images/SmileIcon.png")));
    }
}
