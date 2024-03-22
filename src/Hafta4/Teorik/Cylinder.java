package Hafta4.Teorik;

public class Cylinder extends Circle{

    private double height=1.0;
    Cylinder(){

    }
    Cylinder(double radius){
        setRadius(radius);
    }
    Cylinder(double radius,double height){
        setRadius(radius);
        this.height=height;
    }
    Cylinder(double radius,double height,String color){
        setColor(color);
        setRadius(radius);
        this.height=height;
    }
    public double getHeight(){
        return(height);
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return(getArea()*height);
    }

}
