package class_object_creation;
// Accessing Static and Non-static Variable from another class

class Sahil{
    static  int x = 100;
            int y = 200;

     static void add(int a,int b){
         System.out.println(a+b);
     }
     void subtract(int a, int b){
         System.out.println(a-b);
     }
}
public class O3_Create_Class {
   public static void main(String[] args) {
       System.out.println(Sahil.x);
       Sahil s = new Sahil();
       System.out.println(s.y);

       Sahil.add(10,5);
       s.subtract(5,2);
    }
}
