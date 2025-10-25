/*
 * Ad Soyad: [ALAA MADI]
 * Ogrenci No: [240541609]
 * Tarih: [25.10.2025]
 * Aciklama:Gorev 3 Mass Hesap 
 * 
 * Bu program kullanicidan adı ve soyadı Aylık brüt maaş Haftalık çalışma saati Mesai saati sayısı  ve kullanici icin 
 *Toplam Gelir Kesintiler Net Maaş hesaplaniyor 
 */
import java.util.Scanner;
import java.time.LocalDate;

public class MaasHesap {
    public static void main(String[] args){
        // create a scanner object
        Scanner myObject = new Scanner(System.in);

        // Sabitlar 
        final double SGK_RATE = 0.14; // %14
        final double INCOME_TAX_RATE = 0.15; // %15
        final double STAMP_TAX_RATE = 0.00759; // %0.759 
        final double OVERTIME_MULTIPLIER = 1.5; 
        final int STANDARD_MONTHLY_HOURS = 160; 
         
        // Kullanıcıdan giriş a
        // String adi , soyadi
        //Haftalik calisma saati(int)
        //Aylik burt mass (double))
        //Mesai saati sayisi (int)
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

        System.out.print("Calisan adi soyadi: ");
        String name = myObject.nextLine();

        System.out.print("Brut maas (TL): ");
        double aylikBrutMaas = myObject.nextDouble();

        System.out.print("Haftalik calisma saati (saat): ");
        int haftalikCalismaSaati = myObject.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaatiSayisi = myObject.nextInt();
        
        // Hesaplamalar 
        double saatlikucret = aylikBrutMaas / STANDARD_MONTHLY_HOURS;
        double mesaiUcreti = saatlikucret * mesaiSaatiSayisi * OVERTIME_MULTIPLIER;
        
        double toplamGelir = aylikBrutMaas + mesaiUcreti;

        // Kesintiler 
        double sgkKesintisi = toplamGelir * SGK_RATE;
        double gelirVergisi = toplamGelir * INCOME_TAX_RATE;
        double damgaVergisi = toplamGelir * STAMP_TAX_RATE;
        
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / STANDARD_MONTHLY_HOURS;
        double gunlukNetKazanc = netMaas / 22.0;

        // Tarih
        LocalDate tarih = LocalDate.now();

        // Çıktı
        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s\n", name);
        System.out.printf("Tarih  : %s\n\n", tarih);

        System.out.println("GELIRLER:");
        System.out.printf("  Brut Maas              : %10.2f TL\n", aylikBrutMaas);
        System.out.printf("  Mesai Ucreti (%d saat) : %10.2f TL\n", mesaiSaatiSayisi, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %10.2f TL\n\n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %10.2f TL\n", SGK_RATE * 100, sgkKesintisi);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %10.2f TL\n", INCOME_TAX_RATE * 100, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.1f%%)  : %10.2f TL\n", STAMP_TAX_RATE * 100, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %10.2f TL\n\n", toplamKesinti);

        System.out.printf("NET MAAS                 : %10.2f TL\n\n", netMaas);

        System.out.println("ISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %4.1f%%\n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %10.2f TL/saat\n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc      : %10.2f TL/gun\n", gunlukNetKazanc);
        System.out.println("====================================");

        myObject.close(); // close Scanner
    }
}
