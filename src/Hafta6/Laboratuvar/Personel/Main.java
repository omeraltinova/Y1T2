package Hafta6.Laboratuvar.Personel;

public class Main {
    public static void main(String[] args) {
        Mudur m1 = new Mudur("Semih",18,"IT");
        isci i1 = new isci("ahmed",18,5);

        i1.bilgiGoster();
        m1.bilgiGoster();

        i1.bilgiGoster("çalışmıyor kovun");
        m1.bilgiGoster("torpille işe almış");
    }
}
