package com.testjavastudy;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import javax.security.auth.login.LoginContext;

import com.javastudy.MathMen;

public class MathMenTest2 {
	
	private MathMen mathMen;
		
	@BeforeMethod
	public void init() {
		System.out.println("this is math men test 2.");
		mathMen = new MathMen(100, 3);
	}
	
	@Test
	public void checkNull() {
		addTest();
		
		Object tempObject = mathMen.check();
		if (null != tempObject) {
			tempObject.equals("0");
		}
	}
	
	@Test
	public void addTest() {
		System.out.println("this is math men test 2 addTest.");
		assertEquals(103,mathMen.addSome()) 	;	
		mathMen.changeX(3);
		assertEquals(6, mathMen.addSome());
	}
	
	@Test
	public void multyTest() {
		System.out.println("this is math men test 2 multyTest.");
		assertEquals(300, mathMen.multy());
	}
	
	@BeforeClass
	public void in() {
		System.out.println("this is math men test 2 in.");
	}
}
