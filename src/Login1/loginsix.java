package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginsix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

	driver.get("file:///C:/Users/Rajendra Raaj/Desktop/ad1.html");
WebElement  ele= driver.findElement(By.xpath("//a"));
String v = ele.getAttribute("id");
System.out.println(v);
	}

}
