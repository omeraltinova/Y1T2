package Hafta2.Teorik;

import java.util.Scanner;

public class Kontrol2 {
    public static void main(String[] args) {

        int secim;
        Scanner giris = new Scanner(System.in);
        Kontrol Control = new Kontrol();
        System.out.println("Hangi islem\n1-Bosluk bulM\n2-Arama");
        secim = giris.nextInt();
        if(secim==1){
            System.out.println("Cumleyi giriniz ");
            String st1= giris.nextLine();
            Control.Bosluk(st1);
        }
        else{
            System.out.println("Cumleyi gir");
            String st1=giris.nextLine();
            System.out.println("Aranacak seyi gir");
            String st2=giris.nextLine();
            Control.StringKontrol(st1,st2);
        }
    }
}
