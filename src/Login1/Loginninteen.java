package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginninteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/drp.html");
		 WebElement ele = driver.findElement(By.id("mtr"));
		 Select s=new Select(ele);
		 s.selectByIndex(1);
		 s.selectByValue("u");
		 boolean b = s.isMultiple();
		 System.out.println(b);
		 
		 if(b) {
			 s.deselectAll();
			 System.out.println("multi select dropdown");
			 
		 }
		 else {
			 System.out.println("single select dropddown");
		 }
	}

}
