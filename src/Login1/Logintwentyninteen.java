package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintwentyninteen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/page1.html");
		 driver.findElement(By.id("t1")).sendKeys("rcb");
		// WebElement f = driver.findElement(By.xpath("//iframe[@id='f1']"));
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("t2")).sendKeys("abc");
		 Thread.sleep(1500);
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("t3")).sendKeys("uvw");
		 Thread.sleep(2000);
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("t2")).sendKeys("123");
		 Thread.sleep(1500);
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("t1")).sendKeys("finish");
		 
		 
		// driver.switchTo().frame("f1");
		// driver.switchTo().frame(f);
		 
	
		// driver.switchTo().defaultContent();
		// driver.findElement(By.id("t1")).sendKeys("123");
		 
	}

}
