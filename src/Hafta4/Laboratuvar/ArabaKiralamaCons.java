package Hafta4.Laboratuvar;

public class ArabaKiralamaCons {
    String model,plaka,marka;
    int yil;
    boolean rent;


    ArabaKiralamaCons(String marka,String model,String plaka,int yil,boolean rent){
        this.marka=marka;
        this.model=model;
        this.plaka=plaka;
        this.yil=yil;
        this.rent=rent;
    }
    public void Kirala(){
        if(rent){
            System.out.println("Araç artık kiralanmış değil");
            this.rent=false;
        }
        else{
            System.out.println("Araç artık kiralandı");
            this.rent=true;
        }
    }
    public void bilgiGoster(){
        System.out.println("----------------");
        System.out.println("Araç marka: " + this.marka);
        System.out.println("Araç model: " + this.model);
        System.out.println("üreyim yılı: "+ this.yil);
        System.out.println("Plaka " + this.plaka);
        System.out.println("Kira durumu " + this.rent);
        System.out.println("----------------");
    }
}
