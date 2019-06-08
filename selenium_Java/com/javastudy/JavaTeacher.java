package com.javastudy;

public class JavaTeacher extends TeacherDemo {
    
	public JavaTeacher(String name,String school){
        super(name,school);
    }

    public void teaching(){
        System.out.println(super.toString());
        super.teaching();
        System.out.println("2、Java 编程");
    }

}
