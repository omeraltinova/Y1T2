package Vize.Lab4KalanOrnekler.SirketYonetim;

public class Employee extends Person{
    String departman;

    Employee(String name,String departman){
        super(name);
        this.departman=departman;
    }

    @Override
    public void introduce() {
        System.out.println("Hi my name is "+ name);
        System.out.println("My department is "+ departman);
    }
}
