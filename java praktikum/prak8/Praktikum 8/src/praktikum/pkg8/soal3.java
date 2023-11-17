/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg8;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class soal3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner luas = new Scanner(System.in);
        int p, l, t, L, Lp;
        System.out.println("Input Panjang =");
        p = luas.nextInt();
        System.out.println("input lebar = ");
        l = luas.nextInt();
        System.out.println("Input tinggi = ");
        t = luas.nextInt();
        
        L = p * l * t;
        Lp = 2 * (p*l + p*t + l*t);
        
        System.out.println("Luas = "+L);
        System.out.println("Luas Permukaan = "+Lp);
    }
}
