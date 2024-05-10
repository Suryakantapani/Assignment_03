package Assignment;

public class Q5 {
	public static <E> void printarray(E[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	
		}
	}
	public static void main(String[]args) {
		Integer x[]= {1,2,3,4};
		printarray(x);
		String x1[]= {"pink","yellow","white"};
		printarray(x1);
	}
}
