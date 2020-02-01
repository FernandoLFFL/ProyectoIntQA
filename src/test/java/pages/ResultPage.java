package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utility.LocatorsRepository;

public class ResultPage {

	WebDriver driver; 
	LocatorsRepository locatorsRepository= new LocatorsRepository(); 
	
	public ResultPage (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void verifyResult() {
		
		WebElement image = driver.findElement(By.cssSelector("[src=\"http://automationpractice.com/img/p/8/8-home_default.jpg\"]"));
		Assert.assertTrue(image.isDisplayed());
		
	}
	
	public void verifyContactPage() {
		
		String currentUrl = driver.getCurrentUrl(); 
		System.out.println(currentUrl);
		
		Assert.assertEquals(currentUrl, locatorsRepository.getContactUrl());
		System.out.println("Si es la pagina de contacto");
		
	}
}
