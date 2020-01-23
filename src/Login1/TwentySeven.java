package Login1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TwentySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/drp.html");
		 WebElement ele = driver.findElement(By.id("iyengar"));
		 Select s=new Select(ele);
		 
List<WebElement>options=s.getOptions();

//for ascending
//TreeSet<String> tr1=new TreeSet<String>();
//for descending
TreeSet<String> tr1=new TreeSet<String>(Collections.reverseOrder());
for(WebElement we: options) {
	String text=we.getText();
	tr1.add(text);
	//System.out.println(text);
	}

for (String t:tr1) {
	System.out.println(t);
	}

}
}