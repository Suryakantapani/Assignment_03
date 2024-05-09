package Assignment;

public class HAQ6 {
	static String reverse(String s,int idx) {
		if(s.length()==idx) 
			return "";
		String SA=reverse(s,idx+1);
		return SA+s.charAt(idx);
	 
	}
	public static void main(String[]args) {
		 String s="racecar";
		 String ss=reverse(s,0);
		 System.out.println(ss);
		 if(s.equals(ss))
			 System.out.println("palindrome");
		 else 
			 System.out.println("not palindrome");
		 
 			 
		
	}

}
