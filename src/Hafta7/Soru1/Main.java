package Hafta7.Soru1;

public class Main {
    public static void main(String[] args) {

        Kare k1 = new Kare(5);
        Dikdortgen dk1 = new Dikdortgen(3,4);
        Daire d1 =  new Daire(2);

        k1.alan();
        dk1.alan();
        d1.alan();
        System.out.println("----------------");
        k1.cevre();
        dk1.cevre();
        d1.cevre();
    }
}
