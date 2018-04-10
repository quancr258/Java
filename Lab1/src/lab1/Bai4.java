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
public class Bai4 
{
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("a: ");
        double a = nhap.nextDouble();
        System.out.println("b: ");
        double b = nhap.nextDouble();
        System.out.println("c: ");
        double c = nhap.nextDouble();
        double delta= Math.pow(b, 2) - 4 * a * c;
        if(delta >= 0) System.out.printf("Can delta: %f \n", Math.sqrt(delta));
        else System.out.printf("Can delta (delta < 0): %f \n", Math.sqrt(delta));
    }
}
