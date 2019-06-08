package com.webuitest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/*
	1、打开火狐浏览器； 2、在浏览器输入网址：https://www.qq.com/，输出页面标题；3、在搜索框输入“早教”，点击查询；等待五秒，关闭浏览器
 */


public class Demo_1 {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
//		FirefoxDriver driver=new FirefoxDriver();
		
//		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "C:\\Users\\30371\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//		WebDriver chromeDriver = new ChromeDriver();

		
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
		
	//	Thread.sleep(5*1000);
	   
//		driver.quit();
		
		


	}
	

}
