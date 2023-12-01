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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[20];
        int i = 0;
        
        while(i < data.length){
            System.out.println("inputkan data ke-"+(i+1)+": ");
            data[i] = input.nextInt();
            i++;
        }
        
        System.out.println("Setelah dicari = ");
        hitung(data);
        
    }
    
    static void hitung(int[] data){
        int i = 1, jumlahsekarang = 0, panjangsekarang = 1, panjangterpanjang = 0, indeksterpanjang = 0, indekssekarang = 0, countlarge = 0;
        
        while(i < 20){
            if(data[i] >= data[i-1]){
                jumlahsekarang += data[i-1];
                panjangsekarang += 1;
                
            }else {
                jumlahsekarang += data[i-1];
                if(jumlahsekarang > countlarge){
                    countlarge = jumlahsekarang;
                    panjangterpanjang = panjangsekarang;
                    indeksterpanjang = indekssekarang;
                }else{
                    
                }
                jumlahsekarang = 0;
                panjangsekarang = 1;
                indekssekarang = i;
                
            }
            i++;
        }
        
        i = indeksterpanjang;
        while(i <= indeksterpanjang + panjangterpanjang - 1){
            System.out.print(data[i] + ", ");
            i++;
        }
        System.out.println("(" + countlarge +")");
    }
    
    
    
}
