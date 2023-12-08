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
public class Soal3 {
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
        
        result = (int) median(data, n);
        System.out.println("nilai modus dari "+n+"vdata array adalah = "+result);
    }
    public static float median(int data[], int n){
        float hasil = 0;
        
        if(n % 2 == 0){
           n = n/2;
           hasil = ((data[n-1]) + (data[n])) / 2;
        }else{
            n = (n + 1) / 2;
            hasil = data[n-1];
        }
        return hasil;
        
    }
    
}
