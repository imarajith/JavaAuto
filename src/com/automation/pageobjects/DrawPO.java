package com.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrawPO {
	@FindBy(xpath="//input[@title='Draw a line']")
	private WebElement line_xpath;
	
	@FindBy(xpath="//canvas[@id='imageTemp']")
	private WebElement canvas_xpath;
	
	WebDriver driver;
    WebDriverWait wait; 
	
	public DrawPO(WebDriver driver) {
		this.driver = driver; 
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
	}
	
	public void clickLine() {
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		this.wait.until(ExpectedConditions.elementToBeClickable(line_xpath));
		line_xpath.click();
	}
	
	public void drawLine() {
		Actions builder = new Actions(driver);
		builder.moveToElement(canvas_xpath, 135, 90).click().moveByOffset(0, 90).click().release().perform();
		builder.moveToElement(canvas_xpath, 90, 135).click().moveByOffset(90, 0).click().release().perform();
	}
	
	
}
