package Hafta5.Teorik.HesapMakinesi;

public class Main {
    public static void main(String[] args) {
        HesapMakinesi hp1 = new HesapMakinesi();

        System.out.println(hp1.topla(2,4));
        System.out.println(hp1.topla(2,4,7));
        System.out.println(hp1.topla(3.5f,4.5f));
        System.out.println(hp1.topla(3.1f,4.5f,13.5f,1.5f));
    }
}
