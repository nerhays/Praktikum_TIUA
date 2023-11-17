/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg9;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner rata = new Scanner(System.in);
        int a, b, c, k, n;
          a = 6;
          b = 9;
          c = 11;
          System.out.println("inputkan rata rata 4 bilangan = ");
          n = rata.nextInt();
          k = 4*n - (a+b+c);
          System.out.println("bilangan k adalah = "+ k);
    }
    
}
