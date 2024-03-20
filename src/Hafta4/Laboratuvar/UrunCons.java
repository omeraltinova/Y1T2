package Hafta4.Laboratuvar;

public class UrunCons {
    String ad;
    double fiyat;
    int stok;
    int id;

    UrunCons(String ad,double fiyat,int stok,int id){
        this.ad=ad;
        this.fiyat=fiyat;
        this.stok=stok;
        this.id=id;
    }
    public void bilgiGoster(){
        System.out.println("----Ürün bilgileri:----");
        System.out.println("ID: " + this.id);
        System.out.println("Ad: "+this.ad);
        System.out.println("Fiyat: "+this.fiyat+"TL");
        System.out.println("Stok: "+this.stok);
    }
}
