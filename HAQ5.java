package Assignment;

public class HAQ5 {
	static String reverse(String s,int idx) {
		if(s.length()==idx)
			return " ";
		String ss=reverse(s,idx+1); 
		return ss+s.charAt(idx);
	
	}
	public static void main(String[]args) {
		String x="pots&pans";
		System.out.println(reverse(x,0));
		
	}

}
