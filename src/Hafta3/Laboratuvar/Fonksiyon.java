package Hafta3.Laboratuvar;


public class Fonksiyon {
    public static void main(String[] args) {
        int i,toplam=0,sonuc,sayi=10;
        int toplam2= YerelFonk(sayi);
        FonksiyonMethod f = new FonksiyonMethod();

        for(i=1;i<sayi;i++){
            sonuc = f.main(i);
            System.out.println(i + ". sayi icin deger " + sonuc);
            toplam+=sonuc;
        }
        System.out.println("Toplam "+ toplam);
        System.out.println("2. Toplam "+ toplam2);
    }

    public static int YerelFonk(int x){
        int sonuc=0,toplam=0;
        for(int i=1;i<x;i++){
        sonuc=(x*x)+(7*x)+35;
        System.out.println(sonuc);
        toplam+=sonuc;
        }

        return(toplam);
    }
}
