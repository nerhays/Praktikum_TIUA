/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak13;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {
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
        
        result = maxFreq(data, n);
        System.out.println("Frekuensi yang sama ada "+result);
    }
    public static int maxFreq(int data[], int n){
        int i = 0, hasil = 0, m = 0, j;
        
        while(i<n){
            j = 0;
            while(j<n){
                if(data[j] == data[i]){
                    m++;
                }
                j++;
            }
            if(m >= hasil){
                hasil = m;
            }
            m = 0;
            i++;
        }
        return hasil;
        
    }
    
}
