package Hafta4.Teorik;

import java.util.Scanner;

public class DBConnect {
    public static void main(String[] args) {
        DBConnectCons db1 = new DBConnectCons("DB1",12345);
        DBConnectCons db2 = new DBConnectCons("DB2",54321);

        Scanner giris = new Scanner(System.in);
        System.out.println("Database listesi:\n"+ db1.getdBName() + "\n" + db2.getdBName() +"\n3- DB Düzenle");
        System.out.println("Database seçiniz");
        int name = giris.nextInt();
        System.out.println("Database şifresini girin");
        int password = giris.nextInt();

        switch (name) {
            case 1 -> {
                if (password == db1.getdBPassword()) {
                    System.out.println("Başarıyla giriş yaptınız");
                } else {
                    System.out.println("Şifre yanlış");
                }
            }
            case 2 -> {
                if (password == db2.getdBPassword()) {
                    System.out.println("Başarıyla giriş yaptınız");
                } else {
                    System.out.println("Şifre yanlış");
                }
            }
         //   case 3 ->
            default -> System.out.println("Hatalı giriş");
        }
    }
}
