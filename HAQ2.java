package Assignment;
import java.util.Scanner;
public class HAQ2 {
	static int binary(int a[], int l,int h, int x) {
		if(l<h) {
			int mid=(l+h)/2;
			if(a[mid]==x)
				return mid;
			else if(a[mid]>x)
				return binary(a,l,mid-1,x);
			return binary(a,mid+1,h,x);
		}
		return -1;
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the search number ");
		int a[]= {1,2,3,4,5,6};
		int x=5;
		System.out.println(binary(a,0,a.length-1,x));
	}
}
