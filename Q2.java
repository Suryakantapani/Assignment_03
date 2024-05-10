package Assignment;
import java.util.Scanner;
public class Q2 {
	public static void main(String[]args){
		String a[]= {"pink","yellow","black"};
		try{
			System.out.println(a[4]);	
	        }
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			try {
				Integer.parseInt(a[0]);
			}
			catch(NumberFormatException se) {
				System.out.println(e);  
			}
		}
	}
}
