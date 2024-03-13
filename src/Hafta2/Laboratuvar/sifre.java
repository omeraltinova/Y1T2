package Hafta2.Laboratuvar;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args){
        String username= "admin";
        String password= "12345";
        boolean usernameValue;
        boolean passwordValue;
        Scanner giris= new Scanner(System.in);
        while(true){
        System.out.println("Kullanici adi giriniz");
        String usernameIn= giris.nextLine();
        System.out.println("Sifre giriniz");
        String passwordIn=giris.nextLine();

        usernameValue = username.equals(usernameIn);
        passwordValue = password.equals(passwordIn);

        if(usernameValue== true && passwordValue== true ){
            System.out.println("Basariyla giris yaptiniz");
            break;
        }
        else{
            System.out.println("Yanlis kullanici adi veya Ders2.Laboratuvar.sifre\n\n---------------------------------");
            System.out.println("");
            }
        }
    }

}
