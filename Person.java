package siva;

public class Person {
	void pid(int x) {
		System.out.println(x);
	}
	void pname(String y)
	{
		System.out.println(y);
	}
}
class Stud extends Person{
	void mark(int z) {
		System.out.println(z);
		}
}
class Emp extends Person{
	void salary(int k) {
		System.out.println(k);
	}

	public static void main(String[] args) {
		Stud a=new Stud();
		Emp b=new Emp();
		a.pid(123);
		a.pname("siva");
		a.mark(92);
		b.pid(123);
		b.pname("siva");
		b.salary(52000);
		
		
		
	}
}
