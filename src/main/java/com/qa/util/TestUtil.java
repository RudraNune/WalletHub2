package com.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class TestUtil {
	
	public void NgElements(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		NgWebDriver ng = new NgWebDriver(js);
		driver.findElement(ByAngular.model("model"));
	}

}
