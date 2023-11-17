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
public class Soal4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kerucut = new Scanner(System.in);
        double t, r, r2, t2, v, lp, la, lt, ls, miring;
        System.out.println("inputkan jari-jari = ");
        r = kerucut.nextDouble();
//        //System.out.println("inputkan jari-jari 2 = ");
//        //r2 = kerucut.nextDouble();
        System.out.println("inputkan berapa cm dipotong = ");
        t = kerucut.nextDouble();
        
        
        t2 = 10 - t;
        r2 = r * t2 / t;
        v = (1.0 / 3) * Math.PI * (Math.pow(r, 2) + Math.pow(r2, 2) + r * r2) * t2;
        //la = 3.14 * r * r;
        //lt = 3.14 * r2 * r2;
        //miring =  (int) Math.sqrt( Math.pow(r,2) + Math.pow(t2,2) );
        //(r*r) + (t*t)
        //ls = 3.14 * miring * (r + r2);
        lp = Math.PI * r * (r + r2) + Math.PI * Math.pow(r, 2);
        
        System.out.println("Volume = " + v);
        System.out.println("Luas Permukaan = " +lp);


    }
}
