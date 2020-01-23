package Login2;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class trail1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.flipkart.com/");
 //driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("flipkart");

//Robot b=new Robot();
//b.keyPress(KeyEvent.VK_ENTER);
//b.keyRelease(KeyEvent.VK_ENTER);
//Thread.sleep(2000);

//driver.findElement(By.xpath("(//span[.='Flipkart'])[1]")).click();
driver.findElement(By.xpath("//button[.='✕']")).click();
WebElement ele = driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
Actions a1=new Actions(driver);
a1.moveToElement(ele).perform();
Thread.sleep(2000);
 
driver.findElement(By.xpath("//a[.='Apple']")).click();
String s1= driver.getTitle();
System.out.println(s1);

JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(2000);
  for(int i=0;i<3;i++) {
	  js.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(2000);
  }
  
  driver.findElement(By.xpath("(//img[@class='_2VeolH _3I5S6S'])[9]")).click();
 // Actions a2=new Actions(driver);
  //a2.contextClick(d1).perform();
  
  //Robot r=new Robot();
 // r.keyPress(KeyEvent.VK_T);
 // r.keyRelease(KeyEvent.VK_T);
  
  
  
  
  
  
  
	}
	

}
