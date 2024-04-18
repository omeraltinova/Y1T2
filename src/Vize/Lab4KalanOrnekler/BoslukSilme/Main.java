package Vize.Lab4KalanOrnekler.BoslukSilme;

public class Main {
    public static void main(String[] args) {
        String st1 ="Merhabalar bu bir test yazısıdır ve amacı boşlukları kaldırmak";
        String st2 = st1.replace(" ","");
        System.out.println(st2);
        if(st1.equals(st2)){
            System.out.println("İfadeler eşit");
        }
        else{
            System.out.println("İfadeler eşit değil");
        }
    }

}
