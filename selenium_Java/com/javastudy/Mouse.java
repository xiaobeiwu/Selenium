package com.javastudy;

import org.omg.CORBA.PUBLIC_MEMBER;

import bsh.This;

public class Mouse {
	
	private static String mouses = "0000000000";
	
	/**
	 * 
	 * @param doNotDrink
	 */
	public static void mouseDrink(int doNotDrink) {
		StringBuffer sBuffer = new StringBuffer();
		while (doNotDrink > 1) {
			sBuffer.append(doNotDrink%2);
			doNotDrink = doNotDrink/2;
		}
		sBuffer.append(doNotDrink%2);
		while (sBuffer.length() < 10) {
			sBuffer.append("0");
		}
		System.out.println(sBuffer.reverse().toString());
		
		
		for (int i = 1; i <= 1000; i++) {
			
		}
		
	}
	
	public static void main(String[] args) {
		mouseDrink(666);
	}
}
