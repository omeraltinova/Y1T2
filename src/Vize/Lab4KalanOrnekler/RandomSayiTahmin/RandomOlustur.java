package Vize.Lab4KalanOrnekler.RandomSayiTahmin;

import java.util.Random;

public class RandomOlustur {
    Random sayi = new Random();
    int r1 = sayi.nextInt(1000);

    public int RandomSayi(){
        return(r1);
    }
}
