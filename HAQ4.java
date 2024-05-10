package Assignment;
import java.util.Scanner;
public class HAQ4 { 
	static int product(int x,int y) {
		if(y==0)
			return 0;
		 
		return x+product(x,y-1);
	}
	public static void main(String []args){
		int x=4;
		int y=5;
		System.out.println(product(x,y));
        }     
}
