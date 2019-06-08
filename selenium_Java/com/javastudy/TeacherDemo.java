package com.javastudy;

public class TeacherDemo implements IAbility{
    
	private String name;
    private String school;
    public  TeacherDemo(String name,String school){
        this.name=name;
        this.school=school;
    }
    public String toString(){
        return "老师信息：姓名="+name+",学校="+school;
    }
    public void teaching(){
        System.out.println("教学工作：");
        System.out.println("课件准备");
    }
    
	@Override
	public void eat() {
		System.out.println("需要吃饭");
		
	}
	@Override
	public void study() {

		System.out.println("需要学习");
		
	}
	
	
	
}
