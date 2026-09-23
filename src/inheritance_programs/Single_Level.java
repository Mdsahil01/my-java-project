package inheritance_programs;

class Father{
    int money = 1000;

}

class Son extends Father{ }

public class Single_Level {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.money);
    }
}
