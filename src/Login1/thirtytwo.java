package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class thirtytwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://selenium.dev");
		// driver.findElement(By.id("t1"));
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 
		 Thread.sleep(3000);
		 WebElement ele = driver.findElement(By.xpath("//b[.='MORE NEWS']"));
		 
		Point loc = ele.getLocation();
		
		int c=loc.getX();
		int d=loc.getY();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy("+c+","+d+")");
		

}
}