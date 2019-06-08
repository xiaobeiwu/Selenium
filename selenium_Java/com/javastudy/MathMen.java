package com.javastudy;

public class MathMen {
	
	private int x;
	
	private int y;
	
	public MathMen() {
		
	}
	
	public MathMen(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int addSome() {
		return x + y;
	}
	
	public int multy() {
		return x * y;
	}
	
	public void changeX(int x) {
		this.x = x;
	}
	
	public void changeY(int y) {
		this.y = y;
	}
	
	public Object check() {
		return null;
	}
}
