package Assignment;

public class HAQ_01 {
	static int GCD(int x,int y) {
		if(x==0)
			return y;
		
		return GCD(y%x,x);
	}
	public static void main(String[]args) {
		int x=100;
		int y=50;
		System.out.println(GCD(x,y));
	}

}
