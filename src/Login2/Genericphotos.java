package Login2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genericphotos {

		// TODO Auto-generated method stub
public static void getphoto(WebDriver driver) throws IOException {
	
String path="./Screenshots/";
Date d= new Date();
String d1=d.toString();
String date=d1.replaceAll(":", "-");

  TakesScreenshot ts = (TakesScreenshot) driver;
 File src= ts.getScreenshotAs(OutputType.FILE);
 File dst=new File (path+date+".jpeg");
 FileUtils.copyFile(src, dst);


	}

}
