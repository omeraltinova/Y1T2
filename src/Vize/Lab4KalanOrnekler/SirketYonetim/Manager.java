package Vize.Lab4KalanOrnekler.SirketYonetim;

public class Manager extends Employee{
    int person;

    Manager(String isim,String departman,int person){
        super(isim,departman);
        this.person=person;
    }

    @Override
    public void introduce(){
        System.out.println("Hi my name is "+ name);
        System.out.println("My department is "+ departman);
        System.out.println("I'm managing "+ person + " people");
    }

}
