package Login2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//button[.='Simple Alert']"));
		ele.click();
		Alert a =driver.switchTo().alert();
				String text = a.getText();
		System.out.println(text);
		a.accept();
		//a.dismiss();

	}

}
