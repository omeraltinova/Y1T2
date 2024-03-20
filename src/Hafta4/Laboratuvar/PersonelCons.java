package Hafta4.Laboratuvar;

public class PersonelCons {
    String isim,departman;
    double maas;


    PersonelCons(String isim,String departman,double maas){
        this.isim=isim;
        this.departman=departman;
        this.maas=maas;
    }
    public void departmanDegistir(String departman){
        System.out.println( this.isim + " adlı çalışanın " + this.departman + " olan departmanı " + departman + " olarak değiştirildi\n");
        this.departman=departman;
    }
    public void maasDegistir(double maas){
        System.out.println( this.isim + " adlı çalışanın " + this.maas + "TL olan maaşı " + maas + "TL olarak değiştirildi\n");
        this.maas=maas;
    }
    public String bilgiGoster(){
        return("-------------------\nÇalışan ismi: " + this.isim + " \nÇalışan departman: " + this.departman + " \nÇalışan maaşı: " + this.maas + "TL\n-------------------");
    }
}
