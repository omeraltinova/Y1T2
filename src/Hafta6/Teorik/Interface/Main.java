package Hafta6.Teorik.Interface;

public class Main implements Interface1,Interface2{
   public void display(){
      System.out.println("Display from interface1");
   }
   public void print(){
      System.out.println("Print from Interface2");
   }

   @Override
   public void show2() {
      System.out.println("Show2 from API");
   }
}
