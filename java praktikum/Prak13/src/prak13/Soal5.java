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
public class Soal5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, i = 0;
        
        System.out.println("Inputkan Berapa Jumlah data = ");
        n = input.nextInt();
        int [] data = new int[n];
        
        while(i < n){
            System.out.println("inputkan data array ke-"+(i+1));
            data[i] = input.nextInt();
            i++;
        }
        
        maxIndex(data, n);
        
    }
    public static void maxIndex(int data[], int n){
        int i = 0, besar = data[0];
        
        while(i < n){
            if(data[i] > besar){
                besar = data[i];
            }
            i++;
        }
        i = 0;
        while(i < n){
            if(data[i] == besar){
                System.out.println(i);
            }
            i++;
        }
        
    }
}
