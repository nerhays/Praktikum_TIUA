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
public class Soal4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jalan = new Scanner(System.in);
        int jam, menit, v, s, t2j, t2m, waktu, m, istirahat;
              s = 100; // km
              v = 50; //km/jam
              istirahat = 45; //menit
              System.out.println("inputkan jam berangkat = ");
              jam = jalan.nextInt();
              System.out.println("inputkan menit berangkat = ");
              menit = jalan.nextInt();
              waktu = s/v;
              m = (menit + istirahat) / 60;
              t2j = jam + waktu + m;
              t2m = (menit + istirahat) % 60;
              System.out.println("waktu datang di tujuan = "+t2j + "." + t2m);
    }
}
