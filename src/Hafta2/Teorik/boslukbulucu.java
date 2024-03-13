package Hafta2.Teorik;

import java.util.Scanner;

public class boslukbulucu {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = giris.nextLine();
        String degistir = cumle.replace(" ","_");
        System.out.println(degistir);

    }

}
