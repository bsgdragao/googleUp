package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver = new ChromeDriver();
	
	  public void testSicredi() throws InterruptedException { 
		     
		    try {
		    	driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
		    	Thread.sleep(3000); 
	            
	        } catch (Exception e){
	            e.printStackTrace();
	        }
		}


}
