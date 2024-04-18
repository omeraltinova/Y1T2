package Vize.Lab4KalanOrnekler.UcakYonetim;

public class Main {
    public static void main(String[] args) {
        BusinessYolcu b1 = new BusinessYolcu("Faruk",5,"THY");
        Yolcu y1 = new Yolcu(150,"Faruk");

        b1.bilgiGoster();
        b1.bilgiGoster("İyi uçuşlar!");
        y1.bilgiGoster();
    }
}
