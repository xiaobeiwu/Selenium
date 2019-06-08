package com.webuitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
1、打开谷歌浏览器； 2、在浏览器输入网址：https://cn.bing.com/，输出页面标题；3、在搜索框输入“海贼王”，点击查询；等待五秒，输出此时搜索页面的标题
4、点击返回导航，等待五秒，输出此时返回页面的标题5、点击前进导航，等待五秒，输出此时前进页面的标题；6、刷新此时的页面，等待五秒，关闭浏览器。
*/
public class search {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();


//		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		WebDriver driver = new FirefoxDriver();

		Thread.sleep(5 * 1000);
		driver.get("https://cn.bing.com/");
		System.out.println("首页面标题是："+driver.getTitle());
		
		WebElement element = driver.findElement(By.id("sb_form_q"));
		element.sendKeys("海贼王");
		
		WebElement goElement = driver.findElement(By.id("sb_form_go"));
		goElement.click();
		Thread.sleep(5 * 1000);
		System.out.println("搜索页面标题是："+driver.getTitle());
		
		driver.navigate().back();		//页面返回导航
		Thread.sleep(5 * 1000);
		System.out.println("返回页面标题是："+driver.getTitle());
		
		driver.navigate().forward();    //页面前进导航
		Thread.sleep(5 * 1000);		
		System.out.println("前进页面标题是："+driver.getTitle());
		
		driver.navigate().refresh();   //页面导航刷新功能
		
		Thread.sleep(5 * 1000);	
		
		driver.quit();
		
	}
}
