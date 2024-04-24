package Hafta7.Soru2;

public class Arac implements elektronikAksamlar,motorAksamlari{
    @Override
    public void motorAc() {
        System.out.println("Trum Trum Trak!");
    }

    @Override
    public void motorKapa() {
        System.out.println("Bb");
    }

    @Override
    public void radyoAc() {
        System.out.println("Radyo FENOMEN!!");
    }

    @Override
    public void radyoKapat() {
        System.out.println("I'm afraid you lost your signal!");
    }

    @Override
    public void sesAc() {
        System.out.println("Sesi fulledim");
    }

    @Override
    public void sesKapa() {
        System.out.println("Sesi kapadım");
    }

    @Override
    public void silecekAc() {
        System.out.println("Temizliyorum");
    }

    @Override
    public void silecekKapa() {
        System.out.println("Temizlemiyorum");
    }
}
