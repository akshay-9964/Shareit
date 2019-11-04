package generic_libararies;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen_generic
{
	public static void getphoto(WebDriver driver) throws IOException
	{
		String photo="./photos/";
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(photo+date+".jpeg");
		
		FileUtils.copyFile(src, dest);
		
	}
}



