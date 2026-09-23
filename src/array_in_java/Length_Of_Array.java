package array_in_java;

public class Length_Of_Array {
    static void main(String[] args) {
        int a[] = {11,22,33,44,55,66};

        System.out.println("Total length is " + a.length);

        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
