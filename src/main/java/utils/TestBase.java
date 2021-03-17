package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class TestBase {
		
		protected static WebDriver driver;

		@BeforeClass
		public static void setUp(){
			//Using mvn WebDriverManager
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
			
			//Using local ChromeWebdriver app
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");       
			driver = new ChromeDriver();
			
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
		}

		@After
		public void cleanUp(){
			driver.manage().deleteAllCookies();
		}

		@AfterClass
		public static void tearDown(){
			driver.close();
			driver.quit();
		}
	}