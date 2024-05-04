package Assignment_03;

public class Q_9 {
	static void reverse(int n) {
		if(n>=0 && n<=9) {
			System.out.print(n);
			return;
		}
		System.out.print(n%10);
		reverse(n/10);
	}
	public static void main(String []args) {
		int x=4735;
		reverse(x);
	}

}
