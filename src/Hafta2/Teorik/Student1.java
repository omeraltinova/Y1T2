package Hafta2.Teorik;

public class Student1 {
    public static void main(String[] args) {
        Ogrenci student1 = new Ogrenci();
        student1.isim="Faruk";
        student1.numara=44;
        System.out.println(student1.isim);
        System.out.println(student1.numara);
        student1.otuzbir();
    }
}
