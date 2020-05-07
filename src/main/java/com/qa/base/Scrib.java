package com.qa.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrib {
	
	public static void main(String[] args){
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\java\\com\\qa\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("http://wallethub.com/profile/test_insurance_company/"); 	
//		driver.findElement(By.xpath("//*[@id='web-app']/header//span[text()='Login']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("rudru.nune@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456!Wal");
//		driver.findElement(By.xpath("//*[@id='join-login']/form/div[4]/button[2]")).click();
//
//		Actions ac = new Actions(driver);
//		WebElement starelement = driver.findElement(By.xpath(".//div[@class='brgm-button brgm-user brgm-list-box']/span"));
//		ac.moveToElement(starelement) 
//							
//							.build()
//							.perform();
//		
//		driver.findElement(By.xpath(".//div[@class='brgm-list brgm-user-list']//*[text()='Profile']")).click();
//		 
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("onestar", 1);
		hm.put("twostar", 2);
		hm.put("threestar", 3);
		Set<Entry<String, Integer>> sp = hm.entrySet();
	 
		
//		ac.moveToElement(starelement).moveByOffset(50, 0)
//		.click()
//		.build()
//		.perform();
//		
//		driver.findElement(By.className("wrev-drp")).click();
//		driver.findElement(By.xpath(".//*[@class='dropdown-list ng-enter-element']//li[text()='Health Insurance']")).click();
//		driver.findElement(By.xpath("//div[@class='android']/textarea")).sendKeys("Sam");
 
//				
		
		
	}

}
