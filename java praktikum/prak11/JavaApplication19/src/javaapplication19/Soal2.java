/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {
    public static void main(String[] args) {
        double bb; 
        int k = 0
                , l= 0
                , s = 0
                , g = 0
                , o = 0;
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            System.out.println("Inputkan Berat Bebek ke-"+(i+1));
            bb = input.nextDouble();
            
            if(bb > 2){
                System.out.println("Bebek ke-"+(i+1)+" Obesitas");
                o += 1;
            }else if(bb >= 1.5){
                System.out.println("Bebek ke-"+(i+1)+" Gemuk");
                g += 1;
            }else if(bb >= 1){
                System.out.println("Bebek ke-"+(i+1)+" Standard");
                s += 1;
            }else if(bb >= 0.2){
                System.out.println("Bebek ke-"+(i+1)+" Langsing");
                l += 1;
            }else {
                System.out.println("Bebek ke-"+(i+1)+" Kurus");
                k += 1;
            }
            
            
        }
        
        System.out.println("Bebek Kurus ada " +k + " ekor");
        System.out.println("Bebek Langsing ada "+l + " ekor");
        System.out.println("Bebek Standard ada "+s + " ekor");
        System.out.println("Bebek Gemuk ada "+g + " ekor");
        System.out.println("Bebek Obesistas ada "+o + " ekor");
    }
}
