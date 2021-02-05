package com.automation.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {
	
	ChromeDriver driver;
        		
	public WebDriver getDriver() {
    	System.setProperty("webdriver.chrome.verboseLogging", "true");

    	this.driver = new ChromeDriver();
    	return driver;
    }
	
	public void getURL(String WebPage) {
		driver.manage().window().maximize();
		driver.get(WebPage);
		
	}
	
}
