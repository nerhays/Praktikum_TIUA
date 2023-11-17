/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.pkg10;

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
        double x1, x2, r1, r2, y1, y2, p, x, y;
        System.out.println("Inputkan bilangan x ke 1 = ");
        x1 = input.nextDouble();
        System.out.println("Inputkan bilangan x ke 2 = ");
        x2 = input.nextDouble();
        System.out.println("Inputkan bilangan y ke 1 = ");
        y1 = input.nextDouble();
        System.out.println("Inputkan bilangan y ke 2 = ");
        y2 = input.nextDouble();
        System.out.println("Inputkan bilangan r ke 1 = ");
        r1 = input.nextDouble();
        System.out.println("Inputkan bilangan r ke 2 = ");
        r2 = input.nextDouble();
        
        x = x1-x2;
        y = y1-y2;
        p = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        if(p > r1 + r2){
            System.out.println("P1");
        }else if(p == r1 + r2){
            System.out.println("P2");
        }else if(p > r1 - r2){
            System.out.println("P3");
        }else if(p == r2 && r1> r2){
            System.out.println("P4");
        }else if(p < r1 + r2){
            System.out.println("P5");
        }else {
            
        }
            
    }
    
}
