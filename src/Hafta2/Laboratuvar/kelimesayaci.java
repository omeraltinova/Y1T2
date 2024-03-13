package Hafta2.Laboratuvar;

import java.util.Scanner;

public class kelimesayaci {
    public static void main(String[] args){
        String cumle;
        int kelimeSayisi=1;
        Scanner giris= new Scanner(System.in);
        System.out.println("Bir cumle giriniz:");
        cumle= giris.nextLine();
        for(int i=0;i<cumle.length();i++){
            if(cumle.charAt(i)==' '){
                kelimeSayisi++;
            }
        }
        System.out.println("Kelime sayisi: "+(kelimeSayisi));
    }
}
