package script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_logout 
{
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	public Acti_logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		logout.click();
	}
}
