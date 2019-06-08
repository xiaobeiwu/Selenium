package com.webuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class upLoad {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver(); 		
		
		driver.get("http://image.baidu.com/");
	
		
		
		WebElement btncamera = driver.findElement(By.cssSelector(".st_camera_off"));
		
		btncamera.click();
		
		WebElement btnAddfile = driver.findElement(By.id("stfile"));
		
		btnAddfile.sendKeys("C:\\Users\\Public\\Pictures\\123.jpg");
		

	}
	

}
