package Vize.Lab4KalanOrnekler.InnerClass;

public class Main {
    public static void main(String[] args) {
        innercase i1 = new innercase();
        innercase.innercase2 i2 = i1.new innercase2();
        System.out.println(i1.x+i2.y);
    }
}
