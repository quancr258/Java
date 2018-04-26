/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caro15x15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class XOJLabel extends JLabel implements ActionListener
{
    static ImageIcon X,O;
    
    public XOJLabel(int i, int j)
    {
        X=new ImageIcon(this.getClass().getResource("X.gif"));
        O=new ImageIcon(this.getClass().getResource("O.gif"));
        setHorizontalAlignment(CENTER);
        this.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                lMouseClicked(evt);
            }

            private void lMouseClicked(MouseEvent evt) 
            {
                if(CaroGraphics.ktxo[i][j] == 0)
                {                    
                    if(CaroGraphics.ktp == 1)
                    {
                        //Xác định người đi tiếp theo
                        CaroGraphics.user++;
                        CaroGraphics.user %= 2;

                        switch(CaroGraphics.user)
                        {
                            case 0:
                                    CaroGraphics.XMove(i, j);
                                    Win(i, j);
                                    break;
                            case 1:
                                    CaroGraphics.OMove(i, j);
                                    Win(i, j);
                                    break;
                        }
                    }
                    else if(CaroGraphics.ktp == 2)
                    {
                        //Xác định người đi tiếp theo
                        CaroGraphics.user++;
                        CaroGraphics.user %= 2;
                        
                        CaroGraphics.XMove(i, j);
                        Win(i, j);
                        //CaroGraphics.num++;
                        
                        if(CaroGraphics.user == 0)
                        {
                            CaroGraphics.num++;
                            //Xác định người đi tiếp theo
                            CaroGraphics.user++;
                            CaroGraphics.user %= 2;
                            CaroGraphics.ComMove();
                            Win(CaroGraphics.u, CaroGraphics.v);
                            
                        }
                    }                    
                }
            }
        });
    }
    
    public void Win(int i0, int j0)
    {
//        for(int k = 1; k <= CaroGraphics.n; k++)
//                        for(int l = 1; l <= CaroGraphics.n; l++)
//                            System.out.println("ktxo["+k+"]"+"["+l+"] = "+CaroGraphics.ktxo[k][l]);
//                    System.out.println("i = " + i0 + " j = " + j0);
        if(CaroGraphics.checkWin(i0,j0) == 1)
        {
            if(CaroGraphics.user == 0)
            {
                JOptionPane.showMessageDialog(null, "Người chơi " 
                        + CaroGraphics.getL1() + " Chiến thắng"
                        , "Game over", JOptionPane.PLAIN_MESSAGE);
                CaroGraphics.txt1.setText(String.valueOf(++CaroGraphics.tx));
            }
            else if(CaroGraphics.user == 1)
            {
                JOptionPane.showMessageDialog(null, "Người chơi " 
                        + CaroGraphics.getL2() + " Chiến thắng"
                        , "Game over", JOptionPane.PLAIN_MESSAGE);
                CaroGraphics.txt2.setText(String.valueOf(++CaroGraphics.to));
            }
            CaroGraphics.user = -1; // reset user
            CaroGraphics.win = false;
            CaroGraphics.Icon1.setEnabled(true);
            CaroGraphics.Icon2.setEnabled(false);
            CaroGraphics.del();
        }
        if(CaroGraphics.checkWin(i0,j0) == 2)
        {
            JOptionPane.showMessageDialog(null, "Trận đấu Hòa!"
                        , "Game over", JOptionPane.PLAIN_MESSAGE);
            CaroGraphics.user = -1; // reset user
            CaroGraphics.win = false;
            CaroGraphics.Icon1.setEnabled(true);
            CaroGraphics.Icon2.setEnabled(false);
            CaroGraphics.del();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
