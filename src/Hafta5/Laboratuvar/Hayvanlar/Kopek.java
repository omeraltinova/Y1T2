package Hafta5.Laboratuvar.Hayvanlar;

public class Kopek extends Havyan{
    String renk;

    Kopek(String isim,String renk){
        this.isim=isim;
        this.renk=renk;
    }

    @Override
    public void sesCikar() {
        System.out.println("Hav hav");
    }
}
