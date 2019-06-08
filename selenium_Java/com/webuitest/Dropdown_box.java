package com.webuitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://ww.hao123.com/edu");
		
		WebElement selectElement =driver.findElement(By.id("score-college"));
		Select selectObject = new Select(selectElement);
		
		Thread.sleep(3*1000);
		List<WebElement> allSelectOptions = selectObject.getAllSelectedOptions();
		for(WebElement e:allSelectOptions) {
			System.out.println(e.getText());
		}
		
		selectObject.selectByValue("清华大学");
		selectObject.selectByValue("清华大学");
		
		Thread.sleep(3*1000);
		allSelectOptions = selectObject.getAllSelectedOptions();
		for(WebElement e:allSelectOptions) {
			System.out.println(e.getText());
		}
		
		selectObject.selectByVisibleText("北京邮电大学");
		
		Thread.sleep(3*1000);
		allSelectOptions = selectObject.getAllSelectedOptions();
		for(WebElement e:allSelectOptions) {
			System.out.println(e.getText());
		}

	}

}
