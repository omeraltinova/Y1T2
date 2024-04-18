package Vize.Lab4KalanOrnekler.Poly;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Faruk");
        Manager m1 = new Manager("Faruk",55);
        Developer d1 = new Developer("Faruk","C++");

        e1.Work();
        m1.hire();
        d1.Code();
    }
}
