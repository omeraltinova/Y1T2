package Hafta4.Laboratuvar;

import java.util.Scanner;

public class ArabaKiralama {


    public static void main(String[] args) {
        ArabaKiralamaCons a1 = new ArabaKiralamaCons("BMW","420i","34AB1234",2023,true);
        ArabaKiralamaCons a2 = new ArabaKiralamaCons("BMW","320i","34BC1234",2022,false);

        Scanner giris = new Scanner(System.in);
        int secim=0;
        while(secim!=3){
            System.out.println("Araç seçimi yapınız");
            System.out.println("    1   ");
            a1.bilgiGoster();
            System.out.println("    2   ");
            a2.bilgiGoster();
            System.out.println("3-Çıkış");
            System.out.println("Seçiniz");
            secim = giris.nextInt();
            switch (secim) {
                case 1 -> a1.Kirala();
                case 2 -> a2.Kirala();
                case 3 -> System.out.println("Çıkış yapılıyor");
                default -> System.out.println("Hatalı giriş");
            }
        }
    }
}
