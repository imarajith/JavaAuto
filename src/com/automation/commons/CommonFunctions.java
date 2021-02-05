package com.automation.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {
	
	ChromeDriver driver;
        		
	public WebDriver getDriver() {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");  
    	this.driver = new ChromeDriver();
    	return driver;
    }
	
	public void getURL(String WebPage) {
		driver.manage().window().maximize();
		driver.get(WebPage);
		
	}
	
}
