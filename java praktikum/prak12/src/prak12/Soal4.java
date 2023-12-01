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
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, i, n;
        
        System.out.println("Inputkan Bilangan Pertama = ");
        a = input.nextInt();
        System.out.println("Inputkan Bilangan Kedua = ");
        b = input.nextInt();
        
        System.out.println("Bilangan Fibonacci nya adalah = ");
        fibo(a, b);
    }
    
    static void fibo(int a, int b){
        int i = 0, c;
        System.out.print(a+ ", ");
        System.out.print(b +", ");
        
        while(i < 9){
            c = a + b;
            System.out.print(c +", ");
            a = b;
            b = c;
            i++;
        }
    }
    
}
