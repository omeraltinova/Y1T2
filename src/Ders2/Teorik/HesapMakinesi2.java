package Ders2.Teorik;

import java.util.Scanner;

public class HesapMakinesi2 {


    public static void main(String[] args) {
        HesapMakinesi calculator = new HesapMakinesi();
        Scanner giris= new Scanner(System.in);
        System.out.println("Hangi islemi yapmak istiyorsunuz\n1-Toplama\n2-Çıkarma");
        int tercih = giris.nextInt();
        if(tercih==1){
            calculator.toplama();
        }
        else
            calculator.cikarma();
    }
}
