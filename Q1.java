package Assignment;
import java.util.Scanner;
public class Q1 {
	public static void main(String[]args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x<0) {
			try {
				throw new NumberFormatException();
			}
			catch(NumberFormatException e) {
				System.out.println("Negative Number. ");
			}
		}
	}
}
