package Hafta7.Soru1;

public class Kare extends Sekil{
    int kenar1;

    Kare(int kenar1){
        this.kenar1=kenar1;
    }

    @Override
    void alan() {
        double alansonuc = kenar1*kenar1;
        System.out.println("Kare alanı: "+ alansonuc);
    }

    @Override
    void cevre() {
        double cevre = kenar1*4;
        System.out.println("Karenin cevresi: " + cevre);
    }
}
