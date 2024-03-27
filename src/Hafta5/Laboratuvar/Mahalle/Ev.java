package Hafta5.Laboratuvar.Mahalle;

public class Ev {
    public String evsahibi;
    public int kapino;
    public int sayi; // kişi sayisi
    public int odasayi;
    private int anahtar;
    private double para;

    public Ev(String evsahibi,int kapino,int sayi,int odasayi,int anahtar,double para){
        this.evsahibi=evsahibi;
        this.kapino=kapino;
        this.sayi=sayi;
        this.odasayi=odasayi;
        this.anahtar=anahtar;
        this.para=para;
    }
    public void setPara(double para){
        this.para=para;
    }
    public void setAnahtar(int anahtar){
        this.anahtar=anahtar;
    }
    public double getPara(){
        return(para);
    }
    public int getAnahtar(){
        return(anahtar);
    }

    public void zilCal(){
        System.out.println("Zil çalındı");
    }
    public void kapiTikla(){
        System.out.println("Kapıya tıklandı");
    }
    public void postaKutusu(){
        System.out.println("Posta no:340" + kapino);
    }
    public void kasa(int anahtar){
        if(this.anahtar==anahtar){
            System.out.println("Kasa açıldı içi boş!\n Şaka içinde:  " + para + "TL var.");
        }
    }


}
