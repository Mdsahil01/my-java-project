package class_object_creation;


class Demo{
    static int a = 10; //Static Variables
           int b = 20; // Non - static Variables

}

public class O2_CreateClass {

    public static void main(String[] args) {
       Demo d = new Demo();
        System.out.println(d.b);

    }
}
