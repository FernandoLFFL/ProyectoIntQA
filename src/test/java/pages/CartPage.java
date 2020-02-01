package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import utility.LocatorsRepository;


public class CartPage {
	
	WebDriver driver; 
	
	public CartPage (WebDriver driver) {
		
		this.driver=driver; 
	}
	
	LocatorsRepository locatorsRepository = new LocatorsRepository(); 
	
	public void clickOnItemX(String locator) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();", target);
		actions.moveToElement(target).perform();
		Thread.sleep(1000);
		
	}
	
	public void addToCart(String item) throws InterruptedException {
		
		//Agregar item al carrito
		WebElement add = driver.findElement(By.xpath(item));
		add.click();
		Thread.sleep(2000);
	}
	
	public void checkOut() {
		
		WebElement checkButton= driver.findElement(By.cssSelector(locatorsRepository.getCheckOut())); 
		checkButton.click();
	}
	
	public void verifyCart(){
		
		WebElement dressImage= driver.findElement(By.id(locatorsRepository.getCart())); 
		Assert.assertTrue(dressImage.isDisplayed());
	}
	
	public void verifyItem() {
		
		//Verificar elemento 2 
		WebElement item2=driver.findElement(By.id(locatorsRepository.getProductId())); 
		Assert.assertTrue(item2.isDisplayed());
	}
	
	

}
