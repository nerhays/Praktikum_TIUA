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
public class Soal3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = scanner.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = scanner.nextDouble();

        
        double delta = b * b - 4 * a * c;
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);            
            double y1 = a * x1 * x1 + b * x1 + c;
            double y2 = a * x2 * x2 + b * x2 + c;
            System.out.println("Kedua grafik memotong di dua titik berbeda: (" + x1 + ", " + y1 + ") dan (" + x2 + ", " + y2 + ")");
        }
        
        else if (delta == 0) {
            double x = -b / (2 * a);
            double y = a * x * x + b * x + c;
            System.out.println("Kedua grafik bersinggungan di titik (" + x + ", " + y + ")");
        }        
        else {
            System.out.println("Kedua grafik saling lepas dan tidak memiliki titik potong.");
        }
        
        double xIntersection = (e - c) / (b - d);
        double yIntersection = a * xIntersection * xIntersection + b * xIntersection + c;
        System.out.println("Koordinat titik potong dengan garis: (" + xIntersection + ", " + yIntersection + ")");
    }
}


