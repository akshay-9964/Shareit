package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libararies.Action_generic;

public class Flip_Shirt
{

	@FindBy(xpath="(//h1[.='T Shirts']/ancestor::div[4]//img)[5]")
	private WebElement shirt;
	
	public Flip_Shirt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void righclick(WebDriver driver) throws AWTException, InterruptedException
	{
		Action_generic act=new Action_generic(driver, shirt);
		act.RightClick(shirt);
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	
	
}
