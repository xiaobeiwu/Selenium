package com.testjavastudy;

import java.awt.peer.PanelPeer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.javastudy.Child;
import com.javastudy.Dad;
import com.javastudy.Mum;

public class FamilyTestng {
	private Dad dad;
	private Mum mum;
	private Child child;
	
	@BeforeTest
	public void buildHouse() {
		System.out.println("***I have a house towards the sea, with spring blossoms.*** ");
	}
	
	@BeforeClass
	public void setup() {	
	dad = new Dad("xu", 30);
	mum = new Mum("wu", 30);
	child = new Child("Wendy", 3);
	child.setDad(dad);
	child.setMum(mum);
	mum.setDad(dad);
	child.welcome();	
	
	}
	
	@BeforeMethod
	public void printStar() {
		System.out.println("*********method start**********"); 
	}
	@AfterMethod
	public void printsLine() {
		System.out.println("---------method end-----------");
	}
	
	@Test
	public void introduce() {
		child.info();
		
	}
	
	@Test(dependsOnMethods = { "introduce" })
	public void ablity() {
		child.work();	
	}
	
	@Test
	public void intereting() {
		child.interet();
		mum.interest();
		
	}
	
	@Test
	public void wash() {
		child.wash();
	}
	@AfterClass
	public void Bye() {
		System.out.println("this is my family.");
		child.byebye();
	}
	


}
