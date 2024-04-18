package Vize.Lab4KalanOrnekler.RandomSayiTahmin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        RandomOlustur n1 = new RandomOlustur();
        int dogrutahmin = n1.RandomSayi();
        int tahmin;
        int hak = 5;
        System.out.println("Merhaba sayı tahmin oyununa hoşgeldin! hadi tahmin et! 5 Hakkın var!");
        System.out.println(dogrutahmin); // Test
        while(hak!=0){
            System.out.println("Tahmin et!");
            tahmin = giris.nextInt();
            if(tahmin==dogrutahmin){
                System.out.println("Doğru tahmin!");
                break;
            }
            else{
                System.out.println("Yanlış tahmin! Bida dene!");
                hak--;
            }
        }
        if(hak==0){
            System.out.println("Tahmin hakkın kalmadı :( Doğru sayı: "+ dogrutahmin);
        }
    }
}
