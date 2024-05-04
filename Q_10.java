package Assignment_03;

public class Q_10 {
	static int fibo(int n) {
		if(n==1 ||n==0) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[]args) {
		int x=5;
		System.out.println(fibo(x));
	}

}
