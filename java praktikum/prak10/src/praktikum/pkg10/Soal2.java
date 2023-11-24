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
public class Soal2 {
    public static void main(String[] args) {
        int jarak, waktu, tarif; 
        String cuaca;
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Jarak Tempuh (dalam km) = ");
        jarak = input.nextInt();
        System.out.println("Inputkan Waktu Tempuh = ");
        waktu = input.nextInt();
        System.out.println("Inputkan Cuaca = ");
        cuaca = input.next();
          
        
        tarif = 10000;
        
        if(jarak > 3){
            tarif = tarif + ((jarak - 3) * 2000);
        }else{
            
        }
        
        if(waktu > 2 * jarak){
            tarif = tarif + ((waktu - (2* jarak)) * 1000);
        }else{
            
        }
        
        if("hujan".equals(cuaca)){
            tarif = tarif * 115 / 100;
        }else{
            
        }
        System.out.println("Tarif = " + tarif);
    }
}
