package Hafta2.Laboratuvar;

import java.util.Scanner;

public class ucgen {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);

        System.out.println("Uzgen kenari giriniz");
        int kenar= giris.nextInt();
        int uzunluk = 1;
        for(int i=0;i<kenar;i++){
            for(int j=0;j<uzunluk;j++){
                System.out.print("*");
            }
            uzunluk+=2;
            System.out.println();
        }
    }
}
