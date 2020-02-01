package tests;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import utility.BaseClass;
import utility.LocatorsRepository;

public class TcReq1_2 extends BaseClass{
	
	
	@Test
	public void addToCart() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver); 
		CartPage cartPage = new CartPage(driver);  
		
		LocatorsRepository locatorsRepository = new LocatorsRepository(); 
		homePage.goToDresses();
		homePage.goToCasualDresses();
		
		cartPage.clickOnItemX(locatorsRepository.getDressContainer());
		cartPage.addToCart(locatorsRepository.getDressButton());
		cartPage.checkOut();
		cartPage.verifyCart();
		
		homePage.goToTshirts();
		cartPage.clickOnItemX(locatorsRepository.gettShirtContainer());
		cartPage.addToCart(locatorsRepository.gettShirtButton());
		cartPage.checkOut();
		cartPage.verifyItem();
		
		
	}
	

}
