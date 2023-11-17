/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg9;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner JB = new Scanner(System.in);
        double hb, ongkir, hj, pk, hk, untung;
            System.out.println("inputkan harga beli = ");
            hb = JB.nextDouble();
            System.out.println("inputkan persentase ongkir (hanya angka tidak perlu persennya) = ");
            ongkir = JB.nextDouble();
            System.out.println("inputkan keuntungan = ");
            untung = JB.nextDouble();
            
            ongkir = hb * ongkir / 100;
            hj = hb + untung + ongkir;
            hk = hj - hb;
            pk = hk / hb;
            System.out.println("Persentase Kenaikan adalah "+pk);
    }
}
