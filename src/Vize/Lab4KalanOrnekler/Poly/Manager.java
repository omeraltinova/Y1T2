package Vize.Lab4KalanOrnekler.Poly;

public class Manager extends Employee{
    int managerid= 5;
    Manager(String isim,int managerid){
        super(isim);
        this.managerid=managerid;
    }
    public void hire(){
        System.out.println("İşe alındın!");
    }
}
