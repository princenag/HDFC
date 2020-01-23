package Login2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Rajendra%20Raaj/Desktop/cr.html");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//input[@name='uploadfile']"));
		Thread.sleep(3000);
		ele.sendKeys("C:\\Users\\Rajendra Raaj\\Desktop\\Blr to Jaipur.docx");
		
		
	}

}
