package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class ProfilePage extends TestBase{
	
	public ProfilePage(WebDriver driver){
		this.driver = driver;
	}
	
//	Below method returns a WebElement 
	public WebElement Review(){
		WebElement recommendation = null;
		try {
			recommendation = driver.findElement(By.xpath("//*[@class='pr-ct-box pr-rec']//a[text()='Test Insurance Company']"));
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return null;
		}
		return recommendation;
	}

}
