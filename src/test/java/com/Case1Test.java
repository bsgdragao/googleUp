package com;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.*;
import pagesObjects.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Case1Test extends TestBase {	
	
	Actions SeleniumActions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	HomePageObjects homePageObjects = new HomePageObjects();
	SecondPageObjects secondPageObjects = new SecondPageObjects();
	
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
		homePageObjects.emailForm(driver).click();
		homePageObjects.emailForm(driver).sendKeys("admin@gmail.com");
		homePageObjects.enterButton(driver).click();	
	
	}
	
		
	@Test
	public void teste2() {	
		secondPageObjects.firstName(driver).click();
		secondPageObjects.firstName(driver).sendKeys("Faculdade");
		
		sleep();
		
		secondPageObjects.lastName(driver).click();
		secondPageObjects.lastName(driver).sendKeys("Fadergs");
		
		secondPageObjects.adressForm(driver).click();
		secondPageObjects.adressForm(driver).sendKeys("R. Riachuelo, 1257");
		
		secondPageObjects.emailAdressForm(driver).click();
		secondPageObjects.emailAdressForm(driver).sendKeys("admin@fadergs.edu.br");
		
		secondPageObjects.phoneForm(driver).click();
		secondPageObjects.phoneForm(driver).sendKeys("0007678678");
		
		}
	
	@Test
	public void teste3() {		
		secondPageObjects.radioButtonFemale(driver).click();	
		
		secondPageObjects.radioButtonMovies(driver).click();
	}
	
	@Test
	public void teste4() {
		secondPageObjects.languageForm(driver).click();
		secondPageObjects.languageForm(driver).click();
		
		secondPageObjects.languageFormOpt(driver).click();
//		Select language = new Select(secondPageObjects.languageForm(driver));
//		language.selectByValue("Portuguese");
		

	}
	
	@Test
	public void teste5() {
		Select skills = new Select(secondPageObjects.dropDownSkills(driver));
		skills.selectByVisibleText("Java");		
		
		Select country = new Select(secondPageObjects.dropDownCountry(driver));
		country.selectByVisibleText("Brazil");				
	}
	
	@Test
	public void teste6() {
		secondPageObjects.dropDownSelectCountry(driver).click();
		secondPageObjects.dropDownSelectCountryForm(driver).click();
		secondPageObjects.dropDownSelectCountryForm(driver).sendKeys("Japan");
		secondPageObjects.dropDownSelectCountryForm(driver).sendKeys(Keys.ENTER);		
	}
	
	@Test
	public void teste7() {
		Select year = new Select(secondPageObjects.dropDownYearBox(driver));
		year.selectByVisibleText("1986");	
		
		Select month = new Select(secondPageObjects.dropDownMonthBox(driver));
		month.selectByVisibleText("June");	
		
		Select day = new Select(secondPageObjects.dropDownDayBox(driver));
		day.selectByVisibleText("4");	
		
	}
	
	@Test
	public void teste8() {	
		secondPageObjects.firstPasswordForm(driver).click();
		secondPageObjects.firstPasswordForm(driver).sendKeys("C84jcjDVpcH@w7E");
		
		secondPageObjects.secondPasswordForm(driver).click();
		secondPageObjects.secondPasswordForm(driver).sendKeys("C84jcjDVpcH@w7E");

		secondPageObjects.submitButton(driver).click();
		}
	
}
