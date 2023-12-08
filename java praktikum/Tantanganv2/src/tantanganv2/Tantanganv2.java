/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tantanganv2;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Tantanganv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] loker = new int[10][3];

        setarray(loker);
        setpassword(loker);
        //setloker(loker);

        int pil, i = 0, j = 0, n, pass, barang;
        String keluar;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat Datang Di Smart Locker");
            System.out.println("=================");
            System.out.println("Silahkan pilih operasi dibawah = ");
            System.out.println("[1] Memasukan barang ke locker");
            System.out.println("[2] Ambil barang dari locker");
            System.out.println("[3] lihat status seluruh locker");
            System.out.println("[4] <admin> cek password locker");
            System.out.println("=================");
            System.out.println("Jenis Loker = 0,1,2,3,4,5,6,7,8,9");
            System.out.println("Masukan pilihan anda: ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Masukkan Nomer Loker = ");
                    n = input.nextInt();
                    if (n < 10 && n>= 0) {
                        if (loker[n][0] == 0) {

                            System.out.println("Masukkan Pasword = ");
                            pass = input.nextInt();
                            loker[n][0] = 1;
                            loker[n][1] = pass;
                            System.out.println("Masukkan jumlah Barang = ");
                            barang = input.nextInt();
                            loker[n][2] = barang;
                        } else {
                            System.out.println("Loker Terisi");
                        }
                    } else {
                        System.out.println("Loker Hanya 0-9");
                    }

                    break;
                case 2:
                    System.out.println("Masukkan Nomer Loker = ");
                    n = input.nextInt();
                    if (n < 10 && n>= 0) {
                        if (loker[n][0] == 1) {

                            System.out.println("Masukkan Pasword = ");
                            pass = input.nextInt();
                            if (pass == loker[n][1]) {
                                System.out.println("jumlah barang = " + loker[n][2]);
//                            System.out.println("Apakah ingin logout?(y)/(n)");
//                            keluar = input.next();
                                //if ("y".equals(keluar)) {
                                loker[n][0] = 0;
                                loker[n][1] = 0;
                                loker[n][2] = 0;
                                //} else {

                                //}
                            } else {
                                System.out.println("Password Salah");
                            }
                        } else {
                            //System.out.println("Loker Terisi");
                        }
                    } else {
                        System.out.println("Loker Hanya 0-9");
                    }

                    break;
                case 3:
                    //System.out.println("Masukkan Nomer Loker = ");
                    //n = input.nextInt();
                    i = 0;
                    while (i < 10) {
                        if (loker[i][0] == 0) {
                            System.out.println("loker " + i + " = belum terisi");

                        } else if (loker[i][0] == 1) {
                            System.out.println("loker " + i + " = terisi");
                        } else {

                        }
                        i++;
                    }
                    break;
                case 4:
                    System.out.println("Masukkan Nomer Loker = ");
                    n = input.nextInt();
                    System.out.println("password = " + loker[n][1]);
                    break;

            }
        }

        //pilihan(pil);
    }
//    static void pilihan(int pil){
//        
//    }

    static void setarray(int[][] data) {

        //int[] dimensi1 = new int[10];
        //int[] dimensi2 = new int[10];
        int i = 0;

        while (i < 10) {
            data[i][0] = 0;
            //System.out.println(data[i][j])
            i++;

        }

    }

    public static void setpassword(int[][] data) {
        int i = 0;
        while (i < 10) {
            data[i][1] = 0;

            //System.out.println("pass" + data[i][0]);
            i++;

        }
    }

    public static void setisi(int[][] data) {
        int i = 0;
        while (i < 10) {
            data[i][2] = 0;
            i++;
        }
    }

}
