package Login2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

 

public class popup5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/");
		WebElement ele1=driver.findElement(By.xpath("(//a[.='Downloads'])[1]"));
		WebElement ele2=driver.findElement(By.xpath("(//a[.='Projects'])[1]"));
		WebElement ele3=driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));
		
		Actions q=new Actions(driver);
		Robot r=new Robot();
		q.contextClick(ele1).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		q.contextClick(ele2).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		q.contextClick(ele3).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(3000);
		
		Set<String> allwh=driver.getWindowHandles();
		int count=allwh.size();
				System.out.println(count);
				
				ArrayList<String> l=new ArrayList<String>(allwh);
				String g1=l.get(2);
driver.switchTo().window(g1);					
					
				}
		
 
		

		
	}


