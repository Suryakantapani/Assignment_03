package Assignment;

public class HAQ3 {
	static void covert(int x) {
		if(x==0 || x==1){
			 System.out.print(x);
			 return;
		}
		covert(x/2);
		System.out.print(x%2);
	 
	}
	public static void main(String[]args) {
		int x=456;
		covert(x);
		
	}

}
