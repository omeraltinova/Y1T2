package Vize.Lab4KalanOrnekler.SirketYonetim;
//5) Bir şirket yönetim sistemi oluşturmak istiyoruz. Person adında bir üst sınıf oluşturun. Bu
//sınıf, bir kişinin adını tutmalı ve introduce() adında bir metodu bulunmalıdır. introduce()
//metodu, kişinin adını ekrana yazdırmalıdır. Employee adında bir alt sınıf oluşturun. Bu sınıf,
//Person sınıfından türetilmelidir. Ayrıca, bir departman adını saklamalı ve introduce() metodu,
//kişinin adını ve çalıştığı departmanı ekrana yazdırmalıdır.
//Manager adında bir alt sınıf oluşturun. Bu sınıf, Employee sınıfından türetilmelidir. Ayrıca,
//yönettiği ekibin boyutunu saklamalı ve introduce() metodu, kişinin adını, çalıştığı departmanı
//ve yönettiği ekibin boyutunu ekrana yazdırmalıdır. Main sınıfının main metodu içinde, bir
//Manager örneği oluşturulmalı ve introduce() metodu çağrılmalıdır.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Faruk");
        Employee e1 = new Employee("Faruk","IT");
        Manager m1 = new Manager("Faruk","IT1",50);
        p1.introduce();
        e1.introduce();
        m1.introduce();
    }
}
