package com.webuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestngTest {

	
	 private WebDriver driver;
	 
	 @BeforeClass
	 public void init() {
		  System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		  driver = new FirefoxDriver();
	 }

	  @Test
	  public void TestNgLearn() {
		  driver.get("https://www.qq.com/");
		  String title = driver.getTitle();
		  System.out.println("页面标题:"+title);
	
		  WebElement firstNews = driver.findElement(By.cssSelector("#tab-news-01 > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
		  String news = firstNews.getText();
		  System.out.println("第一条新闻是:"+news);
	
		  WebElement searchEdt = driver.findElement(By.id("sougouTxt"));
		  searchEdt.sendKeys("早教");
	
		  WebElement searchBnt = driver.findElement(By.id("searchBtn"));
		  searchBnt.click();
		  System.out.println("搜索结果页面标题："+searchBnt.getText());
	    }
	 
	   @AfterClass
	     public void afterClass() {
		   try {
			Thread.sleep(5*1000);
			   driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     }

}
