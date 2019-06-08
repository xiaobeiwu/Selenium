package com.javastudy;

public class TestngDemo2 {
	
	public void beforeSuit() {
		System.out.println("TestngDemo2-------BeforeSuit");

	}
	
	public void beforeClass() {
		System.out.println("TestngDemo2-------BeforeClass");

	}

	public void beforeMethod() {
		System.out.println("TestngDemo2-------BeforeMethod");

	}
	

	public void test1() {
		System.out.println("TestngDemo2-------Test");

	}

	public void beforeTest() {
		
		System.out.println("TestngDemo2-------beforeTest");
	}
	
	public void afterTest() {
		System.out.println("TestngDemo2-------afterTest");

	}
	
	public void afterMethod() {
		System.out.println("TestngDemo2-------afterMethod");

	}
	
	public void afterClass() {
		System.out.println("TestngDemo2-------afterClass");

	}
	
	public void afterSuit() {
		System.out.println("TestngDemo2-------afterSuit");

	}


}
