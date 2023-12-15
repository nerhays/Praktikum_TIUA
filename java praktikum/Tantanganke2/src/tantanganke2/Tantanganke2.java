/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tantanganke2;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Tantanganke2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] isiVending = new int[4][2];
        setstok(isiVending);
        setHarga(isiVending);
        //x = idbarang();
        rekursif(isiVending);

    }
    static int pendapatan = 0;

    public static void rekursif(int[][] isi) {
        int pil, x, y;
        getBarang();
        System.out.println("Masukan pilihan anda: ");
        pil = input.nextInt();

        switch (pil) {
            case 1:
                pembelian(isi);
                break;
            case 2:
                getstok(isi);                
                break;
            case 3:
                tambahstok(isi);
                break;
            case 4:
                getpendapatan(isi);
                break;
        }
        rekursif(isi);
    }
    
    public static void tambahstok(int[][] isi){
        System.out.println("[0] Teh Pucuk");
        System.out.println("[1]  Fruit Tea");
        System.out.println("[2] Pocari Sweat");
        System.out.println("[3] Le mineral");
        System.out.println("Pilih Barang = ");
        int barang = input.nextInt();
        System.out.println("Berapa Jumlah yang ingin ditambahkan = ");
        int tambah = input.nextInt();
        
        isi[barang][0] += tambah;
        
        //System.out.println();
    }

    public static void setstok(int[][] isi) {
        //int i = 0, y = 5;
        isi[0][0] = 5;
        isi[1][0] = 5;
        isi[2][0] = 4;
        isi[3][0] = 4;
    }
    public static void getstok(int[][] isi) {
        int i = 0;
                while(i < 4){
                    System.out.println("Stok Barang ke-"+i + " = "+isi[i][0]);
                    i++;
                }
    }

    public static void setHarga(int[][] isi) {
        //int i = 0, y = 5;
        isi[0][1] = 5000;
        isi[1][1] = 6000;
        isi[2][1] = 7000;
        isi[3][1] = 8000;
    }

    public static void getBarang() {
        System.out.println("Selamat Datang Di Vending Machine");
        System.out.println("=================");
        System.out.println("Silahkan pilih operasi dibawah = ");
        System.out.println("[1] Pembelian");
        System.out.println("[2] Cek Stok vending Machine");
        System.out.println("[3] Tambah Stok vending Machine");
        System.out.println("[4] Cek Pendapatan");
        //System.out.println("[5] Quit");
        System.out.println("=================");

    }

    public static void pembelian(int[][] isi) {
        int barang;
        System.out.println("=================");
        System.out.println("Silahkan pilih Pesanan = ");
        System.out.println("[0] Teh Pucuk(5000)");
        System.out.println("[1]  Fruit Tea (6000)");
        System.out.println("[2] Pocari Sweat (7000)");
        System.out.println("[3] Le mineral (8000)");
        System.out.println("=================");
        System.out.println("Masukan pilihan anda: ");
        barang = input.nextInt();
        
        if (isi[barang][0] > 0) {
                    System.out.print("Nama Pesanan = ");
                    setbarang(barang);

                    System.out.print("Jumlah yang dibayarkan = ");
                    System.out.println(isi[barang][1]);
                    pendapatan += isi[barang][1];
                    isi[barang][0]--;
                } else {
                    System.out.println("Barang Habis");
                }

        }

    static void setbarang(int barang) {
        if (barang == 0) {
            System.out.println("Teh Pucuk");
        } else if (barang == 1) {
            System.out.println("Fruit Tea");
        } else if (barang == 2) {
            System.out.println("Pocari Sweat");
        } else if (barang == 3) {
            System.out.println("Le Minerale");
        } else {
            System.out.println("Barang Tidak Ada");
        }
    }
    
    public static void getpendapatan(int[][] isi){
        System.out.println("Pendapatan dari Vending Machine Rp. "+pendapatan);
    }
    

}
