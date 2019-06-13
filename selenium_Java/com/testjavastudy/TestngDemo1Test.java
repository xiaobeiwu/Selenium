package com.testjavastudy;

import static org.testng.Assert.assertFalse;

import java.security.acl.Group;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestngDemo1Test {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("TestngDemo1-------BeforeSuit");

	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("TestngDemo1-------beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("TestngDemo1-------BeforeClass");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestngDemo1-------BeforeMethod");

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("TestngDemo1-------afterMethod");

	}
	
	@BeforeGroups(groups="login")
	public void testb() {
		System.out.println("TestngDemo1---login----beforeGroups");

	}
	
	@Test(groups= {"login","g1"})
	public void test1() {
		System.out.println("TestngDemo1---login----Test1");

	}
	
	@Test(groups="login")
	public void test2() {
		System.out.println("TestngDemo1----login---Test2");

	}
	
	@AfterGroups(groups="login")
	public void Testa() {
		System.out.println("TestngDemo1----login---aftergroups");
		
	}
	@Test(groups="register")
	public void test3() {
		System.out.println("TestngDemo1---register----Test3");

	}
	
	@Test(enabled=false)
	public void ignore() {
		System.out.println("TestngDemo1---ignore----Test");

	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("TestngDemo1-------afterClass");

	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("TestngDemo1-------afterTest");

	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("TestngDemo1-------afterSuit");

	}

	

}
