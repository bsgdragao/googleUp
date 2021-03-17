package com;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.*;
import pagesObjects.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Case1Test extends TestBase {	

	//Using local ChromeWebdriver app
	Actions SeleniumActions = new Actions(driver);
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 15);
	GooglePageObjects homePageObjects = new GooglePageObjects();
	
	private static final String KEY_SEARCH = "Bitfrost Tecnologia";
	
	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void teste1(){	
		
		homePageObjects.searchForm(driver).click();
		homePageObjects.searchForm(driver).sendKeys(KEY_SEARCH);
		homePageObjects.searchForm(driver).sendKeys(Keys.ENTER);	
		sleep();
		homePageObjects.searchByBitfrost(driver).click();
		sleep();
	}
	

		

}
