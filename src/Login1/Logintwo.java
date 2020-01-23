package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

driver.get("file:///C:/Users/Rajendra Raaj/Desktop/we.html");

WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
boolean b = ele.isEnabled();
System.out.println(b);
if(b)
{
	System.out.println("tbox is enabled");
}
else {
	System.out.println("tbox is  disabled");

}

}
	


	}


