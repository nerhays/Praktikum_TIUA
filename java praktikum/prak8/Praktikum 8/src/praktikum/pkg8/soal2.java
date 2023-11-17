/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg8;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class soal2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bil = new Scanner(System.in);
        int x, a, result;
        System.out.println("masukan bilangan = ");
        x = bil.nextInt();
        a = 1;
        result = 0;
        for(int i = 0; i <= 4; i++){
            result= ((x/a)%10) + result;
            a = a * 10;
        }
        System.out.print("hasil penjumlahan = "+result);
        
    }
}
