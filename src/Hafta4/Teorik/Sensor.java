package Hafta4.Teorik;

public class Sensor {
    public static void main(String[] args) {
        SensorCons s1 = new SensorCons(37.5,35);

        kontrol(s1.getSicaklik(),s1.getNem());
        }

    public static void kontrol(double s,int n){
        if(s>25 && n<40){
            System.out.println("Sulama sistemini aktif ettim abi");
        }
        else {
            System.out.println("Sulamayı açmıyom abi");
        }
    }
}
