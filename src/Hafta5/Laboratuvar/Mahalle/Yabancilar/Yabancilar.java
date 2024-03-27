package Hafta5.Laboratuvar.Mahalle.Yabancilar;

import Hafta5.Laboratuvar.Mahalle.Ev;

public class Yabancilar {
    public static void main(String[] args) {
        Ev p1 = new Ev("ahmed",34,2,3,12345,35603.3);

        System.out.println("Ev sahibi: " + p1.evsahibi +
                "\nkapi no:" + p1.kapino +
                "\nkişi sayisi" + p1.sayi +
                "\noda" + p1.odasayi +
                "\nanahtar" + p1.getAnahtar() +
                "\npara:" +   p1.getPara());

        p1.setPara(13.13);
        p1.setAnahtar(12345);

        System.out.println("------------------------\n" +
                "Ev sahibi: " + p1.evsahibi +
                "\nkapi no:" + p1.kapino +
                "\nkişi sayisi" + p1.sayi +
                "\noda" + p1.odasayi +
                "\nanahtar" + p1.getAnahtar() +
                "\npara:" +   p1.getPara() + "\n---------------");

        p1.kapiTikla();
        p1.zilCal();
        p1.postaKutusu();
        p1.kasa(12345);
    }

}
