package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestBase;

public class SecondPageObjects extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	public WebElement firstName(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
		return driver.findElement(By.xpath(xPath));
	}	
	
	public WebElement lastName(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
		return driver.findElement(By.xpath(xPath));
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
	
//	public WebElement languageForm(WebDriver driver) {
//		String id = "msdd";
//		return driver.findElement(By.id(id));
//	}	
	
	public WebElement languageForm(WebDriver driver) {
		String xPath = "//*[@id=\"msdd\"]";
		return driver.findElement(By.xpath(xPath));
	}	
	
	public WebElement languageFormOpt(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a";
		return driver.findElement(By.xpath(xPath));
	}	
	
	public WebElement dropDownSkills(WebDriver driver) {
		String id = "Skills";
		return driver.findElement(By.id(id));
	}	
	
	public WebElement dropDownCountry(WebDriver driver) {
		String id = "countries";
		return driver.findElement(By.id(id));
	}
	
	public WebElement dropDownSelectCountry(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement dropDownSelectCountryForm(WebDriver driver) {
		String xPath = "/html/body/span/span/span[1]/input";
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement dropDownYearBox(WebDriver driver) {
		String id = "yearbox";
		return driver.findElement(By.id(id));
		//sel.selectByVisibleText("1986");
	}	
	
	public WebElement dropDownMonthBox(WebDriver driver) {
		String xPath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
		return driver.findElement(By.xpath(xPath));
		//sel.selectByVisibleText("June");
	}
	
	public WebElement dropDownDayBox(WebDriver driver) {
		String xPath = "//*[@id=\"daybox\"]";
		return driver.findElement(By.xpath(xPath));
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
