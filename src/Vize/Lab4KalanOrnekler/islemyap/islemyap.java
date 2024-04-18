package Vize.Lab4KalanOrnekler.islemyap;

public class islemyap {
    int sayi1,sayi2;

    islemyap(int sayi1,int sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;
    }
    public void islemyapma(){
        if(bolunurmu(sayi1)){
            System.out.println(sayi1 + " 5'e bölünür");
        }
        if(bolunurmu(sayi2)){
            System.out.println(sayi1 + " 5'e bölünür");
        }
    }

    public Boolean bolunurmu(int sayi){
        return sayi % 5 == 0;
    }
}
