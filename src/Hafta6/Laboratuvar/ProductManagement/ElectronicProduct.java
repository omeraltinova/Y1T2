package Hafta6.Laboratuvar.ProductManagement;

public class ElectronicProduct extends Product{
    private String model;

    public ElectronicProduct(String name, double price,String model) {
        super(name, price);
        this.model=model;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void displayInfo() {
        System.out.println("---------------------");
        System.out.println("Ürün adı: "+getName());
        System.out.println("Fiyat: "+ getPrice());
        System.out.println("Model: "+ getModel());
        System.out.println("---------------------");
    }
}
