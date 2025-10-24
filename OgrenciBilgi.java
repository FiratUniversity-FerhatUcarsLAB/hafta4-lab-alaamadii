/*
 * Ad Soyad: [ALAA MADI]
 * Ogrenci No: [240541609]
 * Tarih: [24.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
         Scanner myObject = new Scanner(System.in);
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.println("Enter your first name: ");
        String adi = myObject.nextLine();
        
        
        // Soyad
        System.out.println("Enter your second name: ");
        String soyadi = myObject.nextLine();
        
        // Ogrenci No
        System.out.println("Enter your student number:");
        int studentNumber = myObject.nextInt();
        
        // Yas
        System.out.println("Enter your age:");
        int age = myObject.nextInt();

        
        // GPA
        System.out.println("Enter your GPA (0.00 to 4.00):");
        double gpa = myObject.nextDouble();

    
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", adi, soyadi);
        System.out.printf("OGRENCI NO: %d%n", studentNumber);
        System.out.printf("YAS: %d%n", age);
        System.out.printf("GPA: %.2f%n", gpa);

        
        //the gpa here can be done with boolean
        if (gpa >= 2.00){
             System.out.println("Durum: Basarili");
        } else { 
            System.out.println("Durum: Basarisiz");
       
        }
        
        // Scanner'i kapatin (önemli pratik)
        myObject.close(); 
    }
}
