package com;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.*;
import pagesObjects.*;

public class Case1Test extends TestBase {	
	
	Actions SeleniumActions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	@Test
	public void loginFirstPage(){
		HomePageObjects homePageObjects = new HomePageObjects();
	
		homePageObjects.emailForm(driver).click();
		homePageObjects.emailForm(driver).sendKeys("admin@gmail.com");
		homePageObjects.enterButton(driver).click();		
	}
	
	@Test
	public void completeSecondPage() throws InterruptedException {	
		
		Thread.sleep(5000);
		
		SecondPageObjects secondPageObjects = new SecondPageObjects();

		
//		secondPageObjects.firstName(driver).click();
//		secondPageObjects.firstName(driver).sendKeys("Faculdade");
//		
//		secondPageObjects.lastName(driver).click();
//		secondPageObjects.lastName(driver).sendKeys("Fadergs");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		secondPageObjects.adressForm(driver).click();
		secondPageObjects.adressForm(driver).sendKeys("R. Riachuelo, 1257");
		
		}

}
