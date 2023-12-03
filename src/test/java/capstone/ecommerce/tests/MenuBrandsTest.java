package capstone.ecommerce.tests;

import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class MenuBrandsTest extends SeWrappers{
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	@Test	
	public void selectbyBrand()
	{
		try {
			report.setTCDesc("Validating the Brands");
			launchBrowser("https://www.bestbuy.com/");			    
			
			
			
			ec.selBrands();
			
						
		}	
		
		catch(Exception ex)
		{
			System.out.println("Problem while validating Brands Menu");
			ex.printStackTrace();
		}
			
			}
		

}
