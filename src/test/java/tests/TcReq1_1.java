package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import utility.BaseClass;
import utility.LocatorsRepository;

public class TcReq1_1 extends BaseClass{

	@Test
	public void coverSection() throws InterruptedException {
		
		LocatorsRepository locatorsReposiotry = new LocatorsRepository(); 
		
		HomePage homePage = new HomePage(driver); 
		
		//Click sobre la foto de portada  
		homePage.goToSection(locatorsReposiotry.getCoverPhoto());
		
	}
}
