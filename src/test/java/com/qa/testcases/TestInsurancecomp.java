package com.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.data.Stardataobj;
import com.qa.pages.LoginPage;
import com.qa.pages.ProfilePage;
import com.qa.pages.ProjHomePage;
import com.qa.pages.ReviewConfirmationPage;
 

public class TestInsurancecomp extends TestBase{
	LoginPage loginpage;
	ProjHomePage projhomepage;
	ProfilePage profilepage;
	ReviewConfirmationPage reviewconfirmpage;
	
//	Initiates all the TestBase methods and returns the Test Insurance Company page with the user logged into it:
//	- After navigating to http://wallethub.com/profile/test_insurance_company/
//	- Click on Login button on top right corner to navigate to the Login page
//	- User's email and password to be provided in config.properties file, which would be passed to Login method to authenticate
	@BeforeMethod
	public void Setup(){
		Initialization();
		driver.get(prop.getProperty("url")); 
		projhomepage = new ProjHomePage(driver);
		loginpage = projhomepage.ClickLoginbutton();
 		projhomepage = loginpage.Login(prop.getProperty("emailaddress"), prop.getProperty("password"));
		
	}
	
	
//	Below DataProvider prepares the data to be provided for testing Ratings of the users 
	@DataProvider 
	public Iterator<Stardataobj> AvailableRatings(){
		ArrayList<Stardataobj> AL = new ArrayList<Stardataobj>();
		AL.add(new Stardataobj("onestar",1));
		AL.add(new Stardataobj("twostars",2));
		AL.add(new Stardataobj("threestars",3));
		AL.add(new Stardataobj("fourstars",4));
		AL.add(new Stardataobj("fivestars",5));

		return AL.iterator();
	}
	
//	RatingstarsLitup method asserts if each of the 5 stars are highlighted/litup when mouse hovers over them
//	Test data is iterated over the object provided by Dataprovider
	@Test(dataProvider="AvailableRatings", priority=1)
	public void RatingstarsLitup(Stardataobj data){
		projhomepage.HoveroverReviewstars(Integer.parseInt(prop.getProperty(data.str)));
 		Assert.assertNotNull(driver.findElement(By.xpath("(//*[@id='reviews-section']/div[1]/div[3]/review-star/div//*[name()='svg']//*[name()='path' and @fill = 'none'])["+data.num+"]")));
	}
	
//	Write Review method allows the 
	@Test (priority=2)
	public void SubmitReview(){
		String policyDropdownValue = prop.getProperty("policydropdownval");
		String ReviewContent = prop.getProperty("reviewcontent");
		Integer Starstobeselected =  Integer.parseInt(prop.getProperty("fourstars"));
		projhomepage.clickonReviewStars(Starstobeselected);
		projhomepage.SelectPolicyDropdown(policyDropdownValue);
		reviewconfirmpage = projhomepage.SubmitReviewContect(ReviewContent);
		Assert.assertEquals(reviewconfirmpage.Resultmessage(), "Your review has been posted.");
		reviewconfirmpage.ClickonContinueBtn();
	}
	
//	Below test validates the review submitted by the user
//	- Navigates to the profile page of the user
//	- And checks if there is a review available for the Test Insurance Company 
	@Test (dependsOnMethods={"SubmitReview"})
	public void ProfileReviewchk(){
		profilepage = projhomepage.NavtoProfilepage();
//		Assert.assertNotNull(profilepage.Review());
		Assert.assertNotNull(profilepage.Review(), "REVIEW not found for Test Insurance Company");
		
	}
	
	@AfterMethod
	public void afterstate(){
		driver.quit();
	}
	
	

}
