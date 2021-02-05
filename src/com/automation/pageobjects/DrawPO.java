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
	
	@FindBy(xpath="//input[@title='Draw a rectangle']")
	private WebElement rectangle_xpath;
	
	@FindBy(xpath="//input[@title='Use eraser']")
	private WebElement eraser_xpath;
	
	@FindBy(xpath="//canvas[@id='imageTemp']")
	private WebElement canvas_xpath;

	WebDriver driver;
    WebDriverWait wait;
    Actions builder;
	
	public DrawPO(WebDriver driver) {
		this.driver = driver; 
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
	}
	
	public void clickLine() {
		this.wait.until(ExpectedConditions.elementToBeClickable(line_xpath));
		line_xpath.click();
	}
	
	public void drawPlus() {
		builder = new Actions(driver);
		builder.moveToElement(canvas_xpath, 55, -45).click().moveByOffset(0, 90).click().release().perform();
		builder.moveToElement(canvas_xpath, 120, 30).dragAndDropBy(canvas_xpath, 120, 0).release().click().perform();
	}
	
	public void clickRectangle() {
		this.wait.until(ExpectedConditions.elementToBeClickable(rectangle_xpath));
		rectangle_xpath.click();
	}
	
	public void drawRectangle() {
		builder = new Actions(driver);
		builder.moveToElement(canvas_xpath, -10, 90).click().moveByOffset(145, 90).click().release().perform();
	}
	
	public void clickEraser() {
		this.wait.until(ExpectedConditions.elementToBeClickable(eraser_xpath));
		eraser_xpath.click();
	}
	
	public void eraser() {
		builder = new Actions(driver);
		builder.moveToElement(canvas_xpath, 120, 30).dragAndDropBy(canvas_xpath, 120, 0).click().perform();
	}
}
