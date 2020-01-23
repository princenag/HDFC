package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

	//driver.get("file:///C:/Users/Rajendra Raaj/Desktop/ad1.html");
		driver.get("https://www.google.com/");

WebElement  ele= driver.findElement(By.xpath("//a[@class='gb_g' and @data-pid='2']"));
//String v = ele.getText();   get text method
//System.out.println(v);

String font= ele.getCssValue("font-size");
System.out.println(font);
	}

}
