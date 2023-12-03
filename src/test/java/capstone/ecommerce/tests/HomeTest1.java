package capstone.ecommerce.tests;

import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class HomeTest1 extends SeWrappers {
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	@Test	
	public void HomepageLinkTest1()
	{
		try {
			report.setTCDesc("Validating the HomePage Links and its Titles ");
			launchBrowser("https://www.bestbuy.com/");			    
			
			
			
			ec.homepageLink1();
			ec.homepageLink2();
			
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating HomePage Links");
	ex.printStackTrace();
}
	
	}
}
