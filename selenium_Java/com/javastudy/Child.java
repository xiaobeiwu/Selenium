package com.javastudy;

public class Child extends Person implements Female{

	private Dad dad;
	
	private Mum mum;
	
	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
   
	public String toString() {
		return "I'm "+name+ ",and "+age+" years old.i'm a clever "+SEX+" kid";
	}
	
	public void info() {
		dad.info();
		mum.info();
		System.out.println(toString());
		
	}
	
	public void interet() {
		System.out.println("Our interests:");		
		System.out.print("I like to eat delicious food.so ");
		mum.feed();
		
	}

	public Dad getDad() {
		return dad;
	}

	public void setDad(Dad dad) {
		this.dad = dad;
	}

	public Mum getMum() {
		return mum;
	}

	public void setMum(Mum mum) {
		this.mum = mum;
	}


	@Override
	public void interest() {
		System.out.println("I like to paint");
		mum.buy();
		
	}

	@Override
	public void work() {
		dad.work();
		mum.work();
		System.out.println("my work is healthy growth");
	}
	
	public void wash() {

		System.out.println("My clothes are dirty.");
		dad.clean();
	}



	
}
