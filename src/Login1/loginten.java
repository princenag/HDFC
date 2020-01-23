package Login1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/");
driver.get("https://www.amazon.in/");


//List <WebElement> link= driver.findElements(By.tagName("a"));
//int count=link.size();
//System.out.println(count);


/*List <WebElement> link= driver.findElements(By.tagName("img"));
int count=link.size();
System.out.println(count);*/


/*List <WebElement> link= driver.findElements(By.xpath("//select | //table"));
int count=link.size();
System.out.println(count);*/


/*List <WebElement> link= driver.findElements(By.xpath("//input[@type='radio'] | //input [@type='checkbox']| //a"));
int count=link.size();
System.out.println(count);*/





	}

}
