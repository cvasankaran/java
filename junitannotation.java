package com.junitproject.junitfirst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitannotation {
	@BeforeClass
	public static void preClass() {
	System.out.println("@Beforeclass – the annotated method runs once before all other methods execute");
	}
	@Before
	public void setUp() {
	System.out.println("@Before – the annotated method executes before each test ");
	}
	@Test
	public void test_JUnit1() {
	System.out.println("@Test – this is test case 1");
	}
	@Test
	public void test_JUnit2() {

	System.out.println("@Test – this is test case 2");
	}
	@Test
	public void test_JUnit3() {
	System.out.println("@Test – this is test case 3");

	}
	@After
	public void tearDown() {
	System.out.println("@After – the annotated method executes after each test executes");
	
	}

	@AfterClass
	public static void postClass() {
	System.out.println("@Afterclass – the annotated method runs once after all other methods execute");

}
}
