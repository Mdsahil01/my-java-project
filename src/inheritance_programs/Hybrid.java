package inheritance_programs;

class Father2{
    int money = 1000;
}

class boy1 extends Father2{}
class boy2 extends Father2{}
class girl1 extends boy1{}
public class Hybrid {
    public static void main(String[] args) {
        boy1 b1 = new boy1();
        System.out.println(b1.money);

        boy2 b2 = new boy2();
        System.out.println(b2.money);

        girl1 g1 = new girl1();
        System.out.println(g1.money);
    }
}
