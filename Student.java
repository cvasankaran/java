package siva;

public class Student {
	void sid(int x)
	{
		System.out.println(x);
		
	}
	void sname(String y) {
		System.out.println(y);
	}
	void marks(int z) {
		System.out.println(z);
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.sid(123);
		s.sname("siva");
		s.marks(92);
		
		

	}

}
