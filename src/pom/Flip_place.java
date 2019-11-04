package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Flip_place
{
	@FindBy(xpath="(//button[@class=\"wNrY5O\"])[2]")
	private WebElement plus;
	
	@FindBy(xpath="//a[@class='_325-ji _3ROAwx']")
	private WebElement txt;
	
	@FindBy(xpath="((//div[contains(.,'available')])[12]/ancestor::div[1]//span)[1]")
	private WebElement txt1;
	
	@FindBy(xpath="(//button[@class=\"wNrY5O\"])[1]")
	private WebElement minus;
	
	@FindBy(xpath="//div[.='Remove']")
	private WebElement remove;
	
	@FindBy(xpath="(//div[.='Remove'])[1]")
	private WebElement remove2;
	
	public Flip_place(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void plus_click() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			plus.click();
		}
		Thread.sleep(5000);
		
		System.out.println(txt.getText());
		
		Thread.sleep(5000);
		
		String a = txt1.getText();
		String a1 = a.replaceAll("₹","");
		String a5 = a1.replaceAll(",", "");
		System.out.println(a5);
		
		Thread.sleep(5000);
		for(int i=0;i<3;i++)
		{

			Thread.sleep(2000);
			minus.click();
		}
		
		Thread.sleep(5000);
		String a2 = txt1.getText();
		String a3 = a2.replaceAll("₹","");
		String a4 = a3.replaceAll(",","");
		System.out.println(a4);
		
		int b1 = Integer.parseInt(a5);
		int b2 = Integer.parseInt(a4);
		
		Thread.sleep(4000);
		
		int a0 = b1-b2;
		String b4 = Integer.toString(a0);
		Reporter.log(b4,true);
		
		
	}
	public void remove1()
	{
		remove.click();
		remove2.click();
		
	}
}
