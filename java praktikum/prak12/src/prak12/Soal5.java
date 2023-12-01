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
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] y = new boolean[1000]; 
        int bil, i = 1;
        
        System.out.println("Inputkan Bilangan Positif = ");
        bil = input.nextInt();
        
        while(i <= 999){
            y[i] = false;
            i++;
        }
        benarsalah(y, bil);
        
        print(y, bil);
        
    }
    static void benarsalah(boolean[] y, int bil){
        int j = 0, x = 1;
        while(j <= bil){
            j += x;
            x++;
            y[j] = true;
        }
        
    }
    
    static void print(boolean[] y, int bil){
        int i =1;
        while(i <= bil){
            if(y[i]){
                System.out.println("Angka " + i + " Merupakan Angka Segitiga");
            }else{
                System.out.println("Angka " + i + " Bukan merupakan Angka Segitiga");
            }
            i++;
        }
        
    }
    
}
