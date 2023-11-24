/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tbb, bebek, rtotal, sbh, jbh, b9, b10;
        Scanner input = new Scanner(System.in);
        tbb = 0;
        
        for(int i = 0; i < 8; i++){
            System.out.println("Masukan Berat Bebek ke-" + (i+1));
            bebek = input.nextDouble();
            tbb += bebek;
            
        }
        
        System.out.println("Masukan Rata Rata Total 10 bebek = ");
        rtotal = input.nextDouble();
        
        System.out.println("Masukan Selisih 2 Bebek yang Hilang = ");
        sbh = input.nextDouble();
        
        jbh = 10 * rtotal - tbb;
        b9 = (sbh + jbh)/2;
        b10 = jbh - b9;
        
        System.out.println("Berat Bebek Ke - 9 = "+b9);
        System.out.println("Berat Bebek Ke - 10 = "+b10);
    }
    
}
