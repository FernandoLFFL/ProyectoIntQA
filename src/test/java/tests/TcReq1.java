package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import utility.BaseClass;
import utility.LocatorsRepository;

public class TcReq1 extends BaseClass{
	
	@Test
	public void offerSection() throws InterruptedException {
		
		LocatorsRepository locatorsReposiotry = new LocatorsRepository(); 
		
		HomePage homePage = new HomePage(driver);
		
		//Click sobre la sección de 3 days sale 
		homePage.goToSection(locatorsReposiotry.getOfferSection());
		
	}

}
