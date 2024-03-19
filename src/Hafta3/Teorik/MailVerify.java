package Hafta3.Teorik;

import java.util.Scanner;

public class MailVerify {

    public static void main(String[] args) {
        MailVerifyClass control = new MailVerifyClass();
        Scanner giris = new Scanner(System.in);
        System.out.println("Merhaba mail adresi gir");
        String mail = giris.nextLine();
        int emailCheck = control.MailVerifyClass(mail);
        if(emailCheck==1){
            System.out.println("IP adresi gir");
        }

    }
}
