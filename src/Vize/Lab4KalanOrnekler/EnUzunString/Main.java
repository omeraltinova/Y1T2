package Vize.Lab4KalanOrnekler.EnUzunString;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String metin1 = "Merhaba dünya, nasılsınız?";
        String metin2 = "Merhaba Dünya";
        metin1 = metin1.trim();

        if (metin1.substring(0, 13).equals(metin2)) {
            System.out.println("Metinlerin ilk 13 karakteri eşit.");
        } else {
            System.out.println("Metinlerin ilk 13 karakteri eşit değil.");
        }
// Metinlerin bir kısmını equalsIgnoreCase() fonksiyonu
        if (metin1.substring(0, 13).equalsIgnoreCase(metin2)) {
            System.out.println("Metinlerin ilk 13 karakteri büyük/küçük harf ayrımı gözetmeksizin eşit.");
        } else {
            System.out.println("Metinlerin ilk 13 karakteri büyük/küçük harf ayrımı gözetmeksizin eşit değil");
        }
    }
}
