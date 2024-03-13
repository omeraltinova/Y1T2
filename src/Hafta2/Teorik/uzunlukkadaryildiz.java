package Hafta2.Teorik;

import java.util.Scanner;

public class uzunlukkadaryildiz {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);

        System.out.println("Bir cumle giriniz");
        String cumle = giris.nextLine();


        /* for(int i=0;i<cumle.length();i++){
            System.out.print(" * ");
        } */

        System.out.print(" * ".repeat(cumle.length()));

    }
}
