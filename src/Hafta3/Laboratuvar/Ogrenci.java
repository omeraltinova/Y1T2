package Hafta3.Laboratuvar;

public class Ogrenci {
    public static void main(String[] args) {

        Students ogrenci1 = new Students();
        Students ogrenci2 = new Students();
        Students ogrenci3 = new Students();

        ogrenci1.isim="Semih";
        ogrenci1.numara=44;
        ogrenci2.isim="Faruk";
        ogrenci2.numara=34;
        ogrenci3.isim="Ahmed";
        ogrenci3.numara=58;

        System.out.println(ogrenci1.isim + " " + ogrenci1.numara);
        System.out.println(ogrenci2.isim + " " + ogrenci2.numara);
        System.out.println(ogrenci3.isim + " " + ogrenci3.numara);

    }
}
