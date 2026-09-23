package array_in_java;

public class PrintArrayBac {
	
	public static void main(String[] args) {
		int a[] = {11,22,33,44,55,66};
		

		System.out.println("Total length is " + a.length);;
		for(int i=a.length-1; i>=0;i--) {
			System.out.println(a[i]+ " ");
		}

}
}
