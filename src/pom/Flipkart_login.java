package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_login
{
	
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwrd;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement login1;
	
	public Flipkart_login(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void flip_login(String uns,String pwd) throws InterruptedException
	{
		username.sendKeys(uns);
		passwrd.sendKeys(pwd);
		Thread.sleep(2000);
		login1.click();
		
		
		
		
		
		
	}
	
	
	
	

	
	
}
