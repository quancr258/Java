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
public class Bai2 
{
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("dai: ");
        double dai = nhap.nextDouble();
        System.out.println("rong: ");
        double rong = nhap.nextDouble();
        double chuvi = (dai + rong) * 2;
        double dientich = dai * rong;
        double canhmin = Math.min(dai, rong);
        System.out.printf("chu vi: %f \n", chuvi);
        System.out.printf("dien tich: %f \n", dientich);
        System.out.printf("canh nho nhat: %f \n", canhmin);
    }
}
