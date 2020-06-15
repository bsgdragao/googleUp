package com;

import static org.junit.Assert.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pagesObjects.HomePageObjects;
import pagesObjects.SecondPageObjects;
import pagesObjects.ThirdPageObjects;
import utils.TestBase;

@SuppressWarnings("unused")
public class case3 extends TestBase	 { 
	
	
	Actions SeleniumActions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	HomePageObjects homePageObjects = new HomePageObjects();
	SecondPageObjects secondPageObjects = new SecondPageObjects();
	ThirdPageObjects thirdPageObjects = new ThirdPageObjects();
	
	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testeA(){	
		homePageObjects.emailForm(driver).click();
		homePageObjects.emailForm(driver).sendKeys("admind03@gmail.com");
		homePageObjects.enterButton(driver).click();	
	
	}
	
		
	@Test
	public void testeB() {	
		secondPageObjects.firstName(driver).click();
		secondPageObjects.firstName(driver).sendKeys("Faculdade");
		
		sleep();
		
		secondPageObjects.lastName(driver).click();
		secondPageObjects.lastName(driver).sendKeys("Fadergs");
		
		secondPageObjects.adressForm(driver).click();
		secondPageObjects.adressForm(driver).sendKeys("R. Riachuelo, 1257");
		
		secondPageObjects.emailAdressForm(driver).click();
		secondPageObjects.emailAdressForm(driver).sendKeys("admind34@fadergs.edu.br");
		
		secondPageObjects.phoneForm(driver).click();
		secondPageObjects.phoneForm(driver).sendKeys("2323232332");
		
		}
	
	@Test
	public void testeC() {		
		secondPageObjects.radioButtonFemale(driver).click();	
		
		secondPageObjects.radioButtonMovies(driver).click();
	}
	
	@Test
	public void testeD() {
		secondPageObjects.languageForm(driver).click();
		secondPageObjects.languageForm(driver).click();
		
		secondPageObjects.languageFormOpt(driver).click();
//		Select language = new Select(secondPageObjects.languageForm(driver));
//		language.selectByValue("Portuguese");
		

	}
	
	@Test
	public void testeE() {
		Select skills = new Select(secondPageObjects.dropDownSkills(driver));
		skills.selectByVisibleText("Java");		
		
		Select country = new Select(secondPageObjects.dropDownCountry(driver));
		country.selectByVisibleText("Brazil");				
	}
	
	@Test
	public void testeF() {
		secondPageObjects.dropDownSelectCountry(driver).click();
		secondPageObjects.dropDownSelectCountryForm(driver).click();
		secondPageObjects.dropDownSelectCountryForm(driver).sendKeys("Japan");
		secondPageObjects.dropDownSelectCountryForm(driver).sendKeys(Keys.ENTER);		
	}
	
	@Test
	public void testeG() {
		Select year = new Select(secondPageObjects.dropDownYearBox(driver));
		year.selectByVisibleText("1986");	
		
		Select month = new Select(secondPageObjects.dropDownMonthBox(driver));
		month.selectByVisibleText("June");	
		
		Select day = new Select(secondPageObjects.dropDownDayBox(driver));
		day.selectByVisibleText("4");	
		
	}
	
	@Test
	public void testeH() {	
		secondPageObjects.firstPasswordForm(driver).click();
		secondPageObjects.firstPasswordForm(driver).sendKeys("C84jcjDVpcH@w7E");
		
		secondPageObjects.secondPasswordForm(driver).click();
		secondPageObjects.secondPasswordForm(driver).sendKeys("C84jcjDVpcH@w7E");

		secondPageObjects.submitButton(driver).click();
		}

	
	@Test
	public void testeI() {
		thirdPageObjects.linkWebTable(driver).click();

	}
	
	@Test
	public void testeJ() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		thirdPageObjects.actionGrid(driver).click();
		SeleniumActions.contextClick(thirdPageObjects.actionGrid(driver)).perform();

	}
	 
	@Test
	public void testeK() throws  InterruptedException,AWTException {	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testeL() throws InterruptedException, AWTException {
		boolean boolAlert = false;
	    try {
	    	
	        WebDriverWait tempWait = new WebDriverWait(this.driver, 30);
	        tempWait.until(ExpectedConditions.alertIsPresent());
	        
	        int attempts = 0;
	        while (!boolAlert && attempts < 1000) {
	            attempts++;
	            driver.switchTo().alert().accept();
	            System.out.println("Sucesso ao clicar 'Ok' e 'Fechar o popup'");
	            boolAlert = true;
	        }
	    } catch (org.openqa.selenium.UnhandledAlertException e) {
	        driver.switchTo().alert().accept();
	        boolAlert = true;
	        System.out.println("Sucesso ao clicar 'Ok' e 'Fechar o popup'");
	    } catch (Exception e) {
	        System.out.println("Erro ao clicar 'Ok' e 'Fechar o popup'', Exception: " + e.getMessage());
	        Assert.fail("Metodo falhou: Erro ao clicar");
	    }
		
//		driver.findElement(By.xpath("//span[@class='rwInnerSpan' and text()='OK']"));
	
//		Alert alert=driver.switchTo().alert();;
//		        String alertText = alert.getText();
//		        System.out.println("Alert data: " + alertText);
//		        alert.accept();
//		    	driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/div[1]/ul[1]/li[1]/button[1]"));        
				
//		Robot robot = new Robot();		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
//		Alert alert = driver.switchTo().alert();
//		Assert.assertEquals("Delete the record permanently", alert.getText());
//		alert.accept();
//		robot.keyPress(KeyEvent.VK_ENTER);	
		
		
		
//		Robot robot = new Robot();
//		    wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//			robot.keyPress(KeyEvent.VK_ENTER);            
//            robot.keyPress(KeyEvent.VK_RIGHT);
//            robot.keyPress(KeyEvent.VK_LEFT);
//     		robot.keyPress(KeyEvent.VK_ENTER);
//    		robot.keyPress(KeyEvent.VK_ENTER);
//    		SeleniumActions.sendKeys(Keys.ENTER);
    		

      

   


		
	}
	
	

	
	
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		driver.quit();
//	}

}


