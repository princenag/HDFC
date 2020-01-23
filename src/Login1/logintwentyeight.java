package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintwentyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/page1.html");
		 driver.findElement(By.id("t1")).sendKeys("rcb");
		// WebElement f = driver.findElement(By.xpath("//iframe[@id='f1']"));
		 
		 driver.switchTo().frame(0);
		// driver.switchTo().frame("f1");
		// driver.switchTo().frame(f);
		 
		 driver.findElement(By.id("t2")).sendKeys("abc");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("t1")).sendKeys("123");
		 
		 
		 
	}

}
