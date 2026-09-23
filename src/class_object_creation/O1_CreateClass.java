package class_object_creation;

public class O1_CreateClass {

    static int a = 10; //Global
           int b = 20; //Global

   public static void main(String[] args) {
      int x =100; //local
      int y =200; //local
       System.out.println(x);
       System.out.println(y);

       System.out.println(a);
       O1_CreateClass c = new O1_CreateClass();
       System.out.println(c.b);

    }
}
