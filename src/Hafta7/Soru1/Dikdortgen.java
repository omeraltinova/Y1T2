package Hafta7.Soru1;

public class Dikdortgen extends Sekil{
    int kenar1,kenar2;

    Dikdortgen(int kenar1,int kenar2){
        this.kenar1=kenar1;
        this.kenar2=kenar2;
    }

    @Override
    void alan() {
        double alansonuc=kenar1*kenar2;
        System.out.println("Dikdortgen alanı: "+ alansonuc);
    }

    @Override
    void cevre() {
        double cevre=(kenar1*2)+(kenar2*2);
        System.out.println("Dikdortgen cevresi "+ cevre);
    }
}
