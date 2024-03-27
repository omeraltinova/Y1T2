package Hafta5.Laboratuvar.KahveMakinesi;

import java.util.Scanner;

public class Tezgah {
    public static void main(String[] args) {
        Makine m1 = new Makine(220);
        m1.espresso();
        m1.temizle();
        m1.americano();
        m1.temizle();
        m1.latte();
        m1.suEkle(100);
        m1.latte();

    }
}
