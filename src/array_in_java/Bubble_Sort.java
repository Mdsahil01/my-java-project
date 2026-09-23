package array_in_java;

public class Bubble_Sort {
    static void main(String[] args) {
        int a[] = {55,11,33,22,44,66,88,77,100,99};

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length-1; j++) {

                if (a[j] > a[j+1]) {

                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t ;

                }
            }
        }
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
