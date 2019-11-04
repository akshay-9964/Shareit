package script1;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generic_libararies.Parallel_execution;
import generic_libararies.Webdriver_genric;
import pom.Flip_Shirt;
import pom.Flip_homepage;
import pom.Flip_parti;
import pom.Flip_place;
import pom.Flipkart_login;

public class Test_flip99 extends Parallel_execution
{
	@Test
	public void login_flip() throws InterruptedException, AWTException
	{
		Flipkart_login fp=new Flipkart_login(driver);
		fp.flip_login("akshay.venkatramu@gmail.com","akshay1234");
		
		 Flip_homepage fs=new  Flip_homepage (driver);
		 
		 fs.shirt1(driver);
		
		 Flip_Shirt fl=new Flip_Shirt(driver);
		 fl.righclick(driver);
		 Thread.sleep(3000);
		 
		 Webdriver_genric wg=new Webdriver_genric();
		 wg.all_handles(driver, 1);
		  
		 Flip_parti p=new Flip_parti(driver);
		 p.clixl();
		 
		 Flip_place ft=new Flip_place(driver);
		 ft.plus_click();
		 
		 Thread.sleep(7000);
		 
		 ft.remove1();
		 
		 
		 
		 
	}
}
