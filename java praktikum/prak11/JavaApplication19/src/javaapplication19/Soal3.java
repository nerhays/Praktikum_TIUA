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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x[];
        x = new int[20];
        int p = 0,
                ps = 1,
                it = 0,
                is = 0;
        for(int i = 0; i < x.length; i++){
            System.out.println("inputkan data x ke- "+(i+1));
            x[i] = input.nextInt();
            
        }
        for(int i = 1; i < x.length; i++){
            if(x[i]>x[i-1]){
                ps += 1;
            }else {
                if(ps > p){
                p = ps;
                it = is;
                }else {
                }
                ps = 1;
                is = i;
            }
            
        }
        
        System.out.println("");
        
        for(int i = it; i <= it+p-1; i++){
            System.out.print(x[i] + ", ");
        }
        
        System.out.print("(" + p + ")");
        
    }
}
