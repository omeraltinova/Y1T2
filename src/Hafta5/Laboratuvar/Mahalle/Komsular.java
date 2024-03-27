package Hafta5.Laboratuvar.Mahalle;

public class Komsular {
    public static void main(String[] args) {
        Ev komsu = new Ev("semih",35,3,4,12345,45603.3);

        System.out.println("Ev sahibi: " + komsu.evsahibi +
                "\nkapi no:" + komsu.kapino +
                "\nkişi sayisi" + komsu.sayi +
                "\noda" + komsu.odasayi +
                "\nanahtar" + komsu.getAnahtar() +
                "\npara:" +   komsu.getPara());

        komsu.setPara(13.13);
        komsu.setAnahtar(12345);

        System.out.println("------------------------\n" +
                "Ev sahibi: " + komsu.evsahibi +
                "\nkapi no:" + komsu.kapino +
                "\nkişi sayisi" + komsu.sayi +
                "\noda" + komsu.odasayi +
                "\nanahtar" + komsu.getAnahtar() +
                "\npara:" +   komsu.getPara() + "\n---------------");

        komsu.kapiTikla();
        komsu.zilCal();
        komsu.postaKutusu();
        komsu.kasa(12345);
    }

}
