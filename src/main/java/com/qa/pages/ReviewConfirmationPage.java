package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.base.TestBase;

public class ReviewConfirmationPage extends TestBase{
	
	public ReviewConfirmationPage(WebDriver driver){
		this.driver = driver;
	}
//	Returns the message displayed on the review confirmation page after submitting the Review 
	public String Resultmessage(){
		String displayedmessage = driver.findElement(By.xpath("//div[@class='rvc-header']/h4")).getText();
		return displayedmessage;
	}
	
//	Allows user to click on Continue button on review confirmation page
	public ProjHomePage ClickonContinueBtn(){
		driver.findElement(By.xpath("//*[@class='btn rvc-continue-btn']")).click();
		return new ProjHomePage(driver);
	}

}
