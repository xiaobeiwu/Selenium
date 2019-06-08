package com.javastudy;

public class Dad extends Person implements Male {
	
	private Child child;
	

	public Dad(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void info() {
		System.out.println(name+" is my daddy,"+age+" years old."+"he is a strong "+SEX+" person!");
		
	}
	@Override
	public void work() {
		System.out.println("my dad can code.");
		
	}

	@Override
	public void interest() {
		System.out.println("my dad likes to read.");
		
	}
	
	public void clean() {
		System.out.println("Dad have to be washed.");
		
	}
	public void travel() {
		System.out.println("Dad goes everywhere with mum.");
	}

}
