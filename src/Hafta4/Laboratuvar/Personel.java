package Hafta4.Laboratuvar;

public class Personel {
    public static void main(String[] args) {
        PersonelCons personel1 = new PersonelCons("Ahmed","IT",17002.13);
        PersonelCons personel2 = new PersonelCons("Semih","IT",32003.31);

        System.out.println(personel1.bilgiGoster());
        System.out.println(personel2.bilgiGoster());

        personel1.departmanDegistir("Çay ve yemek servisi");
        personel1.maasDegistir(40230.15);
        personel2.departmanDegistir("Çöp toplama ve öğütme");
        personel2.maasDegistir(35034.49);

        System.out.println(personel1.bilgiGoster());
        System.out.println(personel2.bilgiGoster());
    }

}
