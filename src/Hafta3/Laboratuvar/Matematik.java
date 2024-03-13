package Hafta3.Laboratuvar;

import java.util.Scanner;

public class Matematik {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayi 1 giriniz");
        sayi1 = giris.nextInt();
        System.out.println("Sayi 2 giriniz");
        sayi2= giris.nextInt();
        System.out.println("Büyük sayi "+ Math.max(sayi1,sayi2));
        System.out.println("2. sayinin karekoku "+ Math.sqrt(sayi2));
        System.out.println("sayi1 üssü sayi2 sonucu "+ Math.pow(sayi1,sayi2));
    }


}
