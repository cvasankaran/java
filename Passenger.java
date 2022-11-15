package siva;

public class Passenger {
	private int bid;
	private int pid;
	private String pname;
	private int age;
	private int psd;
	
	public int getbookid()
	{
		return bid;
	}
	public void setbookid(int bid)
	{
		this.bid=bid;
		System.out.println(bid);
	}
	
	public int getpassengerid()
	{
		return pid;
	}
	public void setpassengerid(int pid)
	{
		this.pid=pid;
		System.out.println(pid);
	}
	
	
	public String getpassengername()
	{
		return pname;
	}
	public void setpassengername(String pname)
	{
		this.pname=pname;
		System.out.println(pname);
	}
	
	
	
	public int getpage()
	{
		return age;
	}
	public void setpage(int age)
	{
		this.age=age;
		System.out.println( age);
	}
	
	
	
	public int getbookstatusdetails()
	{
		return psd;
	}
	public void setbookstatusdetails(int psd)
	{
		this.psd=psd;
		System.out.println(psd);
	}

	public static void main(String[] args) 
	{
		Passenger pd=new Passenger();
		
		pd.setbookid(123);
		pd.setpassengerid(1234);
		pd.setpassengername("dude");
		pd.setpage(21);
		pd.setbookstatusdetails(2);
		
		
		
		

	}

}
