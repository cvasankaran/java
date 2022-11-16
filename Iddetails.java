class userdefinedexception extends Exception{
	public userdefinedexception (String s)
	{
		super (s);
	}
}
public class Iddetails 
{
	static void bookid(int id)throws userdefinedexception
	{
		if(id==1234)
			throw new userdefinedexception("valid");
		else 
			System.out.println(" not valid");
		
	}

	public static void main(String[] args) 
	{
		try
		{
			bookid(1234 );
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
			
		}
		System.out.println("next book id validation");

	}

}
