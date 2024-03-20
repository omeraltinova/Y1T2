package Hafta4.Laboratuvar;

public class OgrenciCons {
    String isim;
    int yas;
    int numara;


    OgrenciCons(String isim,int yas){
        this.isim=isim;
        this.yas=yas;
        System.out.println("Merhaba "+this.isim + " Yaşın: " + this.yas);
        System.out.println("-------------------------------------");
    }

    OgrenciCons(String isim,int yas,int numara){
        this.isim=isim;
        this.yas=yas;
        this.numara=numara;
        System.out.println("Merhaba "+this.isim + " Yaşın: " + this.yas);
        System.out.println("Numaran " + this.numara);
        System.out.println("-------------------------------------");
    }

}
