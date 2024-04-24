package Hafta7.Soru4;

public class Araba extends Arac{
    String marka;

    Araba(String marka){
        this.marka=marka;
    }
    @Override
    public void Hizlan() {
        System.out.println("Hızlanıyorum");
    }

    @Override
    public void Yavasla() {
        System.out.println("Yavasliyorum");
    }

    @Override
    void Basla() {
        System.out.println("Başlıyorum.");
    }

    @Override
    void Bitir() {
        System.out.println("Bitiriyorum");
    }
}
