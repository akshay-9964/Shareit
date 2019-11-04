package script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page 
{
	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usertbox;
	
	@FindBy(name="pwd")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(xpath="(//img[@class='sizer'])[3]")
	private WebElement user;
	
	

	@FindBy(xpath="(//div[.='User'])[1]")
	private WebElement user1;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusn(String un)
	{
		usertbox.sendKeys(un);
	}
	public void sendpwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void cliclogin()
	{
		login.click();
	}
	public void clickuser()
	{
		user.click();
		
		user1.click();
		
		//WebDriverWait wb=new WebDriverWait(driver, 15);
		
		//wb.until(ExpectedConditions.elementToBeClickable(user1));
		
		
		
		//wb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@class='sizer'])[3]")));
		//System.out.println(user.getText());
		
	}
			
			
}
