package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginthirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/page4.html");
		// driver.findElement(By.id("t1"));
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("document.getElementById('t1').value='xyz'");
		 
		// js.executeScript("document.getElementById('t1').value=''");

	}

}
