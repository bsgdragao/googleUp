package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebElement emailForm(WebDriver driver) {
		String id = "email";
		return driver.findElement(By.id(id));
	}	
	
	public WebElement enterButton(WebDriver driver) {
		String id = "enterimg";
		return driver.findElement(By.id(id));
	}

}
