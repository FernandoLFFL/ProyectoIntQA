package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.LocatorsRepository;

public class HomePage {

	WebDriver driver; 
	LocatorsRepository locatorsRepository= new LocatorsRepository(); 
	
	public HomePage (WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	//Ir a una sección de la página 
	public void goToSection(String section) {
		
		driver.findElement(By.cssSelector(section)).click(); 
		
	}
	
	//Elegir opción vestidor 
	public void goToDresses() throws InterruptedException {
		
		driver.findElement(By.xpath(locatorsRepository.getLinkDresses())).click(); 
		Thread.sleep(3000);
		
	}
	
	//Seleccionar Vestidos casuales 
	public void goToCasualDresses() {
		
		driver.findElement(By.partialLinkText(locatorsRepository.getLinkCasualDresses())).click(); 
		
	}
	
	//Seleccionar playeras
	public void goToTshirts() {
		driver.findElement(By.xpath(locatorsRepository.getLinkTshirts())).click();
	}
	
	//Buscar articulo 
	public void searchForItem(String item) {
		
		driver.findElement(By.id(locatorsRepository.getTxtSearch())).clear(); 
		driver.findElement(By.id(locatorsRepository.getTxtSearch())).sendKeys(item);
		driver.findElement(By.cssSelector(locatorsRepository.getSearchButton())).click();; 
		
	}
	
	
	
}
