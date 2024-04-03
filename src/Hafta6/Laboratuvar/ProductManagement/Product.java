package Hafta6.Laboratuvar.ProductManagement;

public class Product {
    private String name;
    private double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("---------------------");
        System.out.println("Ürün adı: "+this.name);
        System.out.println("Fiyat: "+ this.price);
        System.out.println("---------------------");
    }
}
