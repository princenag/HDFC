package Login1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class logintwentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/drp.html");
		 WebElement ele = driver.findElement(By.id("mtr"));
		 Select s=new Select(ele);
		 s.selectByIndex(2);
		 s.selectByValue("po");
List<WebElement>options=s.getAllSelectedOptions();
		 
		 int count=options.size();
		 System.out.println(count);
		 
		
		 //toselect all
		 for (int i=0;i<count;i++) {
			 s.selectByIndex(i);
		 }
		 //to deslect all
		 s.deselectAll();
	}

}
