package Hafta3.Teorik;

public class WorkerClass {
    String isim;
    double maas;
    int id;

    WorkerClass(String isim){
        this.isim=isim;
        System.out.println("Merhaba " + this.isim);
    }
    WorkerClass(String isim,int id){
        this.isim=isim;
        this.id=id;
        System.out.println("Merhaba " + this.isim + "ID: " + this.id);
    }
    WorkerClass(String isim,int id,double maas){
        this.isim=isim;
        this.id=id;
        this.maas=maas;
        System.out.println("Merhaba " + this.isim + "ID: " + this.id);
        System.out.println("Maaşın ise " + this.maas +"TL");
    }


}
