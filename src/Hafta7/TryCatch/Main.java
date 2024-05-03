package Hafta7.TryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter your name");
        String isim = giris.nextLine();

        try{
            test(isim);
        }
        catch (Uyelik e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void test(String isim) throws Uyelik{
        if (isim.equalsIgnoreCase("Serpil")) {
            throw new Uyelik("You are banned from this app");
        }
        else{
            System.out.println("Successfully created your membership");
        }
    }
}
