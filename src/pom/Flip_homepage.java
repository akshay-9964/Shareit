package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libararies.Action_generic;

public class Flip_homepage 
{
	
	@FindBy(xpath="//span[.='Men']")
	private WebElement men;
	
	@FindBy(xpath="//a[.='T-Shirts']")
	private WebElement shirt;
	
	public	Flip_homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void shirt1(WebDriver driver) throws InterruptedException
	{
		Action_generic act=new Action_generic(driver, men);
		act.mousehower(men);
		
		Thread.sleep(5000);
		
		shirt.click();
	}
}
