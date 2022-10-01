package siva;

public class bankcustomer {
	int acno;
	String atype;
	int amount;
	bankcustomer( int x, String y,int z)
	{
		acno=x;
		atype=y;
		amount=z;
	
	}
	void show()
	{
		System.out.println(acno+atype+amount);
	}

	public static void main(String[] args) {
		bankcustomer s=new bankcustomer(2628,"saving account",22222);
		s.show();
		

	}

}

