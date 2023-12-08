/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak13;

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
        Scanner input = new Scanner(System.in);
        int n, i = 0, result;
        
        System.out.println("Inputkan Berapa Jumlah data = ");
        n = input.nextInt();
        int [] data = new int[n];
        
        while(i < n){
            System.out.println("inputkan data array ke-"+(i+1));
            data[i] = input.nextInt();
            i++;
        }
        
        result = modus(data, n);
        System.out.println("nilai modus dari "+n+"data array adalah = "+result);
    }
    public static int modus(int data[], int n){
        int i = 0, hasil = 0, m = 0, mtinggi = 0, j = 0;
        
        while(i<n){
            j = i+1;
            while(j<n){
                if(data[j] == data[i]){
                    m++;
                }
                j++;
            }
            if(m >= mtinggi){
                mtinggi = m;
                hasil = data[i];
            }
            m = 0;
            i++;
        }
        return hasil;
        
    }
}
