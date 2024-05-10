package Assignment;
import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String s){
		 super(s);
	}
}

class student{
	String name;
	int mark;
	 student(String name, int mark) {
		name="gopal";
		mark=this.mark;
	}
}

public class Q3 {
       public static void main(String[]args) {
                Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark");
		if(x>100) {
			try {
                            int x=sc.nextInt();
                            student sc1= new student("gopal", x);
                            if (sc1.mark>100){
                                    throw new MarksOutOfBoundException("Too high");
                            }   
			}
			catch(MarksOutOfBoundException ob) {
				System.out.println(ob.getMessage());
			}
		}
		else 
                       System.out.println("Mark is "+x);
	}
}
