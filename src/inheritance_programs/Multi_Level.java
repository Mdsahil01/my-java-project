package inheritance_programs;

class GrandFather{
    int money = 1000;
}
class Dad extends GrandFather{ }
class Son1 extends Dad {}

public class Multi_Level {
    public static void main(String[] args) {
        Dad d = new Dad();
        System.out.println(d.money);

        Son1 s = new Son1();
        System.out.println(s.money);
    }
}
