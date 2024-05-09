 package Assignment;
import java.util.Scanner;
public class Q7 {
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String []args){
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(fact(x));
		
	}

}
