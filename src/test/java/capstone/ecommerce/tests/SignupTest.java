package capstone.ecommerce.tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
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
			
			driver.get("Your page on which links are to be verified");
			// Collect all the links into an element.
			List<WebElement> links = driver.findElements(By.tagName("a"));
			// For each link check repose code is 200.
			for (WebElement link : links) {

			    String value = link.getAttribute("href");
			    // For each link check response code is 200.      
			    URL myurl = new URL(value);        
			    HttpURLConnection connection = (HttpURLConnection) myurl.openConnection();        
			    connection.setRequestMethod("HEAD");         
			    int code = connection.getResponseCode();        
			    Assert.assertEquals(code, 200);

			}
			
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
