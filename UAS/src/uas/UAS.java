/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas;

import java.util.*;

/**
 *
 * @author Nrhys
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    // array input, angka acak terus outputnya setelah jadi, dan median
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int n, i = 0;
        System.out.println("Inputkan berapa panjang data array = ");
        n = input.nextInt();
        int[] data = new int[n];

        inputdata(data, n);

        Arrays.sort(data);
        //urutkandata(data, n);

        System.out.print("Data array Setelah diurutkan ascending adalah = ");
        while (i < n - 1) {
            System.out.print(data[i] + " , ");
            i++;
        }
        
        
        System.out.println(data[n - 1]);

        System.out.println("Median dari Data Array Setelah diurutkan ascending adalah " + setmedian(data, n));
        
        //Arrays.sort(data, Collections.reverseOrder());        
        //System.out.println("Data array Setelah diurutkan descending adalah = ");
    }

    public static void inputdata(int[] data, int n) {
        int i = 0;
        while (i < n) {
            System.out.println("inputkan data array ke-" + (i + 1));
            data[i] = input.nextInt();
            i++;
        }
    }

    //public static void urutkandata(int[] data, int n) {
//        int i = 0, j, temp = 0;
//        while (i < n) {
//            j = i+1;
//            while (j < n) {
//                if (data[j] < data[i]) {
//                    temp = data[j];
//                    data[j] = data[i];
//                    data[i] = temp;
//                } else {
//
//                }
//                j++;
//            }
//
//            i++;
//        }
    //i = 0;
    // }
    public static double setmedian(int[] data, int n) {
        int i = 0, hasil;
        if (n % 2 == 0) {
            n = n / 2;
            hasil = (data[n - 1] + data[n]) / 2;
        } else {
            n = n / 2;
            hasil = data[n];
        }
        return hasil;
    }

}
