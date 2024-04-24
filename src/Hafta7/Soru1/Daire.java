package Hafta7.Soru1;

public class Daire extends Sekil{
    int yaricap;

    Daire(int yaricap){
        this.yaricap=yaricap;
    }

    @Override
    void alan() {
        double alansonuc= Math.PI*Math.pow(yaricap,2);
        System.out.println("Daire alanı "+ alansonuc);
    }

    @Override
    void cevre() {
        double cevre = 2*Math.PI*yaricap;
        System.out.println("Dairenin çevresi "+ cevre);
    }
}
