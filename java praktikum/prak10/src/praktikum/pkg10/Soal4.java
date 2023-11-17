/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg10;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal4 {
    public static void main(String[] args) {
        int j, m, S;
        Scanner input = new Scanner(System.in);
        System.out.println("inputkan jam = ");
        j = input.nextInt();
        System.out.println("Inputkan Menit = ");
        m = input.nextInt();
        
        if(j <= 06){
            S = Math.abs((11/2 * m)-(30 * j));
        }else{
            S = 360 - (Math.abs((11/2 * m)-(30 * j)));
        }
        //S = Math.abs((11/2 * m)-(30 * j));
        System.out.println(S + "derajat");
    }
    
}
