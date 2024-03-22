package Hafta4.Teorik;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D(){

    }
    Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return(x);
    }
    public float getY(){
        return(y);
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] dizi = new float[2];
        dizi[0]=x;
        dizi[1]=y;
        return(dizi);
    }
}
