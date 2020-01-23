package Login2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testtwo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
driver.get("https://www.flipkart.com/");

driver.findElement(By.xpath("//button[.='✕']")).click();
Thread.sleep(3000);
WebElement ele=driver.findElement(By.xpath("//span[.='Men']"));

Actions act=new Actions(driver);
act.moveToElement(ele).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
Thread.sleep(2000);  
driver.findElement(By.xpath("//a[contains(.,'Color Block Men Round Neck Green')]")).click();
driver.findElement(By.xpath("//svg[.='ADD TO CART']")).click();

//act.contextClick(c1).perform();
//Thread.sleep(2000);
//Robot r=new Robot();
//r.keyPress(KeyEvent.VK_T);
//r.keyRelease(KeyEvent.VK_T);

	}

}
