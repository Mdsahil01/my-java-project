package inheritance_programs;

interface Ramesh{ int a = 10;}
interface  Mahesh{ int b = 20;}
interface Suresh{ int c = 30;}

interface Raju extends Ramesh,Mahesh,Suresh{}

class Mobile implements Raju{}

public class Multiple {
    public static void main(String[] args) {
        Raju r = new Mobile();
        System.out.println(r.a);
        System.out.println(r.b);
        System.out.println(r.c);

        Mobile m = new Mobile();
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(m.c);
    }
}
