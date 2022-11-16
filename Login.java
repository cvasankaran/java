package siva;

import javax.annotation.processing.FilerException;

public class Login {

	

	static void crendital(int userid,String passward) throws Exception
	{
		
		if(userid==12345&&passward=="mathi")
			System.out.println("sucess");
		else
			throw new Exception("not valid");
	}

	public static void main(String[] args) throws Exception
	{
		crendital(12345, "mathi");
	
		System.out.println("open the tab");
		
	

	
}
}
