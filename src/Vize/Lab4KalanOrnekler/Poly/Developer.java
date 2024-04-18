package Vize.Lab4KalanOrnekler.Poly;

public class Developer extends Employee{
    String language;

    Developer(String isim,String language){
        super(isim);
        this.language=language;
    }
    public void Code(){
        System.out.println("C++ is a high level language!");
    }
}
