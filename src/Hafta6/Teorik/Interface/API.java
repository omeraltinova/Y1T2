package Hafta6.Teorik.Interface;

public interface API {
    default void show(){
        System.out.println("Default API");
    }
    void show2();
}
