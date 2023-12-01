/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak12;

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
        int i = 0, j = 0;
        int[] x = new int[5];
        int[] y = new int[5];
        int[] z = new int[10];
        
        while(i < 5){
            System.out.println("Inputkan Array X data ke-"+(i+1));
            x[i] = input.nextInt();
            i++;
        }
        i = 0;
        while(i < 5){
            System.out.println("Inputkan Array Y data ke-"+(i+1) +" : ");
            y[i] = input.nextInt();
            i++;
        }
        
        i = 0;
        while(i < 5){
            z[i] = x[i];
            i++;
        }
        
        while(i < 10){
            z[i] = y[j];
            i++;
            j++;
        }
        
        menukar(z);
        
        System.out.println("Setelah ditukar = ");
        print(z);
        
    }
    
    static void menukar(int[] z){
        int i = 0;
        int j = 0;
        int temp;
        
        while(i < 10){
            j = 0;
            while(j < 9){
                if(z[j] > z[j+1]){
                    temp = z[j];
                    z[j] = z[j+1];
                    z[j+1] = temp;
                }
                j++;
            }
            i++;
        }
        
    }
    
    static void print(int[] z){
        int i = 0;
        
        System.out.print("[");
        while(i<10){
            System.out.print(z[i] + ", ");
            i++;
        }
        System.out.println("]");
    }
    
}
