package support;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	@Before  
	public void testSicredi() throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
    	Thread.sleep(3000);
		
    		     
		}


}
