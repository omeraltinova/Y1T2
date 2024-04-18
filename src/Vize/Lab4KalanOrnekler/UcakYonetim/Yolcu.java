package Vize.Lab4KalanOrnekler.UcakYonetim;

public class Yolcu {
    private String ad;
    private int yolcuNo;

    public Yolcu(int yolcuNo, String ad) {
        this.yolcuNo = yolcuNo;
        this.ad = ad;
    }
    public void bilgiGoster(){
        System.out.println("Yolcu adı: "+ ad);
        System.out.println("Yolcu no: "+ yolcuNo);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYolcuNo() {
        return yolcuNo;
    }

    public void setYolcuNo(int yolcuNo) {
        this.yolcuNo = yolcuNo;
    }
}
