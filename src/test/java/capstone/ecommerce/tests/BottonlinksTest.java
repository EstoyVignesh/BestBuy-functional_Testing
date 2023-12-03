package capstone.ecommerce.tests;

import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class BottonlinksTest extends SeWrappers {
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	@Test	
	public void BottLinkTest1()
	{
		try {
			report.setTCDesc("Validating the Bottom Links of Home Page and Validate its Title ");
			launchBrowser("https://www.bestbuy.com/");			    
			
			
			
			ec.bottompageLink();
			
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating Bottom Links");
	ex.printStackTrace();
}
	
	}

}
