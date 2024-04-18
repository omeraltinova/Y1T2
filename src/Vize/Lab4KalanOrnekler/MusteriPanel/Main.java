package Vize.Lab4KalanOrnekler.MusteriPanel;
/*
   İsim ve e-mail değişkenleri olan bir müşteri sınıfı oluşturun. Sınıfa ait olan MailGonder
    fonksiyonu ile alıcı ve e-posta bilgilerini ve Main sınıfından gelen mesajı ekrana yazdırsın. Main
    sınıfında alıcı ve mail bilgisi kullanıcıdan alınsın ve müşteri sınıfına iletilsin. MailGonder
    fonksiyonu ile de “Siparişiniz Oluşturuldu” mesajı gönderilsin.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Musteri m1 = new Musteri();
        System.out.println("Merhaba lütfen müşteri ismini girin!");
        String isim = giris.nextLine();
        m1.setIsim(isim);
        System.out.println("Müşteri mail girin!");
        String mail = giris.nextLine();
        m1.setMail(mail);
        System.out.println("Mesaj girin!");
        String mesaj = giris.nextLine();
        m1.mailGonder(mesaj);
    }
}
