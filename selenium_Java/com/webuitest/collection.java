package com.webuitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class collection {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://www.qq.com/");
		
		WebElement headlines = driver.findElement(By.id("tab-news-01"));
		List<WebElement> news = headlines.findElements(By.cssSelector("ul:nth-child(2)>li>a"));
		for (WebElement e : news) {
			System.out.println(e.getText()+"URL:"+e.getAttribute("href"));
			
		}

	}

}

