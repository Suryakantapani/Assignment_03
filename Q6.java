package Assignment;

public class Q6 {
	public static <T> int count(T[] array, T item) {
		int count=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]==item) 
				count++;
	        }
	return count;
	}
	
	public static void main(String[]args) {
		Integer []x= {2,3,4,5,6,4,4,5,6};
		Integer x1=5;
		System.out.println(count(x,x1));
	}
}
