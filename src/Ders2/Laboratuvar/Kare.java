package Ders2.Laboratuvar;

import java.util.Scanner;

public class Kare {

    public static void main(String[] args){
        Scanner giris= new Scanner(System.in);

        System.out.println("Karenin kenarini girin:");
        int kenar = giris.nextInt();


        for(int i=0;i<kenar;i++){
            for(int j=0;j<kenar;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
