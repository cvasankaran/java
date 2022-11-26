package com.junitproject.junitfirst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public  void testfindMax()
    {
		assertEquals(6,Calc.additon(2,4));
		assertEquals(3,Calc.subraction(5, 2));
		assertEquals(10,Calc.multiplication(5,2));
		assertEquals(2,Calc.division(20,10));
	
   
    }
}
