package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flip_parti 
{
	@FindBy(xpath="//a[.='XL']")
	private WebElement shirt;
	
	@FindBy(xpath="//button[contains(.,'CART')]")
	private WebElement cart;
	
	public Flip_parti (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clixl() throws InterruptedException
	{
		shirt.click();
		Thread.sleep(3000);
		cart.click();
	}
}
