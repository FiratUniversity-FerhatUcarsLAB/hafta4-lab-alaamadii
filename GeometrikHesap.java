import java.util.Scanner;
/*
 * ad soyadi : ALAA MADI
 * ogrenci no : 240541609
 * tarih : 25/10/2025
 * Aciklama : Geometrik Hesaplayici - Gorev 2
 * This program calculates the area and circumference of a circle and the input form the user
 */
public class GeometrikHesap {
    public static void main(String[] args){
        // create a scanner object
        Scanner myObject = new Scanner(System.in);

        // Sabit tanimlamalari
        final double pi = 3.14159;


        // Degisken tanimlamalari r = yaricap
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.println("Enter the radius of the circle:");
        double r = myObject.nextDouble();

        // Alan ve cevre hesaplamalari
        double alan = pi * Math.pow(r, 2);
        double cevre = 2 * pi * r;

        // the circle Diameter, sphere surface area and sphere volume hesaplamalari
        double diameter = 2 * r;
        double sphereVolume = (4.0 / 3.0) * pi * Math.pow(r, 3);
        double sphereSurfaceArea = 4 * pi * Math.pow(r, 2);

        // formatted output
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani : %.2f cm²%n", alan);
        System.out.printf("Daire Ceveresi : %.2f cm%n", cevre); 
        System.out.printf("Daire Capi : %.2f cm%n", diameter);
        System.out.printf("Kure Hacmi : %.2f cm²%n", sphereVolume);
        System.out.printf("Kure Yuzey Alani : %.2f cm²%n", sphereSurfaceArea);
        

        myObject.close(); // close Scanner

    }
   
}

