package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultPage;
import utility.BaseClass;
import utility.LocatorsRepository;

public class TcReq1_5 extends BaseClass{
	
	@Test
	public void goToContact() {
		
		LocatorsRepository locatorsRepository = new LocatorsRepository(); 
		
		HomePage homePage = new HomePage(driver); 
		ResultPage resultPage = new ResultPage(driver);
		
		homePage.goToSection(locatorsRepository.getContactButton());
		resultPage.verifyContactPage();
		
	}

}
