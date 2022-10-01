package siva;

public class multiinheritance {

	class Red
	{
		void msg()
		{
			System.out.println("red color");
		}
	}
	class green
	{
		void msg()
		{
			System.out.println("yellow color");
		}
	}
	class yellow extends Red,green
	{
		void msg3()
		{
			System.out.println("orange color");
		}
	}

	public class Inh2 {

		public static void main(String[] args) {
		yellow o=new yellow();
		o.msg();
		}

	}
