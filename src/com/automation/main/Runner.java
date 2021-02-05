package com.automation.main;

import org.openqa.selenium.WebDriver;

import com.automation.commons.CommonFunctions;
import com.automation.pageobjects.DrawPO;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonFunctions cf=new CommonFunctions();
		WebDriver driver=cf.getDriver();
		cf.getURL("http://www.htmlcanvasstudio.com/");
		DrawPO draw = new DrawPO(driver);
		draw.clickLine();
		draw.drawPlus();
		draw.clickRectangle();
		draw.drawRectangle();
		draw.clickEraser();
		draw.eraser();
	}

}
