package script1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import script1.Acti_logout;
import script1.Login_page;
import generic_libararies.Excel_generic;
import generic_libararies.Generic_testng;


public class Test_acti extends Generic_testng
{
	@Test
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 String un=Excel_generic.getdata("Sheet1", 0, 0);
		 String pwd=Excel_generic.getdata("Sheet1", 0, 1);
		 
	Login_page lp=new Login_page(driver);
	lp.sendusn(un);
	Thread.sleep(2000);
	lp.sendpwd(pwd);
	lp.cliclogin();
	
	lp.clickuser();
	
//	Acti_logout lg=new Acti_logout(driver);
//	lg.logout();
//	
	}
		
	
}
