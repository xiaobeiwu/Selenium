package com.javastudy;

public class TestngDemo1 {
	
	public void beforeSuit() {
		System.out.println("TestngDemo1-------BeforeSuit");

	}
	
	public void beforeClass() {
		System.out.println("TestngDemo1-------BeforeClass");

	}

	public void beforeMethod() {
		System.out.println("TestngDemo1-------BeforeMethod");

	}
	

	public void test1() {
		System.out.println("TestngDemo1-------Test");

	}

	public void beforeTest() {
		
		System.out.println("TestngDemo1-------beforeTest");
	}
	
	public void afterTest() {
		System.out.println("TestngDemo1-------afterTest");

	}
	
	public void afterMethod() {
		System.out.println("TestngDemo1-------afterMethod");

	}
	
	public void afterClass() {
		System.out.println("TestngDemo1-------afterClass");

	}
	
	public void afterSuit() {
		System.out.println("TestngDemo1-------afterSuit");

	}

}
