package Hafta4.Laboratuvar;

public class NotHesapCons {
    int vize,odev;
    int finalnot;

    NotHesapCons(int vize,int odev,int finalnot){
        this.vize=vize;
        this.odev=odev;
        this.finalnot=finalnot;
    }
    public void notHesapla(){
        double not = (this.vize*0.3)+(this.odev*0.3)+(this.finalnot*0.4);
        System.out.println("Not ortalamanız " + not);
        System.out.println("Harf notunuz " + harfHesapla(not));
    }
    public String harfHesapla(double not){
        if(not>90){
            return("AA");
        } else if (not>80) {
            return("BA");
        } else if (not>70) {
            return("BB");
        } else if (not>50) {
            return("CB");
        } else {
            return("FF/Kaldınız");
        }
    }
}
