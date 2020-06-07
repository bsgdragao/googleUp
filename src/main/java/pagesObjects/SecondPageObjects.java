package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondPageObjects {
	
	public WebElement firstName(WebDriver driver) {
		String ngModel = "[ng-model*='FirstName']";
		return driver.findElement(By.cssSelector(ngModel));
		//return driver.findElement(By.xpath(placeHolder));
	}	
	
	public WebElement lastName(WebDriver driver) {
		String ngModel = "[ng-model*='LastName']";
		return driver.findElement(By.cssSelector(ngModel));
//		String placeHolder = "//input[@placeholder='Last Name']";
//		return driver.findElement(By.xpath(placeHolder));
	}	
	
	public WebElement adressForm(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement emailAdressForm(WebDriver driver) {
		String xPath = "//*[@id=\"eid\"]/input";
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement phoneForm(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
		return driver.findElement(By.xpath(xPath));
	}
	
	
	public WebElement radioButtonFemale(WebDriver driver) {
		String xPath = "//input[@value='FeMale']";
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement radioButtonMovies(WebDriver driver) {
		String xPath = "//input[@value='Movies']";
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement languageForm(WebDriver driver) {
		String id = "msdd";
		return driver.findElement(By.id(id));
	}	
	
	public WebElement dropDownSkills(WebDriver driver) {
		String id = "Skills";
		return driver.findElement(By.id(id));
		//Para o teste...
		//	Select sel = new Select(dropDownSkills);
		//sel.selectByVisibleText("Java");
	}	
	
	public WebElement dropDownCountry(WebDriver driver) {
		String id = "countries";
		return driver.findElement(By.id(id));
		//Para o teste...
		//	Select sel = new Select(dropDownCountries);
		//sel.selectByVisibleText("Brazil");
	}	
	
	public WebElement dropDownSelectCountry(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
		return driver.findElement(By.xpath(xPath));
		//Select sel = new Select(dropDownCountries);
		//sel.selectByVisibleText("Japan");
	}
	
	public WebElement dropDownYearBox(WebDriver driver) {
		String id = "yearbox";
		return driver.findElement(By.id(id));
		//Para o teste...
		//	Select sel = new Select(dropDownYearBox);
		//sel.selectByVisibleText("1986");
	}	
	
	public WebElement dropDownMonthBox(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
		return driver.findElement(By.xpath(xPath));
		//Select sel = new Select(dropDownMonthBox);
		//sel.selectByVisibleText("June");
	}
	
	public WebElement dropDownDayBox(WebDriver driver) {
		String xPath = "//*[@id=\"daybox\"]";
		return driver.findElement(By.xpath(xPath));
		//Select sel = new Select(dropDownMonthBox);
		//sel.selectByVisibleText("4");
	}
	
	public WebElement firstPasswordForm(WebDriver driver) {
		String id = "firstpassword";
		return driver.findElement(By.id(id));
	}
	
	public WebElement secondPasswordForm(WebDriver driver) {
		String id = "secondpassword";
		return driver.findElement(By.id(id));
	}
	
	public WebElement submitButton(WebDriver driver) {
		String id = "submitbtn";
		return driver.findElement(By.id(id));
	}
}
