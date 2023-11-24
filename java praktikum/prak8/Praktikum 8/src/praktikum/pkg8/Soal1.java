/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.pkg8;

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
        Scanner suhu = new Scanner(System.in);
        double r, f, c;
        String j;
        System.out.println("Jenis Jenis Suhu = ");
        System.out.println("c = celcius");
        System.out.println("r = reamur");
        System.out.println("f = fahrenheit");
        System.out.println("=================");
        System.out.println("Masukan Jenis Suhu Awal = ");
        j = suhu.next();

        if ("c".equals(j)) {
            System.out.println("inputkan berapa derajat celcius : ");
            c = suhu.nextDouble();
            r = 4 * c / 5;
            f = (9 * c / 5) + 32;
            System.out.println("Celcius = " + c);
            System.out.println("Reamur = " + r);
            System.out.println("Fahrenheit = " + f);
        } else if ("r".equals(j)) {
            System.out.println("inputkan berapa derajat reamur : ");
            r = suhu.nextDouble();
            c = 5 * r / 4;
            f = (9 * r / 4) + 32;
            System.out.println("Celcius = " + c);
            System.out.println("Reamur = " + r);
            System.out.println("Fahrenheit = " + f);
        } else if ("f".equals(j)) {
            System.out.println("inputkan berapa derajat fahrenheit : ");
            f = suhu.nextDouble();
            r = 4 * (f - 32) / 9;
            c = 5 * (f - 32) / 9;
            System.out.println("Celcius = " + c);
            System.out.println("Reamur = " + r);
            System.out.println("Fahrenheit = " + f);
        } else {
            System.out.println("tidak ada suhu");
        }

    }
    }
    

