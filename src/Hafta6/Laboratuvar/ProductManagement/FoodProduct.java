package Hafta6.Laboratuvar.ProductManagement;

public class FoodProduct extends Product{
    private String skt;
    private double kalori;

    public FoodProduct(String name, double price,String skt,double kalori){
        super(name, price);
        this.skt=skt;
        this.kalori=kalori;
    }

    public String getSkt() {
        return skt;
    }

    public void setSkt(String skt) {
        this.skt = skt;
    }

    public double getKalori() {
        return kalori;
    }

    public void setKalori(double kalori) {
        this.kalori = kalori;
    }

    @Override
    public void displayInfo() {
        System.out.println("---------------------");
        System.out.println("Ürün adı: "+getName());
        System.out.println("Fiyat: "+ getPrice());
        System.out.println("SKT: "+ getSkt());
        System.out.println("Kalori: "+ getKalori());
        System.out.println("---------------------");
    }
}
