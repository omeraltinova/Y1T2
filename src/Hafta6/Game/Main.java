package Hafta6.Game;

public class Main {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        FireMonster f1 = new FireMonster();
        WaterMonster w1 = new WaterMonster();
        StoneMonster s1 = new StoneMonster();

        System.out.println(m1.attack());
        System.out.println(f1.attack());
        System.out.println(w1.attack());
        System.out.println(s1.attack());
        
    }
}
