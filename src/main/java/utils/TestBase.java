package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
		
		protected static WebDriver driver;

		@BeforeClass
		public static void setUp(){
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Index.html");
			driver.manage().window().maximize();
		}

//		@After
//		public void cleanUp(){
//			driver.manage().deleteAllCookies();
//		}

//		@AfterClass
//		public static void tearDown(){
//			driver.close();
//			driver.quit();
//		}
	}