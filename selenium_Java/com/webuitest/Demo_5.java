package com.webuitest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.get("file:///E:/%E5%89%8D%E7%AB%AF%E5%BC%80%E5%8F%91%E8%AF%AD%E8%A8%80/window%20-%20%E5%89%AF%E6%9C%AC.html");
		
		WebElement btnElement = driver.findElement(By.id("main"));
		btnElement.click();
		
		//切换到弹出框
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		System.out.println("弹出框信息："+alertMsg);
		alert.accept();
		
//		alert.dismiss();
		
//		driver.quit();

	}

}
