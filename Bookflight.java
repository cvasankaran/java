package siva;

public class Bookflight {
	private int bid;
	private int fid;
	private int fclass;
	private int doj;
	private int dob;
	private int noa;
	private int noc;
    private int gen;
    private int tf;
    private int cid;
	
	public int getbookid()
	{
		return bid;
	}
	public void setbookid(final int bid)
	{
		this.bid=bid;
	}
	
	
    public int getflightid() 
    {
		return fid;
    	
    }
    public void setflightid(final int fid)
    {
    	this.fid=fid;
    }
    
    
    public int getflightclass()
    {
    	return fclass;
    }
    public void setflightclass(final int fclass)
    {
    	this.fclass=fclass;
    }
    
    
    public int getdateofjourney()
    {
    	return doj;
    }
    public void setdateofjourney(final int doj)
    {
    	this.doj=doj;
    	
    }
    
    
    
    public int getdateofbooking()
    {
    	return dob;
    	
    }
    public void setdateofbooking(final int dob)
    {
    	this.dob=dob;
    	
    }
    
    
    public int getnumberofadults()
    {
    	return noa;
    	
    }
    public void setnumberofadults(final int noa) 
    {
        this.noa=noa;
         
    } 
    
    
    public int getnumberofchild()
    {
         return noc;
    }
    public void setnumberofchild(final int noc)
    {
         this.noc=noc;
    }
    
    
    public int getgender()
    {
    	return gen;
    }
    public void setgender(final int gen)
    {
    	this.gen=gen;
    }
    
    
    public int getticketfare()
    {
    	return tf;
    }
    public void setticketfare(final int tf)
    {
    	this.tf=tf;
    }
    
    
    public int getcustomerid()
    {
    	return cid;
    }
    public void setcustomerid(final int cid)
    {
    	this.cid=cid;
    }
    public String toString() 
    {
    	String str="Bookflight:[bid="+getbookid()+",fid="+getflightid()+",fclass="+getflightclass()+",doj="+getdateofjourney()+",dob="+getdateofbooking()+",noa="+getnumberofadults()+",noc="+getnumberofchild()+",gen="+getgender()+",tf="+getticketfare()+",cid="+getcustomerid()+"]";
    	return str;
    	
    }
    	public static void main(String[] args)
    	{
    		final Bookflight bf=new Bookflight();
    		
    		bf.setbookid(123);
    		bf.setflightid(1234);
    		bf.setflightclass(2);
    		bf.setdateofjourney(2-11-2000);
    		bf.setdateofbooking(16-05-2000);
    		bf.setnumberofadults(2);
    		bf.setnumberofchild(2);
    		bf.setgender(2);
    		bf.setticketfare(2000);
    		bf.setcustomerid(1234);
    		System.out.println(bf.toString());
    
    		
    		
   
		// TODO Auto-generated method stub

	}

}
