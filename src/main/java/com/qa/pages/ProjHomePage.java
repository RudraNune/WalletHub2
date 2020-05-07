package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.TestBase;

public class ProjHomePage extends TestBase {

	WebElement Loginbtnb;
	LoginPage loginpage;
	
	public ProjHomePage(WebDriver driver){
		this.driver = driver;
	}

	public LoginPage ClickLoginbutton() {
		Loginbtnb = driver.findElement(By.xpath("//*[@id='web-app']/header//span[text()='Login']"));
		Loginbtnb.click();
		return new LoginPage(driver);
	}

	public void HoveroverReviewstars(Integer starnum) {
		Actions ac = new Actions(driver);
		WebElement starelement = driver
				.findElement(By.xpath("//*[@id='reviews-section']/div[1]/div[3]/review-star/div"));
		ac.moveToElement(starelement).moveByOffset(starnum, 0).build().perform();

	}

	public void clickonReviewStars(Integer starnum) {
		Actions ac = new Actions(driver);
		WebElement starelement = driver
				.findElement(By.xpath("//*[@id='reviews-section']/div[1]/div[3]/review-star/div"));
		ac.moveToElement(starelement).moveByOffset(starnum, 0).click().build().perform();
	}

	public void SelectPolicyDropdown(String valuetobeselected) {
		driver.findElement(By.className("wrev-drp")).click();
		driver.findElement(
				By.xpath(".//*[@class='dropdown-list ng-enter-element']//li[text()='" + valuetobeselected + "']"))
				.click();
	}

	public ReviewConfirmationPage SubmitReviewContect(String content) {
		driver.findElement(By.xpath("//div[@class='android']/textarea")).sendKeys(content);
		driver.findElement(By.xpath("//sub-navigation//*[text()='Submit']"));
		return new ReviewConfirmationPage(driver);
	}

	public ProfilePage NavtoProfilepage() {

		WebElement Hoveronelement = driver
				.findElement(By.xpath(".//div[@class='brgm-button brgm-user brgm-list-box']/span"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Hoveronelement).build().perform();
		driver.findElement(By.xpath(".//div[@class='brgm-list brgm-user-list']//*[text()='Profile']")).click();
		return new ProfilePage(driver);
	}

}
