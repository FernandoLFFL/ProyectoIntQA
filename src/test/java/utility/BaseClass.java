package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
public WebDriver driver; 
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ferna\\Automation\\chromedriver.exe"); 
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
		
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
	}

}
