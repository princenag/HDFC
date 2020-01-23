package Login2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testone {

	public static void main(String[] args) throws InterruptedException {
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

	}

}
