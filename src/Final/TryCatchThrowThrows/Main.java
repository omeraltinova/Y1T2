package Final.TryCatchThrowThrows;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader dosya = new FileReader("dosya.txt");
            BufferedReader bw = new BufferedReader(dosya);
            String satir;
            ArrayList<String> listeler = new ArrayList<>();
            while((satir = bw.readLine())!=null){
                listeler.add(satir);
            }
            System.out.println("Dosya açıldı");
            for(String satir1:listeler){
                System.out.println(satir1);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        try{
            FileWriter dosya = new FileWriter("dosya.txt");
            BufferedWriter bw = new BufferedWriter(dosya);
            bw.write("TEst");
            System.out.println("Dosya açıldı ve içindekiler silindi");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
