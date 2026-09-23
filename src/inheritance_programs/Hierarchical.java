package inheritance_programs;

class Father1{
    int money = 1000;
}

class Child1 extends Father1{}
class Child2 extends Father1{}


public class Hierarchical {
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        System.out.println(c1.money);

        Child2 c2 = new Child2();
        System.out.println(c2.money);
    }
}
