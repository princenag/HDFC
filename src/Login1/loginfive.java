package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	C:\Users\Rajendra Raaj\Desktop\link.html
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

	WebDriver driver=new FirefoxDriver();

driver.get("file:///C:/Users/Rajendra Raaj/Desktop/link.html");

WebElement ele=driver.findElement(By.xpath("//a"));
Thread.sleep(3000);
ele.sendKeys(Keys.ENTER);
	}

}
