package array_in_java;

import java.util.Scanner;

public class Linear_Search {
    static void main(String[] args) {
        int a[] = {55,11,33,22,44,66,88,77,100,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Search:");
        int item = sc.nextInt();
        boolean found = false;
        int index =0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                found = true;
                index = i;
                break;

            }
        }
        if (found == true) {
            System.out.println("Found the number "+ item +" at index number "+ index);

        }else {
            System.out.println("The number " + item +" is not present");
        }


    }
}
