 package Assignment;
public class Q7 {
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String []args){
		int x=5;
		System.out.println(fact(x));
	}
}
