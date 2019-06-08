package com.javastudy;

public class Mum extends Person implements Female {
	
	private Child child;
	private Dad dad;

	public Mum(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return name+" is my mum,"+age+" years old.he is a gentle "+SEX+" person";
		
	}
	public void info() {
		System.out.println(toString());
		
	}

	@Override
	public void work() {
		System.out.println("my mum can test software.");
		
	}

	public void feed(){
		System.out.println("my mum learned to cook.");
		
	}
	
	public Dad getDad() {
		return dad;
	}

	public void setDad(Dad dad) {
		this.dad = dad;
	}
	
	@Override
	public void interest() {
		System.out.println("my mum likes to travel. so, ");
		dad.travel();
		
	}
	public void buy() {
		System.out.println("my mum buy me a paint brush");
	}


}
