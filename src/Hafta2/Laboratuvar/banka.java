package Hafta2.Laboratuvar;

import java.util.Scanner;

public class banka {
    public static void main(String[] args){
        Scanner giris= new Scanner(System.in);
        int secim=0;
        int bakiye = 2024;
        while (secim!=4){
        System.out.println("Merhaba!\n Lütfen yapmak istediginiz işlemi seçin\n1-Para çekme\n2-Para yatirma\n3-Bakiye sorgulama\n4-Çıkış");
        secim= giris.nextInt();
            switch (secim) {
                case 1 -> {
                    System.out.println("Ne kadar cekmek istiyorsunuz max: " + bakiye);
                    int cekim = giris.nextInt();
                    if (bakiye > cekim) {
                        bakiye -= cekim;
                        System.out.println("Basariyla para cektiniz");
                    } else {
                        System.out.println("Hesabınızda yeterli para yok");
                    }
                }
                case 2 -> {
                    System.out.println("Ne kadar yatirmak istiyorsunuz:");
                    int yatirma = giris.nextInt();
                    bakiye += yatirma;
                    System.out.println("Basariyla para yatirdiniz, Yeni bakiyeniz " + bakiye);
                }
                case 3 -> System.out.println("Hesap bakiyeniz: " + bakiye);
                case 4 -> System.out.println("Çıkış yapılıyor.");
                default -> System.out.println("Yanli secim");
            }
        }
        System.out.println("Çıkış yapildi");
    }

}
