package Vize.Lab4KalanOrnekler.SirketYonetim;

public class Person {
    String name;

    Person(String name){
        this.name=name;
    }

    public void introduce(){
        System.out.println("Hi my name is " + name);
    }
}
