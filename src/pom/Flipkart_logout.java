package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libararies.Action_generic;

public class Flipkart_logout
{
	public WebDriver driver;
	
	
	@FindBy(xpath="(//div[.='Akshay'])[3]")
	private WebElement aks;
	
	@FindBy(xpath="//span[.='Logout']")
	private WebElement logout;
	
	
	public Flipkart_logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logout() throws InterruptedException
	{
		Action_generic act=new Action_generic(driver, aks);
		act.mousehower(aks);
		Thread.sleep(3000);
		
		logout.click();
	}
}
