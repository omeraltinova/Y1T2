package Hafta6.Laboratuvar.ProductManagement;

public class Main {
    public static void main(String[] args) {
        ElectronicProduct e1 = new ElectronicProduct("s24",39999,"S246EF");
        ClothingProduct c1 = new ClothingProduct("Tişört",799.99,"L","%100 pamuk");
        FoodProduct f1 = new FoodProduct("Çikolata",225,"15.2.2025",1234);

        e1.displayInfo();
        c1.displayInfo();
        f1.displayInfo();
    }
}
