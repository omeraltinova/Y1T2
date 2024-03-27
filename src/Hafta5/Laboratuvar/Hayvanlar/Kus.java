package Hafta5.Laboratuvar.Hayvanlar;

public class Kus extends Havyan{
    int kanat;

    Kus(String isim,int kanat){
        this.isim=isim;
        this.kanat=kanat;
    }

    @Override
    public void sesCikar() {
        System.out.println("Cik Cik");
    }
}
