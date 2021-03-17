package com;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesObjects.*;

public class Case1Test2 {

	//Using mvn WebDriverManager
	
	GooglePageObjects homePageObjects = new GooglePageObjects();
	private static final String KEY_SEARCH = "Bitfrost Tecnologia";

	public void sleep(int timer) {
		try {
			Thread.sleep(timer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	@Test
	public void findAndClose() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        
		driver.get("https://www.google.com.br");
		driver.manage().window().maximize();
		
		try {
		homePageObjects.searchForm(driver).click();
		homePageObjects.searchForm(driver).sendKeys(KEY_SEARCH);
		homePageObjects.searchForm(driver).sendKeys(Keys.ENTER);		
		} catch (Exception e) {
			// TODO: handle exception
		}
		sleep(2000);
		
		try {
			homePageObjects.searchByBitfrost(driver).click();
			System.out.println("Spell link exist");
		} catch (Exception e) {
			// TODO: handle exception
			TestSequenceExecution.ERROR_COUNT++;
		}
		sleep(4000);
		
		try {
			homePageObjects.searchBitfrostGooglePage(driver).click();
			System.out.println("Bitfrost Google Page link exist");
		} catch (Exception e) {
			// TODO: handle exception
			TestSequenceExecution.ERROR_COUNT++;
		}		
		sleep(2000);
		
		try {
			homePageObjects.searchBitfrostPage(driver).click();
			System.out.println("Bitfrost Page link exist");
		} catch (Exception e) {
			// TODO: handle exception
			TestSequenceExecution.ERROR_COUNT++;
		}	
		System.out.println("The total of errors is: " + TestSequenceExecution.ERROR_COUNT + "\n");
		sleep(2000);
		
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
