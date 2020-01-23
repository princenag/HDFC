package Login1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class logintwentysix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/drp.html");
		 WebElement ele = driver.findElement(By.id("iyengar"));
		 Select s=new Select(ele);
		 
List<WebElement>options=s.getOptions();

ArrayList<String> l=new ArrayList<String>();
for(WebElement we: options) {
	String text=we.getText();
	l.add(text);
	//System.out.println(text);
	}
Collections.sort(l, Collections.reverseOrder());;
for (String t:l) {
	System.out.println(t);
	}

}
}