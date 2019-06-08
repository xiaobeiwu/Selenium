package com.testjavastudy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.javastudy.JavaTeacher;

public class teacherTest {
	
	public JavaTeacher JavaTea;
	
	@BeforeMethod
	public void init(){
		System.out.println("----老师信息-----");
	    JavaTea=new JavaTeacher("Jack","高新");
	}
	
    @Test
    public void doing (){
	    JavaTea.teaching();
	    JavaTea.eat();
	    JavaTea.study();
	    
    }
}

