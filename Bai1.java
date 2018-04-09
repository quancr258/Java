/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String hoten = nhap.nextLine();
        System.out.println("điẻm TB: ");
        double tb = nhap.nextDouble();
        System.out.printf("%s %.2f điểm ",hoten,tb);
    }
    
}
