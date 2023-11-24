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
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data[], tanggal, tahun, temp = 0, j;
        data = new int[8];
        String bulan;
        
        System.out.println("Inputkan Tanggal = ");
        tanggal = input.nextInt();
        
        if(tanggal <= 31){
            data[0] = tanggal/10;
            data[1] = tanggal%10;
        }else{
            System.out.println("di kalender Hanya ada 31 hari");
            return;
        }
        
        System.out.println("Inputkan Bulan = ");
        bulan = input.next();
        
        switch (bulan) {
            case "Januari" -> {
                data[2] = 0;
                data[3] = 1;
            }
            case "Februari" -> {
                data[2] = 0;
                data[3] = 2;
            }
            case "Maret" -> {
                data[2] = 0;
                data[3] = 3;
            }
            case "April" -> {
                data[2] = 0;
                data[3] = 4;
            }
            case "Mei" -> {
                data[2] = 0;
                data[3] = 5;
            }
            case "Juni" -> {
                data[2] = 0;
                data[3] = 6;
            }
            case "Juli" -> {
                data[2] = 0;
                data[3] = 7;
            }
            case "Agustus" -> {
                data[2] = 0;
                data[3] = 8;
            }
            case "September" -> {
                data[2] = 0;
                data[3] = 9;
            }
            case "Oktober" -> {
                data[2] = 1;
                data[3] = 0;
            }
            case "November" -> {
                data[2] = 1;
                data[3] = 1;
            }
            case "Desember" -> {
                data[2] = 1;
                data[3] = 2;
            }
            default -> {
            }
        }
        
        System.out.println("Inputkan Tahun = ");
        tahun = input.nextInt();
        
        for(int i = 7; i > 3; i--){
            data[i] = tahun % 10;
            tahun /= 10;
        }
        
        j = 7;
        for(int i = 0; i < 8; i++){
            if(data[i] != data[j]){
                temp += 1;
            }
            j -= 1;
        }
        
        if(temp == 0 ){
            System.out.println("Palindrome"); 
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
