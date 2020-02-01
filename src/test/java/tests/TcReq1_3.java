package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultPage;
import utility.BaseClass;

public class TcReq1_3 extends BaseClass{
	
	@Test
	public void searhItem() {
		
		
		HomePage homePage = new HomePage(driver); 
		ResultPage resultPage = new ResultPage(driver);
		
		homePage.searchForItem("skirt");
		resultPage.verifyResult();
		
		
		
	}

}
