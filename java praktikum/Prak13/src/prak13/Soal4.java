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
public class Soal4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, i = 0, r, d;
        
        System.out.println("Berapa Pergeseran = ");
        r = input.nextInt();
        System.out.println("Kanan (1) atau Kiri (-1) = ");
        d = input.nextInt();
        System.out.println("Inputkan Berapa Jumlah data = ");
        n = input.nextInt();
        int [] data = new int[n];
        
        while(i < n){
            System.out.println("inputkan data array ke-"+(i+1));
            data[i] = input.nextInt();
            i++;
        }
        
        rotate(data, n, r, d);
    }
    public static void rotate(int data[], int n, int r, int d){
        int i = 0;
        
        if(d > 0){
            i = n-r;
            while(i < n){
                System.out.print(data[i]);
                i++;
            }
            i = 0;
            while(i < n - r){
                System.out.print(data[i]);
                i++;
            }
        }else{
            i = r;
            while(i < n){
                System.out.print(data[i]);
                i++;
            }
            i = 0;
            while(i < r){
                System.out.print(data[i]);
                i++;
            }
            
        }
        
    }
}
