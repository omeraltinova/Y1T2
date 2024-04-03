package Hafta6.Laboratuvar.Personel;

public class isci extends Personel{
    private int ucret;

    public isci(String ad,int yas,int ucret){
        super(ad, yas);
        this.ucret=ucret;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
    public void bilgiGoster(String mesaj){
        System.out.println("------------");
        System.out.println("İsim: "+ getAd());
        System.out.println("Yas: "+ getYas());
        System.out.println("Ücret " + getUcret());
        System.out.println("Mesaj: " + mesaj);
        System.out.println("------------");
    }
    @Override
    public void bilgiGoster() {
        System.out.println("------------");
        System.out.println("İsim: "+ getAd());
        System.out.println("Yas: "+ getYas());
        System.out.println("Ücret " + getUcret());
        System.out.println("------------");
    }
}
