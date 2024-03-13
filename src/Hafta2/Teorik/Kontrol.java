package Hafta2.Teorik;

public class Kontrol {

    public void Bosluk(String a){
        if(a.contains(" ")){
            System.out.println("Bu cumlede bosluk var!");
        }
    }
    public void StringKontrol(String a,String b){
        if(a.contains(b)){
            System.out.printf(b +" cumlesi " + a + "icinde var");
        }

    }
}
