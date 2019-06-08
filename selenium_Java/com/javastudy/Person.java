package com.javastudy;

public class Person {
	
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
			
	}
	
	public void eat() {
		System.out.println(name+"需要吃饭");
		
	}
	public void sleep() {
		System.out.println(name+"需要睡觉");
		
	}
	
	
	public void welcome() {
	System.out.print("***welcome to my family!");	
	System.out.println("First,i introduce my family!***");
	}
	public void byebye() {
		System.out.println("***see you next time,Byebye***");
		
	}
	
}
