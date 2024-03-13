package Hafta2.Teorik;

import java.util.Scanner;
public class HesapMakinesi {
    Scanner giris= new Scanner(System.in);

    public void toplama(){

        int sayi1,sayi2;
        System.out.println("Toplamak istediginiz 1. sayiyi girin");
        sayi1 = giris.nextInt();
        System.out.println("2. sayiyi giriniz");
        sayi2 = giris.nextInt();
        System.out.println("Toplam: "+(sayi1+sayi2));
    }
    public void cikarma(){

        int sayi1,sayi2;
        System.out.println("Cikarmak istediginiz 1. sayiyi girin");
        sayi1 = giris.nextInt();
        System.out.println("2. sayiyi giriniz");
        sayi2 = giris.nextInt();
        System.out.println("Sonuc: "+(sayi1-sayi2));
    }
}
