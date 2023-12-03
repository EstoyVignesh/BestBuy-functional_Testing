package capstone.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class MenuBrandsPage extends SeWrappers {
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	public WebElement menu; 
	
	@FindBy(xpath="//button[text()='Brands']")
	public WebElement brand; 
	
	@FindBy(xpath="//a[text()='Samsung']")
	public WebElement sams; 
	
	@FindBy(xpath="//a[text()='Samsung']']")
	public WebElement shop; 
	
	@FindBy(xpath="//button[@class=c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	public WebElement add; 
	
	@FindBy(xpath="//h2[text()='Protect your headphones']']")
	public WebElement cartval; 
	
	
	

	
	public void ctrySel()
	{
		waitForElement(country,20);
		clickElement(country);
	}
	
	
	public void selMenu()
	{
		waitForElement(menu,20);
		clickElement(menu);
	}
	
	public void clicBrand()
	{
		waitForElement(brand,20);
		clickElement(brand);
	}
	
	public void clicSamsung()
	{
		waitForElement(sams,20);
		clickElement(sams);
	}
	
	public void clicShopnow()
	{
		waitForElement(shop,20);
		clickElement(shop);
	}
	
	public void clicCart()
	{
		waitForElement(add,20);
		clickElement(add);
	}
	
	public void cartVald()
	{
		waitForElement(cartval,20);
		if(cartval.getText().equals("Protect your headphones"))
		{
			System.out.println("Test Passed and the Title is Validated");
		}
	}
	
	public void exitExe()
	{
		closeAllBrowsers();
	}
	
}
