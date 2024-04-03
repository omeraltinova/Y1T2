package Hafta6.Laboratuvar.Personel;

public class Mudur extends Personel{
    private String departman;

    public Mudur(String ad,int yas,String departman){
        super(ad,yas);
        this.departman=departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void bilgiGoster(String mesaj){
        System.out.println("------------");
        System.out.println("İsim: "+ getAd());
        System.out.println("Yas: "+ getYas());
        System.out.println("Departman: " + getDepartman());
        System.out.println("Mesaj: " + mesaj);
        System.out.println("------------");
    }
    @Override
    public void bilgiGoster() {
        System.out.println("------------");
        System.out.println("İsim: "+ getAd());
        System.out.println("Yas: "+ getYas());
        System.out.println("Departman: " + getDepartman());
        System.out.println("------------");
    }

}
