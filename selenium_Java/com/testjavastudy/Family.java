package com.testjavastudy;

import com.javastudy.Child;
import com.javastudy.Dad;
import com.javastudy.Mum;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dad dad = new Dad("xu", 30);
		dad.info();
		dad.work();
		
		Mum mum = new Mum("wu", 30);
		mum.info();
		mum.work();
		mum.feed();
		
		Child child = new Child("Windy", 3);
		child.info();
		child.eat();
	}

}
