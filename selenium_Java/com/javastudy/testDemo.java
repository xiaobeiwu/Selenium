package com.javastudy;

public class testDemo {

	public static void main(String[] args) {
		
		//实例化一个对象
		//什么样的引用指向什么样的对象
		//实例或对象是一个意思
		
		//学生类实例化
		System.out.println("----学生信息-----");
		StudentDemo stu =new StudentDemo();
		stu.sno=01;
		stu.sname="Zona";
		stu.sage=2;
		stu.smajor="English";
		stu.sscore=99.8;
		stu.studentInfor();
		stu.attendClass(stu.smajor);
		stu.exam(stu.sscore);
		
		//实例化一个JavaTeacher
		System.out.println("----老师信息-----");
        JavaTeacher JavaTea=new JavaTeacher("Jack","高新");
        JavaTea.teaching();
        JavaTea.eat();
        JavaTea.study();
        
        

	}

}
