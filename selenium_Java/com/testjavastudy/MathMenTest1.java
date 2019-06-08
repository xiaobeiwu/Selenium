package com.testjavastudy;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import com.javastudy.MathMen;

public class MathMenTest1 {
	
	private MathMen mathMen;
	
	@BeforeSuite
	public void init() {
		System.out.println("this is math men test 1.");
		mathMen = new MathMen(100, 3);
	}
	
	@Test
	public void addTest() {
		System.out.println("this is math men test 1 addTest.");
		assertEquals(103,mathMen.addSome()) 	;	
		mathMen.changeX(3);
		assertEquals(6, mathMen.addSome());
	}
	
	@Test
	public void multyTest() {
		System.out.println("this is math men test 1 multyTest.");
		assertEquals(9, mathMen.multy());
	}
	
}
