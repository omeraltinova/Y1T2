package Hafta4.Teorik;

public class Circle {
    private double radius = 1.5;
    private String color = "Red";
    Circle(){

    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;

    }
    public double getRadius(){
        return(this.radius);
    }
    public String getColor(){
        return(this.color);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return(Math.PI*this.radius*this.radius);
    }
}
