/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak12;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int[] x = new int[5];
        
        i = 0;
        while(i < 4){
            System.out.println("Inputkan Array X data ke-"+(i+1)+": ");
            x[i] = input.nextInt();
            i++;
        }
        System.out.println("Inputkan Array X data ke-5 : ");
        x[4] = input.nextInt();
        
        tukar(x);
        System.out.println("Setelah ditukar = ");
        print(x);
    }
    
    static void tukar(int[] x){
        int i = 3;
        int newdata = x[4];
        
        while (i >= 0 && x[i] > newdata) {
            x[i + 1] = x[i];
            i--;
        }

        x[i + 1] = newdata;
    }
    
    static void print(int[] x){
        int i = 0;
        
        System.out.print("[");
        while(i<x.length){
            System.out.print(x[i] + ", ");
            i++;
        }
        System.out.print("]");
    }
}
