package com.webuitest;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wangyi {

	public static void main(String[] args) throws InterruptedException {
		
		//在火狐浏览器搜索网易新闻的第一条要闻
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		WebDriver driver = new FirefoxDriver();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.163.com/");
		
		WebElement newsElement=driver.findElement(By.cssSelector(".news_default_yw > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
		String firstnew = newsElement.getText();
		System.out.println("第一条新闻是："+firstnew);
		newsElement.click();
		
//		Thread.sleep(5*1000);
	
		//切换窗口
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> tabs =new ArrayList<>(handles);
		for(String title:tabs) {
			System.out.println(" ----title----:" + title);
		}
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("新窗口标题："+driver.getTitle());
		WebElement titleOnNewPage = driver.findElement(By.cssSelector("#epContentLeft > h1:nth-child(1)"));
		System.out.println("新页面新闻标题："+titleOnNewPage.getText());
		
		System.out.println("aaaaaaa");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("end");

		
	}

}