package Hafta5.Laboratuvar.KahveMakinesi;

public class Makine {
    private int su;
    private int espresso_su=100;
    private int americano_su=75;
    private int latte_su=120;
    private boolean temizlik=true;

    Makine(int su){
        this.su=su;
    }
    private int suKontrol(int su){
        if(su>this.su){
            return(0);
        }
        else {
            return(1);
        }
    }
    private int temizlikKontrol(){
        if(!this.temizlik){
            return(0);
        }
        else {
            return(1);
        }
    }
    public void espresso(){
        if(temizlikKontrol()==1&&suKontrol(espresso_su)==1){
            System.out.println("Kahve hazırlanıyor...");
            this.temizlik=false;
            this.su-=espresso_su;
        }
    }
    public void americano(){
        if(temizlikKontrol()==1&&suKontrol(americano_su)==1){
            System.out.println("Kahve hazırlanıyor...");
            this.temizlik=false;
            this.su-=americano_su;
        }
        else {
            System.out.println("Eksik su var veya makine kirli!");
        }
    }
    public void latte(){
        if(temizlikKontrol()==1&&suKontrol(latte_su)==1){
            System.out.println("Kahve hazırlanıyor...");
            this.temizlik=false;
            this.su-=latte_su;
        }
        else {
            System.out.println("Eksik su var veya makine kirli!");
        }
    }
    public void temizle(){
        this.temizlik=true;
        System.out.println("Makine temizlendi!");
    }
    public void suEkle(int su){
        this.su+=su;
        System.out.println("Su eklendi!");
    }

    public int getEspresso_su() {
        return espresso_su;
    }

    public void setEspresso_su(int espresso_su) {
        this.espresso_su = espresso_su;
    }

    public int getAmericano_su() {
        return americano_su;
    }

    public void setAmericano_su(int americano_su) {
        this.americano_su = americano_su;
    }

    public int getLatte_su() {
        return latte_su;
    }

    public void setLatte_su(int latte_su) {
        this.latte_su = latte_su;
    }

    public int getSu() {
        return su;
    }

    public void setSu(int su) {
        this.su = su;
    }

    public boolean isTemizlik() {
        return temizlik;
    }

    public void setTemizlik(boolean temizlik) {
        this.temizlik = temizlik;
    }
}
