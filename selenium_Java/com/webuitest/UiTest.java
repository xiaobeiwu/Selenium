package com.webuitest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * selenium+java+UI 页面元素定位与操作
 * @author 30371
 *
 */

public class UiTest {
	
	WebDriver driver;

	
	//启动火狐浏览器
	@BeforeMethod
	public void lanchDriver() {
		
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");	
		//启动浏览器
		driver=new FirefoxDriver();

	}
	

	//关闭浏览器
	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}
	
	
	/**
	 * 用例：打开“https://www.baidu.com/”，在搜索框，输入“taobao”，点击搜索，打印出新页面的标题；
	 *     然后在搜索框输入"qq"，点击搜索，打印新页面的标题
	 * 元素定位：通过元素id定位元素     
	 * @throws InterruptedException  
	 */
	// 使用priority指定执行顺序(默认值为0)，数值越小，越靠前执行	
	@Test(priority=0)
	public void testByid() throws InterruptedException {
		
		//打开页面
		driver.get("https://www.baidu.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("kw"));
		element.sendKeys("taobao");
		WebElement element2=driver.findElement(By.id("su"));
		element2.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		element.clear();		
		Thread.sleep(3000);
		
		//可以合并为一句
		driver.findElement(By.id("kw")).sendKeys("qq");	
		driver.findElement(By.id("su")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("qq_百度搜索")){
			System.out.println("testByid is pass！");
		} else{
			System.out.println("testByid is error！");
		}
		
		
			
	}
		

	/**
	 * 用例：打开“https://www.baidu.com/”，在搜索框输入"qq"，点击搜索，打印出新页面的标题
	 * 元素定位：通过元素CSS之属性选择器定位元素     
	 * @throws InterruptedException 
	 */
	@Test(priority=1)
	public void testCssAttribute() throws InterruptedException {
		
		//打开页面
		driver.get("https://www.baidu.com/");
		
		driver.findElement(By.id("kw")).sendKeys("qq");
		driver.findElement(By.cssSelector("input[id=\"su\"]")).click(); //cssSelector之属性选择器
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("qq_百度搜索")){
			System.out.println("testCssAttribute is pass！");
		} else{
			System.out.println("testCssAttribute is error！");
		}
		
	}
	
	
	//模拟鼠标悬停操作
	@Test(priority=2)
	public void mouseTest() throws InterruptedException {
		
		
		//打开页面
		driver.get("https://www.baidu.com/");
		//鼠标悬停
	    WebElement search_setting = driver.findElement(By.linkText("设置"));
	    Actions action = new Actions(driver);
	    action.moveToElement(search_setting).perform();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("搜索设置")).click();
	    
	    Thread.sleep(3000);
	    
	    WebElement textElement  = driver.findElement(By.xpath("//a[text()='保存设置']"));
	    String textString = textElement.getText();
	    System.out.println(textString);
	    
		if(textString.equals("保存设置")){
			System.out.println("mouseTest is pass！");
		} else{
			System.out.println("mouseTest is error！");
		}
		
	}
	
	//模拟键盘操作
	@Test
	public void keyboard() throws InterruptedException {

		driver.get("https://www.baidu.com/");
		WebElement inputElement = driver.findElement(By.id("kw"));
		
		//输入框输入内容
		inputElement.sendKeys("seleniumm");
		Thread.sleep(2000);
		
		//删除多输入的一个m
		inputElement.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		//输入空格键+“教程”
		inputElement.sendKeys(Keys.SPACE);
		inputElement.sendKeys("教程");
		Thread.sleep(2000);
		
		//ctrl+a 全选输入内容
		inputElement.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		
		//ctrl+X 剪贴输入框内容
		inputElement.sendKeys(Keys.CONTROL,"x");
		Thread.sleep(2000);
		
		//ctrl+v 粘贴内容到输入框
		inputElement.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		
		//通过回车键盘来代替点击输入
		inputElement.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equals("selenium教程_百度搜索")) {
			System.out.println("keyboard is pass！");
		} else {
			System.out.println("keyboard is pass！");
		}
		

	}
	
	
	//定位一组元素
	@Test
	public void elementsTest() throws InterruptedException {
		
		driver.get("https://www.baidu.com/");
		WebElement search_text = driver.findElement(By.id("kw"));
		search_text.sendKeys("selenium");
		search_text.submit();
		Thread.sleep(2000);
		
		//匹配第一页搜索结果的标题
		List<WebElement> search_result = driver.findElements(By.xpath("//div/div/h3"));
		//打印元素的个数
		System.out.println(search_result.size());
		
		//循环打印
		for (WebElement text : search_result) {
			System.out.println(text.getText());
			
		}
		
		
		System.out.println("------我是分割线-------");
		//打印第1个结果的标题（index默认从0开始）
		System.out.println(search_result.get(0).getText());
	}
		
	
	//多窗口切换
	@Test
	public void MoreWindows() throws InterruptedException {
		
		driver.get("https://www.baidu.com/");
		
		//获得当前窗口句柄
		String search_handle = driver.getWindowHandle();		
		System.out.println(search_handle);
		
		//打开百度注册窗口
		driver.findElement(By.linkText("登录")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("立即注册")).click();
		Thread.sleep(2000);
		
		//获得所有窗口的句柄
		Set<String> handles = driver.getWindowHandles();
		for (String hh : handles) {
			System.out.println(hh);
			
		}
		Thread.sleep(2000);
		//判断是否为注册窗口，并操作注册窗口上的元素
		for (String handle : handles) {
			if (handle.equals(search_handle)==false) {
				
				//切换到注册窗口
				driver.switchTo().window(handle);
				System.out.println("现在开始注册...");
				driver.findElement(By.name("userName")).clear();
				driver.findElement(By.name("userName")).sendKeys("wendy");
				driver.findElement(By.name("phone")).clear();
				driver.findElement(By.name("phone")).sendKeys("123456");
				
				Thread.sleep(2000);
				driver.close();
				
			}
			
		}
		
		
		
	}
	
	//iframe表单切换
	@Test
	public void iframeTest() throws InterruptedException {
		
		driver.get("https://www.126.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("switchAccountLogin")).click();
		Thread.sleep(2000);
		
		//通过xpath定位登录表单元素
		WebElement xf =driver.findElement(By.xpath("//*[@id='loginDiv']/iframe"));
		System.out.println("欢迎登录");
		//切换到登录表单
		driver.switchTo().frame(xf);
		Thread.sleep(2000);
		
		//在登录表单进行元素操作
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.name("email")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("111");
		
		driver.findElement(By.id("dologin")).click();
		driver.switchTo().defaultContent();
	}
	
	
	//下拉框测试
	@Test
	public void selectTest() throws InterruptedException {
		
		driver.get("https://www.baidu.com/");
		//鼠标悬停在“设置”上
		WebElement setting = driver.findElement(By.linkText("设置"));
		Actions actions = new Actions(driver);
		actions.moveToElement(setting).perform();
		Thread.sleep(2000);
		
		//点击“搜索设置”
		driver.findElement(By.linkText("搜索设置")).click();
		
		 //<select>标签的下拉框选择
		WebElement opElement = driver.findElement(By.xpath("//select[@id='nr']"));
		Select sel = new Select(opElement);
		sel.selectByVisibleText("每页显示50条");
		
		Thread.sleep(2000);
		
	}
	
	//警告框处理
	@Test
	public  void alertTest() {
		driver.get("https://www.baidu.com/");
		
		WebElement setElement = driver.findElement(By.linkText("设置"));
		Actions actions = new Actions(driver);
		actions.moveToElement(setElement).perform();
		
		driver.findElement(By.linkText("搜索设置")).click();
		driver.findElement(By.className("prefpanelgo")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		
	}
	
	//浏览器cookie操作
	@Test(enabled = false)
	public void cookieTest() {
		
		   driver.get("https://www.baidu.com");

		    Cookie c1 = new Cookie("name", "key-aaaaaaa");
		    Cookie c2 = new Cookie("value", "value-bbbbbb");
		    driver.manage().addCookie(c1);
		    driver.manage().addCookie(c2);

		    //获得 cookie
		    Set<Cookie> coo = driver.manage().getCookies();
		    System.out.println(coo);

		    //删除所有 cookie
		    //driver.manage().deleteAllCookies();
		
	}
	
}
