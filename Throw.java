package siva;

public class Throw {
	void check(int age) {
		if (age<18)
			throw new ArithmeticException("invalid age");
		else
			System.out.println("valid age");
		
	}
	

	public static void main(String[] args) {
	
 Throw s=new Throw();
 s.check(17);
 
	}

}
