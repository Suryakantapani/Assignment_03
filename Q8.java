package Assignment;
public class Q8 {
	static int pow(int x, int n) {
		if(n==0)
			return 1;
		if(n==1)
			return x;
		
		return x*pow(x,n-1);
	}
	public static void main(String[]args) {
		System.out.println(pow(5,2));	
	}
}
