package com.webuitest;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

import javax.naming.directory.DirContext;
import javax.swing.JScrollBar;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.JavascriptExecutor;

import com.google.common.io.Files;

public class imags {

	private static FirefoxDriver driver ;	
	
	public imags() {
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");	
		driver = new FirefoxDriver();
	}
	
	public static void main(String[] args) {
		
			
			
		
		driver.get("https://cn.bing.com/images/trending?form=Z9LH");
		
		test(driver);
		
		WebElement edtSearch = driver.findElement(By.id("sb_form_q"));
		edtSearch.sendKeys("猫");
		
		WebElement btnSearch = driver.findElement(By.id("sb_form_go"));
		btnSearch.click();
		
		List<WebElement> imgList = driver.findElements(By.cssSelector("ul.dgControl_list:nth-child(1)"));
		
//
		//通过JS来操作页面滚动条

		//使用scrollTop进行垂直方向滚动到最底部
		// 创建js对象
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.write(\"hello\")");
		        
		// 使用executeScript方法执行js语句
	//	driver.executeScript("document.evaluate(\"xpath_str\", document).iterateNext().scrollTop=1000");
		        
		/*
		 * document.evaluate是针对使用xpath定位的方法
		 * document.evaluate(\"xpath_str\", document).iterateNext():获取到滚动条元素位置，xpath内含有双引号记得转义
		* scrollTop：将垂直滚动条高度设置为1000，意思就是滚动到底部
		 */
		

	}
	
	public static void test(WebDriver webDriver) {
		
	}
}
