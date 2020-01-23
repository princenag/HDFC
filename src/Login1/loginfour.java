package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

driver.get("file:///C:/Users/Rajendra Raaj/Desktop/we.html");

WebElement ele=driver.findElement(By.xpath("//input[1]"));
ele.sendKeys(Keys.CONTROL+"ac");

WebElement ele1=driver.findElement(By.xpath("//input[2]"));
ele1.clear();
ele1.sendKeys(Keys.CONTROL+"v");

	}

}
