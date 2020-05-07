package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	public Properties prop;

	// TestBase constructor loads the properties file
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\properties\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Initializes the driver instance and sets the required properties for
	// browser
	public void Initialization() {
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("code supports only Chrome Browser");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
