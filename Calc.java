package com.junitproject.junitfirst;

public class Calc {
	

	public static int additon(int x, int y)
	   {
		int z;
		z=x+y;
		return z;
		}
	public static int subraction(int x,int y )
	{
		int z;
		z=x-y;
		return z;
	}
	public static int multiplication(int x, int y)
	{
		int z;
		z=x*y;
		return z;
		
	}
	public static int division(int x, int y)
	{
		int z;
		z=x/y;
		return z;
	}
		
	


	public static void main(String args[])
	{
		@SuppressWarnings("unused")
		Calc su=new Calc();
		Calc.additon(0,0);
		Calc.subraction(0,0);
		Calc.multiplication(0,0);
		Calc.division(0,0);

		
	}


}


