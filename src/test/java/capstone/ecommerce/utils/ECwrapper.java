package capstone.ecommerce.utils;

import org.openqa.selenium.support.PageFactory;

import capstone.ecommerce.pages.LoginPage1;
import capstone.ecommerce.pages.LoginPage2;
import capstone.ecommerce.pages.SignupPage1;
import capstone.ecommerce.pages.SignupPage2;

public class ECwrapper extends SeWrappers
{
	
	// Account Creation with Invalid Data
	public void selection() throws InterruptedException 
	{
	SignupPage1 sign = PageFactory.initElements(driver, SignupPage1.class);
	
	sign.ctrySel();
	sign.greatdeals();
	
	sign.popup();
	sign.myAccount();
	sign.createNew();
	
	sign.setfname("v@v123");
	sign.setlname("P&a21");
	sign.setMail("vIg1!$%@gmail.com");
	sign.setpassword("123123123");
	sign.setRepass("123123123");
	sign.setMobile("7815124sfvh");
	captureScreenshot("IncorrectID's");
	sign.clickAcc();
	sign.returnToPage();
	

	
    }
	
	// Account Creation with Valid Data
	public void signUp1() 
	{
		SignupPage2 sign1 = PageFactory.initElements(driver, SignupPage2.class);
		
		
		sign1.myAccount();
		sign1.createNew();
		
		sign1.setfname1("vignesh");
		sign1.setlname1("P");
		sign1.setMail1("vickyphysics1998@gmail.com");
		sign1.setpassword1("@Vignesh1998");
		sign1.setRepass1("@Vignesh1998");
		sign1.setMobile1("7092909386");
		sign1.clickAcc1(1300);
		sign1.signupCheck();
		captureScreenshot("correctID's");	
		sign1.returnToPage1();
		
		
			
	}
	
	// Account Login with Invalid Data
	public void login1() 
	{
		LoginPage1 log1 = PageFactory.initElements(driver, LoginPage1.class);
		
		log1.ctrySel();
		log1.greatdeals();
	
		log1.popup();		
		
		log1.logAcc();
		log1.signinAcc();
		log1.mailid("Vihhi@mail.com");
		log1.passid("121221");
		log1.accSignin();
		captureScreenshot("IncorrectLoginID's");
		log1.returnToPage();
		
			
	}
	
	// Account Login with Valid Data
	public void login2() 
	{
		LoginPage2 log1 = PageFactory.initElements(driver, LoginPage2.class);
		
		//log1.popup();
		log1.logAcc();
		log1.signinAcc();
		log1.mailid("vickyphysics1998@gmail.com");
		log1.passid("@Vignesh1998");
		log1.accSignin();
		captureScreenshot("correctLoginID's");
		log1.errorSignin();
		log1.returnToPage2();
			
	}
	
	
	
	
	
}
