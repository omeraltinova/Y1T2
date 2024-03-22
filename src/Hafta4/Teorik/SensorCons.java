package Hafta4.Teorik;

public class SensorCons {
    private final double sicaklik;
    private final int nem;

    SensorCons(double sicaklik,int nem){
        this.sicaklik=sicaklik;
        this.nem=nem;
    }
    public double getSicaklik(){
        return(sicaklik);
    }
    public int getNem(){
        return(nem);
    }
}
