package Hafta6.Laboratuvar.Personel;

public class Personel {
    private String ad;
    private int yas;
    public Personel(String ad,int yas){
        this.ad=ad;
        this.yas=yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    public void bilgiGoster(){
        System.out.println("------------");
        System.out.println("İsim: "+ getAd());
        System.out.println("Yas: "+ getYas());
        System.out.println("------------");
    }
}
