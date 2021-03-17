package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageObjects {
	
	public WebElement searchForm(WebDriver driver) {
		String id = "q";
		return driver.findElement(By.name(id));
	}	
	
	public WebElement searchByBitfrost(WebDriver driver) {
			String xPath =	"/html/body/div[7]/div/div[9]/div[1]/div/div[1]/div[2]/p/a[2]";
		return driver.findElement(By.xpath(xPath));
	}	
		
	public WebElement searchBitfrostGooglePage(WebDriver driver) {
			String xPath = "/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[4]/div[1]/div/div/a[1]/div/div";
			return driver.findElement(By.xpath(xPath));
	}	
	
	public WebElement searchBitfrostPage(WebDriver driver) {
			String xPath = "/html/body/div[6]/div/div[8]/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[4]/div[1]/div/div[2]/div/a[2]/div";
			return driver.findElement(By.xpath(xPath));
	}	
}
