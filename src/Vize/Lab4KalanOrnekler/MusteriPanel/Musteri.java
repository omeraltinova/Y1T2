package Vize.Lab4KalanOrnekler.MusteriPanel;

public class Musteri {
    private String isim;
    private String mail;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public void mailGonder(String mesaj){
        System.out.println("Mail gonderildi!: ");
        System.out.println(mesaj);
    }
}
