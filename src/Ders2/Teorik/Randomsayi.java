package Ders2.Teorik;

import java.util.Scanner;

public class Randomsayi {

    public static void main(String[] args){
        int sayi = (int)(Math.random() * 10);
        int tahmin=0;
        int yanit;
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayi tahmin et!");
        do {
            yanit = giris.nextInt();

            if(yanit==sayi){
                System.out.println("Dogru yanit verdin!");
                System.out.println(tahmin+1 + " tahminde bildin!");
            }
            else if(yanit>sayi){
                System.out.println("Daha kucuk bir sey gir");
                tahmin++;
            }
            else {
                System.out.println("Daha buyuk bir sey gir");
                tahmin++;
            }
        }
        while(yanit!=sayi);

    }
}
