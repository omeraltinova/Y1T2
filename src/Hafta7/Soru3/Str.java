package Hafta7.Soru3;

public class Str {
    public class StrIn{
        public void P1(String cumle){
            System.out.println(cumle.toLowerCase());
        }
        public void P3(String cumle){
            class StrInIn{
            public void P4(String cumle){
                System.out.println(cumle.length());
            }
            }
            StrInIn n1 = new StrInIn();
            n1.P4(cumle);
        }
    }


    public void P2(String cumle){
        System.out.println(cumle.toUpperCase());
    }
}
