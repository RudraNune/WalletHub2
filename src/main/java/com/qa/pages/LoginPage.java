package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	WebElement Loginbtn;
	WebElement emailaddress;
	WebElement password;

	// Below constructor initiates the webelements on the Login page
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		Loginbtn = driver.findElement(By.xpath("//*[@id='join-login']/form/div[4]/button[2]"));
		emailaddress = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	}

	// Login Method takes arguments as email address and password of the user to
	// Login
	// And returns the object of insurance company page to be reviewed
	public ProjHomePage Login(String email, String pass) {
		emailaddress.sendKeys(email);
		password.sendKeys(pass);
		Loginbtn.click();
		return new ProjHomePage(driver);

	}

}
