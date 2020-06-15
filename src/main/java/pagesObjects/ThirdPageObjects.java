package pagesObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestBase;

public class ThirdPageObjects extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver, 15);

		public WebElement linkWebTable(WebDriver driver) {
			String xPath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a";
			return driver.findElement(By.xpath(xPath));
		}
//		
//		public WebElement actionGrid(WebDriver driver) {
//			String xPath = "//*[@id=\"1592173206606-0-uiGrid-000B-cell\"]/user-click-select/div[1]";
//			return driver.findElement(By.xpath(xPath));
//		}
		
		public WebElement actionGrid(WebDriver driver) {
			String linkT = "http://demo.automationtesting.in/angcontroller.js";
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/del-click[1]/button[1]")));
		}
		
//		public WebElement actionGrid(WebDriver driver) {
//			String id = "1592171703789-uiGrid-000B-header-text";
//			return driver.findElement(By.id(id));
//		}
//				
}