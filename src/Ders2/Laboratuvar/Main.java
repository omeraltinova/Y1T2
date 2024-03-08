package Ders2.Laboratuvar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);

        int kisakenar,uzunkenar;
        System.out.println("Kisa kenar giriniz:");
        kisakenar= giris.nextInt();
        System.out.println("uzun kenar giriniz:");
        uzunkenar= giris.nextInt();

        for(int i=0;i<kisakenar;i++){
            for(int j=0;j<uzunkenar;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}