package com.webuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class input_radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.get("file:///E:/%E5%89%8D%E7%AB%AF%E5%BC%80%E5%8F%91%E8%AF%AD%E8%A8%80/testngjava.html");
		
		WebElement radio1=driver.findElement(By.id("rd-1"));
		System.out.println("radio1 is selected:"+radio1.isSelected());	
		
		WebElement radio2=driver.findElement(By.id("rd-2"));
		radio2.click();
		System.out.println("radio2 is selected:"+radio2.isSelected());
		System.out.println("radio1 is selected:"+radio1.isSelected());	
		
		WebElement checkBox1 =driver.findElement(By.id("cb-1"));
		checkBox1.click();
		System.out.println("checkbox1 is selected:"+checkBox1.isSelected());
		
		WebElement checkBox2 =driver.findElement(By.id("cb-2"));
		checkBox2.click();		
		System.out.println("checkbox1 is selected:"+checkBox1.isSelected());
		System.out.println("checkbox2 is selected:"+checkBox2.isSelected());	
		

	}

}
