package Hafta6.Laboratuvar.ProductManagement;

public class ClothingProduct extends Product {
    private String beden;
    private String kumas;

    public ClothingProduct(String name, double price,String beden,String kumas){
        super(name, price);
        this.beden=beden;
        this.kumas=kumas;
    }

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

    public String getKumas() {
        return kumas;
    }

    public void setKumas(String kumas) {
        this.kumas = kumas;
    }

    @Override
    public void displayInfo() {
        System.out.println("---------------------");
        System.out.println("Ürün adı: "+getName());
        System.out.println("Fiyat: "+ getPrice());
        System.out.println("Beden: "+ getBeden());
        System.out.println("Kumaş: "+ getKumas());
        System.out.println("---------------------");
    }
}
