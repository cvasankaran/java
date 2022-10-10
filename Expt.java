package siva;

public class Expt {


		public static void main(String[] args) {
		try {
			try {
				int a[]=new int[7];
				a[7]=0;
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try
			{
				String s1=null;
				System.out.println(s1.length()); 
			}   catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("other statement");
		    }catch(Exception e)
		{
			System.out.println("handled");
			
		}
		System.out.println("normal flow");


		}

	}

