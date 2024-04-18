package Vize.Lab4KalanOrnekler.UcakYonetim;

public class BusinessYolcu extends Yolcu{
    private String firma;

    BusinessYolcu(String ad,int yolcuNo,String firma){
        super(yolcuNo,ad);
        this.firma=firma;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Yolcu adı: "+ getAd());
        System.out.println("Yolcu no: "+ getYolcuNo());
        System.out.println("Firma: "+ firma);
    }
    public void bilgiGoster(String mesaj){
        System.out.println("Yolcu adı: "+ getAd());
        System.out.println("Yolcu no: "+ getYolcuNo());
        System.out.println("Firma: "+ firma);
        System.out.println("Mesaj:\n" + mesaj);
    }

}
