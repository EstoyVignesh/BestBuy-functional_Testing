package capstone.ecommerce.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class SignupTest extends SeWrappers
{
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	@Test
	public void signupTest()
	{
		try {
			report.setTCDesc("Validating the SignUp Page with Incorrect and Correct Data");
			launchBrowser("https://www.bestbuy.com/");
			
			ec.selection();	
			
			ec.signUp1();
				
		
	      }
		
	
	catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
	
}
}
